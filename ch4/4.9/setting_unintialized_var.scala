//Forgot why we use case class...
//Forgot the meaning of var in case class constructor.
case class Person(var username:String, var password:String){
	var age=0
	var firstName=""
	var lastName=""
	var address=None: Option[Address]
}

case class Address(city:String, state:String, zip:String)

val p=Person("Po-wei", "kelly")
p.address=Some(Address("Talkeetna", "AK", "99676"))

p.address.foreach {
	a =>
	println(a.city)
	println(a.state)
	println(a.zip)
}


