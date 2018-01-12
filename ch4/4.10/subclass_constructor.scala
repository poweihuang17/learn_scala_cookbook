class Person(var name:String, var address:Address)
	{
		override def toString= if(address == null) name else s"$name @ $address"
	}


class Employee(name: String, address:Address, var age:Int)
 extends Person(name, address)
 {
 	println(age)
 }

object Test extends App {
	val e=new Employee("abc", Address("Louisville", "KY"), 31)
	val teresa =new Employee("abc",Address("Louisville", "KY"), 25)

	println(teresa.name)
	println(teresa.address)
	println(teresa)
	println(teresa.age)
}

case class Address(city:String, state:String)



