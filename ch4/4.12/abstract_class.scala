//When to use abstract class?
//I don't understand why scala could cooperate with scala in a better way.
//Trait couldn't get constructor argument
//A class could extend only one abstract class. Why?


abstract class BaseController(db:Database){
	def save{db.save}
	def update{db.update}
	def delete{db.delete}

	//abstract
	def connect

	//Abstract
	def getStatus:String

	def setServerName(serverName:String)
}

//So, my question is : how to use abstract class.