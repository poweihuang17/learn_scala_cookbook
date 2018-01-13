abstract class Animal{
	def speak
}

trait WagginTail{
	def startTail{println("tail started")}
	def stopTail {println("tail ended")}
}

trait FourLeggedAnimal{
	def walk
	def run
}

class Dog extends Animal with WagginTail with FourLeggedAnimal{
	def speak{println("Dog says 'woof'")}
	def walk{println("Dog is walking")}
	def run{println("Dog is running")}
}
class Pig{}

val f= new Pig with WagginTail
f.startTail
f.stopTail

//Could we inherit multiple classes in scala?