case class Person(var name:String, var age:Int)

val p=Person("John Smith", 30)

val p2=Person.apply("Po-wei Huang", 50)

println(p2.name)


object Person {
	def apply()=new Person("<no name>" , 0)

	def apply(name:String)= new Person(name, 0)
}

val p3=Person()

println(p3.name)

val p4=Person("Po-wei Huang")
println(p3.age)


val a = Person() // corresponds to apply()
val b = Person("Pam") // corresponds to apply(name: String) 
val c = Person("William Shatner", 82)
println(a)
println(b)
println(c)
// verify the setter methods work
a.name = "Leonard Nimoy" 
a.age = 82
println(a)





