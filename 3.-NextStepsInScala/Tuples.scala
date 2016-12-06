/**
	Tuples are immutable like lists but they can contain different types of elements.

	Tuples can not access elements like list. e.g. list(0)
	because Lists apply method will always return a same type while for tuple each element type can be different.
	Also indexes in tuple are 1 based. i.e. starting from 1 while for arrays and lists, index starts from 0
**/

val tuple = (99, "Tuple Demo", 3.14)		// This Tuple is of Type (int, String, Double)
println("First element :" + tuple._1)
println("Second element :" + tuple._2)
println("Thirst element :" + tuple._3)

/**

Sample output

D:\Projects\Scala\Chapter3>scala Tuples.scala
First element :99
Second element :Tuple Demo
Thirst element :3.14

**/
