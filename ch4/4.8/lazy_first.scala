class Foo {
	lazy val text = {
		 var lines= io.Source.fromFile("/etc/passwd").getLines.foreach(println)
	}
}

object Test extends App{
	val f= new Foo
	val g= new Goo
}

class Goo {
	lazy val text = {
		var lines= io.Source.fromFile("/etc/passwd").getLines.foreach(println)
	}
}

