package ai.lum.odinson.extra

import java.io.File

import scala.util.{ Failure, Success, Try }
import com.typesafe.scalalogging.LazyLogging
import com.typesafe.config.{Config, ConfigValueFactory}
import org.clulab.processors.Processor
import org.clulab.processors.clu.CluProcessor
import org.clulab.processors.fastnlp.FastNLPProcessor
import ai.lum.common.FileUtils._
import ai.lum.common.ConfigUtils._
import ai.lum.common.ConfigFactory
import ai.lum.odinson.Document
import ai.lum.odinson.extra.ProcessorsUtils.initializeDyNet


object AnnotateText extends App with LazyLogging {

  var config = ConfigFactory.load()

  if (args.length > 0) {
    val dirPath = args(0)

    val processor = if (args.length == 2) args(1) else config[String]("odinson.extra.processorType")

    logger.info(s"Received dataDir as a parameter <${dirPath}>")
    // receive the path from the arguments
    config = config
      .withValue("odinson.textDir", ConfigValueFactory.fromAnyRef(new File(dirPath, "text").getAbsolutePath))
      // re-compute the index and docs path's
      .withValue(
      "odinson.docsDir",
      ConfigValueFactory.fromAnyRef(new File(dirPath, "docs").getAbsolutePath)
    )
      .withValue(
        "odinson.processorType",
        ConfigValueFactory.fromAnyRef(processor)
      )
  }


  val textDir: File = config[File]("odinson.textDir")
  val docsDir: File = config[File]("odinson.docsDir")
  val processorType = config[String]("odinson.extra.processorType")


  val processor: Processor = processorType match {
    case "FastNLPProcessor" => {
      initializeDyNet()
      new FastNLPProcessor
    }
    case "CluProcessor" => {
      initializeDyNet()
      new CluProcessor
    }
  }

  // create output directory if it does not exist
  if (!docsDir.exists) {
    logger.warn(s"Making directory $docsDir")
    docsDir.mkdirs()
  }

  processor.annotate("this") // load all required models

  def annotateTextFile(f: File): Document = {
    val text = f.readString()
    val doc = processor.annotate(text)
    // use file base name as document id
    doc.id = Some(f.getBaseName())
    ProcessorsUtils.convertDocument(doc)
  }

  // NOTE parses the documents in parallel
  for (f <- textDir.listFilesByWildcard("*.txt", caseInsensitive = true, recursive = true).par) {
    val docFile = new File(docsDir, f.getBaseName() + ".json.gz")

    if (docFile.exists) {
      logger.warn(s"${docFile.getCanonicalPath} already exists")
    } else {
      Try {
        val doc = annotateTextFile(f)
        docFile.writeString(doc.toJson)
      } match {
        case Success(_) =>
          logger.info(s"Annotated ${f.getCanonicalPath}")
        case Failure(e) =>
          logger.error(s"Failed to process ${f.getName}", e)
      }
    }
  }

}
