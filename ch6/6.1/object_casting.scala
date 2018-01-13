//Use asInstanceOf to do dynamic object casting.
val a = 10
val b = a.asInstanceOf[Long]
val c = a.asInstanceOf[Byte]

//Q: However I don't know what is Object instance.
//For example: Array[Object]

//What to do if we couldn't do dynamic casting?
//Use try/catch expression?
//Any class...?