case class Person(name:String, relation:String)
case class Company (var name: String)

case class Employee(name:String, loc:String, role:String)

object test extends App{
	val emily=Person("Emily", "niece")
	println(emily.name)
	println(emily)

	val Powei=Company("Po-wei")
	println(Powei.name)
	Powei.name="Apple"
	println(Powei.name)
	println(Powei)

	emily match { case Person(n,r) => println(n,r)}

	val hannah=Person("hannah","niece")
	println(emily==hannah)

	val fred = Employee("Fred", "Anchorge", "Salesman")
	println(fred)
	val joe=fred.copy(name="Joe", role="Mechanic")
	println(joe)
}
//Q: What is javap? I could understand that javac is for compiling scala to java.
//But how about javap?
// "Use apply method in object to remove new.": I still don't understand why do we do this. 
//Define auxiliary constructor for case class: just put this inside companion object.
//What is extractor?
