class Animal(var name:String, var age:Int){
	def this(name:String){
		this(name,0)
	}

	override def toString= s"$name is $age years old"
	println("Base constructor")
}

class Dog(name:String) extends Animal(name){
	println("Dog constructor called")
}


class Dog2(name:String) extends Animal(name, 11){
	println("Dog2 constructor called")
}

object Test extends App{
	val dog1=new Dog("po-wei")

	val dog2=new Dog2("huang")
}

case class Address (city:String, state:String)
case class Role(role:String)

class Person(var name:String, var address:Address){

	def this(name:String){
		this(name,null)
		address=null
	}

}

class Employee(name:String, role:Role, address:Address)
extends Person(name, address){
	def this(name:String){
		this(name, null,null)
	}
	def this(name:String, role:Role){
		this(name,role,null)
	}

	def this(name:String, address:Address){
		this(name,null,address)
	}
}
// Primary constructor of subclass will control what auxiliary construcotr of subclass could go.