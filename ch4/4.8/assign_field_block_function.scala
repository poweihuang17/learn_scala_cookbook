class Foo {
	val text = {
		var lines= ""
		try {
			lines= io.Source.fromFile("/etc/passwd").getLines.mkString
		} catch
		{
			case e:Exception => lines="Error happened"
		}
		lines
	} 

	println(text)
}

object Test extends App{
	val f= new Foo
	val g=new Foo2
}

class Foo2{
	import scala.xml.XML
	val xml = XML.load("http://example.com/foo.xml")
	println(xml)
}