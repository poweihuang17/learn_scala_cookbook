abstract class Animal {
	val greeting= "Hello"
	def sayHello{
		println(greeting)
	}
	def run
}

class Dog extends Animal{
	override val greeting = "Woof"
	def run{
		println("Dog is running!")
	}
}

// Q: When should we use () for function?
// Q: When should we don't use () for function?

object Test extends App{
	val dog= new Dog
	println(dog.greeting)
	dog.run
}
