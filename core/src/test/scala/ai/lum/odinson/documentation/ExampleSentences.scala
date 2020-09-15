package ai.lum.odinson.documentation

object ExampleSentences {
  val json = Map(
    "alien-species" -> """{"id":"a0c553ad-501c-4567-93c3-6a5101c2f5c4","metadata":[],"sentences":[{"numTokens":29,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["In","addition","there","are","alien","species",",","like","red","foxes",",","feral","cats",",","horses","and","cattle",",","which","have","been","introduced","to","Australia","in","the","last","centuries","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["In","addition","there","are","alien","species",",","like","red","foxes",",","feral","cats",",","horses","and","cattle",",","which","have","been","introduced","to","Australia","in","the","last","centuries","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["IN","NN","EX","VBP","JJ","NNS",",","IN","JJ","NNS",",","JJ","NNS",",","NNS","CC","NNS",",","WDT","VBP","VBN","VBN","TO","NNP","IN","DT","JJ","NNS","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["in","addition","there","be","alien","species",",","like","red","fox",",","feral","cat",",","horse","and","cattle",",","which","have","be","introduce","to","australium","in","the","last","century","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","I-LOC","O","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-PP","B-NP","B-NP","B-VP","B-NP","I-NP","O","B-PP","B-NP","I-NP","O","B-NP","I-NP","O","B-NP","O","B-NP","O","B-NP","B-VP","I-VP","I-VP","B-PP","B-NP","B-PP","B-NP","I-NP","I-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[1,0,"case"],[3,1,"nmod_in"],[3,2,"expl"],[3,5,"nsubj"],[3,9,"nmod_like"],[5,4,"amod"],[9,7,"case"],[9,8,"amod"],[9,12,"appos"],[9,14,"appos"],[9,16,"appos"],[9,18,"ref"],[9,21,"acl:relcl"],[12,11,"amod"],[12,14,"conj_and"],[12,15,"cc"],[12,16,"conj_and"],[21,9,"nsubjpass"],[21,19,"aux"],[21,20,"auxpass"],[21,23,"nmod_to"],[21,27,"nmod_in"],[23,22,"case"],[27,24,"case"],[27,25,"det"],[27,26,"amod"]],"roots":[3]}]}]}""",
    "gummy-bears-consumption" -> """{"id":"48fb577b-f5ba-4e16-864f-f8ba20ba9cfa","metadata":[],"sentences":[{"numTokens":8,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["The","consumption","of","gummy","bears","and","donuts","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["The","consumption","of","gummy","bears","and","donuts","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["DT","NN","IN","NN","NNS","CC","NNS","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["the","consumption","of","gummy","bear","and","donut","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["O","O","O","B-dessert","I-dessert","O","B-dessert","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","I-NP","B-PP","B-NP","I-NP","O","B-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[1,0,"det"],[1,4,"nmod_of"],[1,7,"punct"],[4,2,"case"],[4,3,"compound"],[4,5,"cc"],[4,6,"conj"]],"roots":[1]}]}]}""",
    "becky-gummy-bears-v2" -> """{"id":"56842e05-1628-447a-b440-6be78f669bf2","metadata":[],"sentences":[{"numTokens":5,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Becky","ate","gummy","bears","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Becky","ate","gummy","bears","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["NNP","VBD","JJ","NNS","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["becky","eat","gummy","bear","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["I-PER","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","B-VP","B-NP","I-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[1,0,"nsubj"],[1,3,"dobj"],[1,4,"punct"],[3,2,"amod"]],"roots":[1]}]}]}""",
    // John ate ramen with chopsticks and a spoon. Daisy ate macaroni at her house. Gus's pets include cats, dogs, parakeets, ponies, and unicorns.
    "chopsticks-spoon" -> """{"id":"3c1237c6-01d0-42a4-9459-c84fed223286","metadata":[],"sentences":[{"numTokens":9,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["John","ate","ramen","with","chopsticks","and","a","spoon","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["John","ate","ramen","with","chopsticks","and","a","spoon","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["NNP","VBD","NNS","IN","NNS","CC","DT","NN","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["john","eat","raman","with","chopstick","and","a","spoon","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["I-PER","O","O","O","O","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","B-VP","B-NP","B-PP","B-NP","O","B-NP","I-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[1,0,"nsubj"],[1,2,"dobj"],[1,4,"nmod_with"],[1,8,"punct"],[4,3,"case"],[4,5,"cc"],[4,7,"conj"],[7,6,"det"]],"roots":[1]}]},{"numTokens":7,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Daisy","ate","macaroni","at","her","house","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Daisy","ate","macaroni","at","her","house","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["NNP","VBD","NNS","IN","PRP$","NN","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["daisy","eat","macaroni","at","her","house","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["I-PER","O","O","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","B-VP","B-NP","B-PP","B-NP","I-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[1,0,"nsubj"],[1,5,"nmod_at"],[1,2,"dobj"],[1,6,"punct"],[5,3,"case"],[5,4,"nmod:poss"]],"roots":[1]}]},{"numTokens":15,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Gus","'s","pets","include","cats",",","dogs",",","parakeets",",","ponies",",","and","unicorns","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Gus","'s","pets","include","cats",",","dogs",",","parakeets",",","ponies",",","and","unicorns","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["NNP","POS","NNS","VBP","NNS",",","NNS",",","NNS",",","NNS",",","CC","NNS","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["gus","s","pet","include","cat",",","dog",",","parakeet",",","pony",",","and","unicorn","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["I-LOC","O","O","O","O","O","O","O","O","O","O","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","B-NP","I-NP","B-VP","B-NP","O","B-NP","O","B-NP","O","B-NP","O","O","B-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[0,1,"case"],[2,0,"nmod:poss"],[3,2,"nsubj"],[3,4,"dobj"],[3,6,"dobj"],[3,8,"dobj"],[3,10,"dobj"],[3,13,"dobj"],[3,14,"punct"],[4,5,"punct"],[4,6,"conj"],[4,7,"punct"],[4,8,"conj"],[4,9,"punct"],[4,10,"conj"],[4,11,"punct"],[4,12,"cc"],[4,13,"conj"]],"roots":[3]}]}]}""",
    // Some wild animals such as hedgehogs , coypu , and any wild cloven-footed animals such as deer and zoo animals including elephants can also contract it .
    "hedgehogs-coypy" -> """{"id":"56842e05-1628-447a-b440-6be78f669bf2","metadata":[],"sentences":[{"numTokens":27,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Some","wild","animals","such","as","hedgehogs",",","coypu",",","and","any","wild","cloven-footed","animals","such","as","deer","and","zoo","animals","including","elephants","can","also","contract","it","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Some","wild","animals","such","as","hedgehogs",",","coypu",",","and","any","wild","cloven-footed","animals","such","as","deer","and","zoo","animals","including","elephants","can","also","contract","it","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["DT","JJ","NNS","JJ","IN","NNS",",","NN",",","CC","DT","JJ","JJ","NNS","JJ","IN","NNS","CC","NN","NNS","VBG","NNS","MD","RB","VB","PRP","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["some","wild","animal","such","as","hedgehog",",","coypu",",","and","any","wild","cloven-footed","animal","such","as","deer","and","zoo","animal","include","elephant","can","also","contract","it","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","I-NP","I-NP","B-PP","I-PP","B-NP","O","B-NP","O","O","B-NP","I-NP","I-NP","I-NP","B-PP","I-PP","B-NP","O","B-NP","I-NP","B-PP","B-NP","B-VP","I-VP","I-VP","B-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","roots":[24],"edges":[[2,0,"det"],[2,1,"amod"],[2,5,"nmod_such_as"],[2,7,"nmod_such_as"],[2,13,"nmod_such_as"],[3,4,"mwe"],[5,3,"case"],[5,6,"punct"],[5,7,"conj_and"],[5,8,"punct"],[5,9,"cc"],[5,13,"conj_and"],[13,10,"det"],[13,11,"amod"],[13,12,"amod"],[13,16,"nmod_such_as"],[13,19,"nmod_such_as"],[14,15,"mwe"],[16,14,"case"],[16,17,"cc"],[16,19,"conj_and"],[16,21,"nmod_including"],[19,18,"compound"],[21,20,"case"],[24,2,"nsubj"],[24,22,"aux"],[24,23,"advmod"],[24,25,"dobj"],[24,26,"punct"]]}]}]}""",
    // Some wild animals such as hedgehogs , coypu , and any wild cloven-footed yyymals such as deer and zoo zzzmals including elephants can also contract it .
    "hedgehogs-coypy-2" -> """{"id":"56842e05-1628-447a-b440-6be78f669bf2","metadata":[],"sentences":[{"numTokens":27,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Some","wild","animals","such","as","hedgehogs",",","coypu",",","and","any","wild","cloven-footed","yyymals","such","as","deer","and","zoo","zzzmals","including","elephants","can","also","contract","it","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Some","wild","animals","such","as","hedgehogs",",","coypu",",","and","any","wild","cloven-footed","yyymals","such","as","deer","and","zoo","zzzmals","including","elephants","can","also","contract","it","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["DT","JJ","NNS","JJ","IN","NNS",",","NN",",","CC","DT","JJ","JJ","NNS","JJ","IN","NNS","CC","NN","NNS","VBG","NNS","MD","RB","VB","PRP","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["some","wild","animal","such","as","hedgehog",",","coypu",",","and","any","wild","cloven-footed","yyymal","such","as","deer","and","zoo","zzzmal","include","elephant","can","also","contract","it","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","I-NP","I-NP","B-PP","I-PP","B-NP","O","B-NP","O","O","B-NP","I-NP","I-NP","I-NP","B-PP","I-PP","B-NP","O","B-NP","I-NP","B-PP","B-NP","B-VP","I-VP","I-VP","B-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","roots":[24],"edges":[[2,0,"det"],[2,1,"amod"],[2,5,"nmod_such_as"],[2,7,"nmod_such_as"],[2,13,"nmod_such_as"],[3,4,"mwe"],[5,3,"case"],[5,6,"punct"],[5,7,"conj_and"],[5,8,"punct"],[5,9,"cc"],[5,13,"conj_and"],[13,10,"det"],[13,11,"amod"],[13,12,"amod"],[13,16,"nmod_such_as"],[13,19,"nmod_such_as"],[14,15,"mwe"],[16,14,"case"],[16,17,"cc"],[16,19,"conj_and"],[16,21,"nmod_including"],[19,18,"compound"],[21,20,"case"],[24,2,"nsubj"],[24,22,"aux"],[24,23,"advmod"],[24,25,"dobj"],[24,26,"punct"]]}]}]}""",
    "ninja-turtles" -> "{\"id\":\"d773073c-1d76-446e-b1bc-7a6347516ba3\",\"metadata\":[],\"sentences\":[{\"numTokens\":14,\"fields\":[{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"raw\",\"tokens\":[\"Leonardo\",\"leads\",\",\",\"Donatello\",\"does\",\"machines\",\"(\",\"That\",\"'s\",\"a\",\"fact\",\",\",\"jack\",\"!\"],\"store\":true},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"word\",\"tokens\":[\"Leonardo\",\"leads\",\",\",\"Donatello\",\"does\",\"machines\",\"(\",\"That\",\"'s\",\"a\",\"fact\",\",\",\"jack\",\"!\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"tag\",\"tokens\":[\"NNP\",\"VBZ\",\",\",\"NNP\",\"VBZ\",\"NNS\",\"-LRB-\",\"DT\",\"VBZ\",\"DT\",\"NN\",\",\",\"NN\",\".\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"lemma\",\"tokens\":[\"Leonardo\",\"lead\",\",\",\"Donatello\",\"do\",\"machine\",\"(\",\"that\",\"be\",\"a\",\"fact\",\",\",\"jack\",\"!\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"entity\",\"tokens\":[\"PERSON\",\"O\",\"O\",\"PERSON\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"O\",\"PERSON\",\"O\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"chunk\",\"tokens\":[\"B-NP\",\"B-VP\",\"O\",\"B-NP\",\"B-VP\",\"B-NP\",\"O\",\"B-NP\",\"B-VP\",\"B-NP\",\"I-NP\",\"O\",\"B-NP\",\"O\"]},{\"$type\":\"ai.lum.odinson.GraphField\",\"name\":\"dependencies\",\"edges\":[[1,0,\"nsubj\"],[1,2,\"punct\"],[1,4,\"ccomp\"],[4,3,\"nsubj\"],[4,5,\"dobj\"],[5,10,\"dep\"],[10,6,\"punct\"],[10,7,\"nsubj\"],[10,8,\"cop\"],[10,9,\"det\"],[10,11,\"punct\"],[10,12,\"appos\"],[10,13,\"punct\"]],\"roots\":[1]}]},{\"numTokens\":1,\"fields\":[{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"raw\",\"tokens\":[\")\"],\"store\":true},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"word\",\"tokens\":[\")\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"tag\",\"tokens\":[\"-RRB-\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"lemma\",\"tokens\":[\")\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"entity\",\"tokens\":[\"O\"]},{\"$type\":\"ai.lum.odinson.TokensField\",\"name\":\"chunk\",\"tokens\":[\"O\"]},{\"$type\":\"ai.lum.odinson.GraphField\",\"name\":\"dependencies\",\"edges\":[],\"roots\":[0]}]}]}",
    "becky-gummy-bears" -> """{"id":"56842e05-1628-447a-b440-6be78f669bf2","metadata":[],"sentences":[{"numTokens":5,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Becky","ate","gummy","bears","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Becky","ate","gummy","bears","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["NNP","VBD","JJ","NNS","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["becky","eat","gummy","bear","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["I-PER","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","B-VP","B-NP","I-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[1,0,"nsubj"],[1,3,"dobj"],[1,4,"punct"],[3,2,"amod"]],"roots":[1]}]}]}""",
    "pre-european-diet" -> """{"id":"56842e05-1628-447a-b440-6be78f669bf2","metadata":[],"sentences":[{"numTokens":58,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Much","of","the","diet","in","these","communities","is","made","up","of","food","eaten","long","before","the","Europeans","arrived",":","verdolagas","(","purslane",")","and","other","wild","greens",",","herbs",",","wild","mushrooms","and","berries",",","and","small","animals","such","as","rabbit",",","possum",",","quail",",","badger",",","iguana",",","armadillo","and","a","variety","of","river","fish","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Much","of","the","diet","in","these","communities","is","made","up","of","food","eaten","long","before","the","Europeans","arrived",":","verdolagas","(","purslane",")","and","other","wild","greens",",","herbs",",","wild","mushrooms","and","berries",",","and","small","animals","such","as","rabbit",",","possum",",","quail",",","badger",",","iguana",",","armadillo","and","a","variety","of","river","fish","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["JJ","IN","DT","NN","IN","DT","NNS","VBZ","VBN","RP","IN","NN","VBD","RB","IN","DT","NNPS","VBD",":","NNS","-LRB-","NN","-RRB-","CC","JJ","JJ","NNS",",","NNS",",","JJ","NNS","CC","NNS",",","CC","JJ","NNS","JJ","IN","NN",",","NN",",","NN",",","NN",",","NN",",","NN","CC","DT","NN","IN","NN","NN","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["much","of","the","diet","in","these","community","be","make","up","of","food","eat","long","before","the","Europeans","arrive",":","verdolaga","(","purslane",")","and","other","wild","green",",","herb",",","wild","mushroom","and","berry",",","and","small","animal","such","as","rabbit",",","possum",",","quail",",","badger",",","iguana",",","armadillo","and","a","variety","of","river","fish","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","MISC","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-NP","B-PP","B-NP","I-NP","B-PP","B-NP","I-NP","B-VP","I-VP","B-PRT","B-PP","B-NP","B-VP","B-ADVP","B-PP","B-NP","I-NP","B-VP","O","B-NP","I-NP","I-NP","I-NP","O","B-NP","I-NP","I-NP","I-NP","I-NP","I-NP","I-NP","I-NP","I-NP","I-NP","O","O","B-NP","I-NP","B-PP","I-PP","B-NP","O","B-NP","O","B-NP","O","B-NP","O","B-NP","O","B-NP","O","B-NP","I-NP","B-PP","B-NP","I-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","roots":[8],"edges":[[0,3,"nmod_of"],[3,1,"case"],[3,2,"det"],[3,6,"nmod_in"],[6,4,"case"],[6,5,"det"],[8,0,"nsubjpass"],[8,7,"auxpass"],[8,9,"compound:prt"],[8,11,"nmod_of"],[8,12,"xcomp"],[8,57,"punct"],[11,10,"case"],[12,17,"advcl_before"],[16,15,"det"],[17,13,"advmod"],[17,14,"mark"],[17,16,"nsubj"],[17,18,"punct"],[17,19,"dep"],[17,26,"dep"],[17,37,"dep"],[19,21,"appos"],[19,23,"cc"],[19,26,"conj_and"],[19,28,"conj_and"],[19,31,"conj_and"],[19,33,"conj_and"],[19,34,"punct"],[19,35,"cc"],[19,37,"conj_and"],[21,20,"punct"],[21,22,"punct"],[26,24,"amod"],[26,25,"amod"],[26,27,"punct"],[26,28,"conj_and"],[26,29,"punct"],[26,31,"conj_and"],[26,32,"cc"],[26,33,"conj_and"],[31,30,"amod"],[37,36,"amod"],[37,40,"nmod_such_as"],[37,42,"nmod_such_as"],[37,44,"nmod_such_as"],[37,46,"nmod_such_as"],[37,48,"nmod_such_as"],[37,50,"nmod_such_as"],[37,56,"nmod_such_as"],[38,39,"mwe"],[40,38,"case"],[40,41,"punct"],[40,42,"conj_and"],[40,43,"punct"],[40,44,"conj_and"],[40,45,"punct"],[40,46,"conj_and"],[40,47,"punct"],[40,48,"conj_and"],[40,49,"punct"],[40,50,"conj_and"],[40,51,"cc"],[40,56,"conj_and"],[52,53,"mwe"],[52,54,"mwe"],[56,52,"det:qmod"],[56,55,"compound"]]}]}]}""",
    "bad-character" -> """{"id":"PMC4606401","metadata":[{"$type":"ai.lum.odinson.StringField","name":"pmid","string":"26495279","store":true},{"$type":"ai.lum.odinson.StringField","name":"pmc","string":"4606401","store":true},{"$type":"ai.lum.odinson.StringField","name":"doi","string":"10.1155/2015/493191","store":true},{"$type":"ai.lum.odinson.StringField","name":"title","string":"The Calcium Sensor CBL-CIPK Is Involved in Plant's Response to Abiotic Stresses","store":true},{"$type":"ai.lum.odinson.StringField","name":"authors","string":"S. M. Nuruzzaman Manik\tSujuan Shi\tJingjing Mao\tLianhong Dong\tYulong Su\tQian Wang\tHaobao Liu","store":true},{"$type":"ai.lum.odinson.StringField","name":"pubType","string":"ppub","store":true},{"$type":"ai.lum.odinson.DateField","name":"publicationDate","date":"2015-01-01","store":true}],"sentences":[{"numTokens":33,"fields":[{"$type":"ai.lum.odinson.TokensField","name":"raw","tokens":["Therefore",",","the","CBL1","/","CBL9","-","","CIPK23","complex","can","phosphorylate","and","activate","the","AKT1",",","but","dephosphorylation","by","the","AIP1","may","regulate","the","deactivation","of","the","AKT1","[","56","]","."],"store":true},{"$type":"ai.lum.odinson.TokensField","name":"word","tokens":["Therefore",",","the","CBL1",",","CBL9",",","and","CIPK23","complex","can","phosphorylate","and","activate","the","AKT1",",","but","dephosphorylation","by","the","AIP1","may","regulate","the","deactivation","of","the","AKT1","[","56","]","."]},{"$type":"ai.lum.odinson.TokensField","name":"tag","tokens":["RB",",","DT","NN",",","NN",",","CC","NN","NN","MD","VB","CC","VB","DT","NN",",","CC","NN","IN","DT","NN","MD","VB","DT","NN","IN","DT","NN","-LRB-","CD","-RRB-","."]},{"$type":"ai.lum.odinson.TokensField","name":"lemma","tokens":["therefore",",","the","cbl1",",","cbl9",",","and","cipk23","complex","can","phosphorylate","and","activate","the","akt1",",","but","dephosphorylation","by","the","aip1","may","regulate","the","deactivation","of","the","akt1","[","56","]","."]},{"$type":"ai.lum.odinson.TokensField","name":"entity","tokens":["O","O","O","B-Gene_or_gene_product","O","B-Gene_or_gene_product","O","O","B-Gene_or_gene_product","O","O","O","O","O","O","B-Gene_or_gene_product","O","O","O","O","O","B-Gene_or_gene_product","O","O","O","O","O","O","B-Gene_or_gene_product","O","O","O","O"]},{"$type":"ai.lum.odinson.TokensField","name":"chunk","tokens":["B-ADVP","O","B-NP","I-NP","O","B-NP","O","O","B-NP","I-NP","B-VP","I-VP","I-VP","I-VP","B-NP","I-NP","O","O","B-NP","B-PP","B-NP","I-NP","B-VP","I-VP","B-NP","I-NP","B-PP","B-NP","I-NP","I-NP","I-NP","I-NP","O"]},{"$type":"ai.lum.odinson.GraphField","name":"dependencies","edges":[[11,17,"cc"],[3,2,"det"],[23,22,"aux"],[11,0,"advmod"],[18,21,"nmod_by"],[11,23,"conj_and"],[15,14,"det"],[11,9,"nsubj"],[21,20,"det"],[25,28,"nmod_of"],[11,12,"cc"],[3,5,"conj_and"],[3,9,"conj_and"],[11,3,"nsubj"],[11,15,"dobj"],[11,5,"nsubj"],[23,25,"dobj"],[25,24,"det"],[3,7,"cc"],[11,10,"aux"],[11,13,"conj_and"],[21,19,"case"],[28,26,"case"],[13,3,"nsubj"],[28,30,"nmod"],[23,18,"nsubj"],[9,8,"compound"],[28,27,"det"]],"roots":[11]}]}]}"""
  )
}