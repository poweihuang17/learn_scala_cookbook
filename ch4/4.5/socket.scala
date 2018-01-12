class Socket(val timeout:Int =10000)

val s=new Socket

println(s.timeout)

val s2=new Socket(5000)

println(s2.timeout)


class Socket2(val timeout:Int){
	def this()=this(10000)
	override def toString= s"timeout: $timeout"
}

val s3=new Socket2()
println(s3.timeout)
