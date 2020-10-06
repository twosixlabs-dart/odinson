package ai.lum.odinson.state

import java.io.File

import ai.lum.common.ConfigUtils._
import ai.lum.odinson.mention.Mention
import ai.lum.odinson.mention.MentionIterator
import com.typesafe.config.Config

class FileState extends State {

  override def addMentions(mentions: Iterator[Mention]): Unit = ???

  override def getDocIds(docBase: Int, label: String): Array[Int] = ???

  override def getMentions(docBase: Int, docId: Int, label: String): Array[Mention] = ???

  override def getAllMentions(): MentionIterator = ???

  override def clear(): Unit = ???

  override def close(): Unit = {
    ???
  }

}

object FileState {

  def apply(config: Config): FileState = {
    // whether or not to persist the state after the engine is closed
    val saveOnClose = config[Boolean]("state.saveOnClose")
    val saveTo = config.get[File]("state.saveTo")
    new FileState()
  }

}
