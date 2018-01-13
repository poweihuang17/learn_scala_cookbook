abstract class Animal {
	var greeting= "Hello"
	var age=0
	override def toString=s"I say $greeting, and I'm $age years old."
}

class Dog extends Animal{
	greeting="Woof"
	age=2
}

