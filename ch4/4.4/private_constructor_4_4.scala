//Need to learn singleton pattern and more design pattern.
//My OOP is really bad.

class Order private{}

class Person private (name:String){}


//val p = new Person( "Mercedes")

class Brain private{
	override def toString= "This is the brain."
}

object Brain {

	val brain = new Brain
	def getInstance= brain
}

val brain=Brain.getInstance
println(brain)

