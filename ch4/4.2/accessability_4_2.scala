class Person(var name:String)

val p=new Person("Po-wei Huang")

p.name

p.name="Yi-Hsuan Huang"

p.name

class Person2(val name:String)

val p2=new Person2("Po-wei Huang")

p2.name

//p2.name="Yi-Hsuan Huang"

class Person3(name:String)
{
	def getName
	{
	println(name)
	}
}

val p3=new Person3("Po-wei Huang")

p3.getName

//p3.name


class Person4(private var name:String)
{
	def getName
	{
	println(name)
	}
}

//Field without var and val is equal to adding private to val or var?

val p4=new Person4("Po-wei Huang")


case class Person5(name:String)

val p5=Person5("Po-wei Huang")
print(p5.name)


