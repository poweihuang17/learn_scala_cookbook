class Person(var firstName:String, var lastName:String){
	println("The constructor begins:")

	private val HOME=System.getProperty("user.home")
	var age=0

	override def toString=s"$firstName $lastName is $age years old"
	def printHome { println(s"HOME = $HOME") }
	def printFullName { println(this) } // uses toString

	printHome
	printFullName //print toString
	println("Still in the constructor")
}

val person=new Person("Po-wei", "Huang")

//What is auxiliary constructors?