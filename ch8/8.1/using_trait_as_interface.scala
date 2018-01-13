trait BaseSoundPlayer{
	def play:String
	def close:String
	def pause:Int
	def stop:Int
	def resume:Int
}

//Unless the class implementing a trait is abstract,
//it must implement of the methods in traits.

abstract class Simpleplayer extends BaseSoundPlayer{
	def play={"aaa"}
	def close={"bbb"}
}

class MP3 extends BaseSoundPlayer{
	def play={"3"}
	def close={"2"}
	def pause=44
	def stop=5
	def resume=6
}
//Why should we have to assign type in trait?
//Shouldn't they just directly inference it?

val mp3=new MP3
println(mp3.play)