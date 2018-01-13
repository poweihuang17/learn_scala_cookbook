// Create first val in base class.
// Then, create second val in subclass.

abstract class Animal{

	val greeting = {
		println("Animal")
		"Hello"
	}
}

class Dog extends Animal{

	override val greeting={
		println("Dog")
		"Woof"
	}

}

object Test extends App{
	val dog=new Dog
}

//Use final to prevent override.
abstract class Animal2{

	final val greeting = "Hello"
}

