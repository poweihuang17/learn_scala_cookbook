//What is Option/Some/None pattern?

trait Animal{
	val greeting: Option[String]
	var age:Option[Int]= None
	override def toString=s"I say $greeting, and I'm $age years old."
}

class Dog extends Animal {
	val greeting = Some("Woof")
	age=Some(2)
}

object Test extends App{
	val d=new Dog
	println(d)
}
