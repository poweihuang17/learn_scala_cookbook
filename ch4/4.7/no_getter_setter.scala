
class Stock{
	var delayedPrice: Double=_

	private var currentPrice:Double=_

}


class Stock2{
	private var price:Double= _
	def setPrice(p:Double) {price=p}
	def isHigher(that:Stock2):Boolean=this.price>that.price
}

object Driver extends App{
	val s1= new Stock2()
	s1.setPrice(20)

	val s2=new Stock2()
	s2.setPrice(100)

	println(s2.isHigher(s1))
}