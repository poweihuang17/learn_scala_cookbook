//We could use def in abstract class.
//Why do we use def instead of val?

abstract class Pet(name:String){
	def greeting:String
}

class Dog(name:String) extends Pet(name) {
	val greeting="Woof"
}

object Test extends App{
	val dog=new Dog("Apple")
	println(dog.greeting)
}