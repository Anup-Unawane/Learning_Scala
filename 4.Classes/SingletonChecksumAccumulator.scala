/**
	Scala is more object oriented than Java as classes in Scala do not have static members. Instead, Scala has singleton objects.
	A Singleton object looks like class definition, except instead of keyword class, keyword object is used.

	When a singleton object shares the same name with a class, it is called as that class's companion object. Both class and its companion object must be defined in same source file.
	A class and its companion object can access each other's private members.

**/

class ChecksumAccumulator{
	private var sum = 0;

	def add(b:Byte) {sum += b}

	def checkSum() :Int = ~(sum & 0xFF) + 1

}

import scala.collection.mutable.Map;

object ChecksumAccumulator{
	private val cache = Map[String, Int]()

	def calculate(s:String):Int =
	{
		if(cache.contains(s) )
			cache(s)
		else
		{
			val acc = new ChecksumAccumulator
			for(c <- s)
				acc.add(c.toByte)

			val cs = acc.checkSum()
			cache += (s -> cs)
			cs
		}
	}
}

//println(ChecksumAccumulator.calculate("Hello Scala!!!"))
