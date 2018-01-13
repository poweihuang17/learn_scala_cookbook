//It seems that we don't need to use () for function invocation.

class FourLeggedAnimal{

	def walk { println("I'm walking.")}
	def run{println("I'm running")}

}

class Dog extends FourLeggedAnimal{

	def walkThenRun{
		super.walk
		super.run
	}
}

object Test extends App{
	val dog= new Dog
	dog.walkThenRun
}


