class Person2{
	var name= ""
	override def toString=s"name=$name"
}



object Test extends App{
	val p=new Person2
	p.name="Ron Artest"
	println(p)

	//Hidden mutator method
	p.name_$eq("Metta World Peace")
	println(p)
}