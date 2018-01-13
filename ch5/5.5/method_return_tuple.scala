//What is a makeshift class?

def getStockInfo ={

	("NFLX",100.00, 101.00) //this is a Tuple3

}

val (symbol, currentPrice, bidPrice)=getStockInfo

val result=getStockInfo

println(result._1)
println(result._2)
