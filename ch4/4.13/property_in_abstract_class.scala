// Could implementation has var and abstract has val?
abstract class Pet(name:String){
	val greeting: String
	var age: Int
	def sayHello {println(greeting)}
	override def toString= s"I say $greeting, and I'm $age."
}

class Dog (name:String) extends Pet(name){
	val greeting="Woof"
	var age=2
}

class Cat(name:String) extends Pet(name){
	val greeting="Ha"
	var age=3
}

object AbstractFieldsDemo extends App{
	val dog= new Dog("Po-wei")
	val cat= new Cat("Kelly")

	dog.sayHello
	cat.sayHello



	println(dog)
	println(cat)

	cat.age=10
	println(cat)
}


