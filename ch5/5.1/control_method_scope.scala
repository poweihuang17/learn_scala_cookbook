//• Object-private scope
//• Private
//• Package
//• Package-specific
//• Public


//Object-private
class Foo{

	private[this] def isFoo=true

	
}

//Private scope
class Goo{
	private def isGoo = true

	def doGoo(other:Goo){
		if(other.isGoo) println("Good")
	}
}

object Test extends App{
	val test= new Goo
	val test2=new Goo
	test.doGoo(test2)
}

//Protected scope
// Similar to C++. Could accessed by subclass, but not classes in the same package just like Java.
class Animal{
	protected def breathe{}
}

class Dog extends Animal{
	breathe
}

//Package scope
package model{

	class Foo{
		private[model] def doX{}
		private def doY{}
	}

	class Bar{
		val f=new Foo
		f.doX
	}
}

//More package-level control
package com.acme.coolapp.model2{

	class Foo{
		protected private[model2] def doX {}
		private[coolapp] def doY{}
		private[acme] def doZ{}
		private[com] def doW{}
	}
}

//Q: What should we do protected and package level? 
//I guess it's just protected private[package-name].



