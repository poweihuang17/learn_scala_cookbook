//To use variable numbers of argument

def printAll(strings:String*){
	strings.foreach(println)
}

printAll()
printAll("foo")
printAll("foo","bar")
printAll("foo","bar","baz")

//Use _* to represent "foreach"
val fruits = List("apple", "banana","cherry")

printAll(fruits:_*)

//* could be supplied with mutiple or 0 arguments.
//* should be the last argument.