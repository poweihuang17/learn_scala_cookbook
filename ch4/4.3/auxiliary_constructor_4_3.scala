class Pizza(var crustSize:Int, var crustType:String)
	{
		def this(crustSize: Int){
			this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
		}

		def this(crustType:String){
			this(Pizza.DEFAULT_CRUST_SIZE)
			this.crustType=crustType
		}

		def this(){
			this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
		}

		override def toString=s"A $crustSize inch pizza with a $crustType crust"
	}


object Pizza{

	val DEFAULT_CRUST_SIZE=12
	val DEFAULT_CRUST_TYPE="THIN"
}


val p1= new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
val p2= new Pizza(Pizza.DEFAULT_CRUST_SIZE)
val p3= new Pizza(Pizza.DEFAULT_CRUST_TYPE)
val p4= new Pizza()


