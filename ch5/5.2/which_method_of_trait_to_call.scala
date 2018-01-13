//Directly use super will get the last definition made by trait.
trait Human{
	def hello="the Human trait"
}

trait Mother extends Human{
	override def hello="Mother"
}

trait Father extends Human{
	override def hello="Father"
}


class Child extends Human with Mother with Father {

	def printSuper=super.hello
	def printMother=super[Mother].hello
	def printFather=super[Father].hello
	def printHuman=super[Human].hello
}

object Test extends App{
	val c=new Child
	println(c.printSuper)
	println(c.printMother)
	println(c.printFather)
	println(c.printHuman)
}