class Person ( private var _name:String){
	def name=_name
	def name_=(aName:String) {_name=aName}
}

val p = new Person("Po-wei")
p.name= "Kelly"
println(p.name)