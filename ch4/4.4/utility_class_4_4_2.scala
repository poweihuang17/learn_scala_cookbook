object FileUtils {

	def readFile(filename: String):String= {
		// code here
	"aaa"
	}

	def writeToFile(filename: String, contents: String)=
	{
		//code here
		println(contents)
	}
}

//val utils = new FileUtils 

val content= FileUtils.readFile("input.txt")
FileUtils.writeToFile("output.txt", content)


