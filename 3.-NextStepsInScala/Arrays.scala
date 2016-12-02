/**
	Arrays are mutable objects in scala
*/

//Array Declaration
val greetString = new Array[String](3)

greetString(0) = "Hello"
greetString(1) = ", "
greetString(2) = "Scala"

for(i <- 0 to 2)
	print(greetString(i))

//Above code is semantically equivalent to following code
/*

greetString.update(0,"Hello")	//update method is called to update 0th array index
greetString.update(1 , ", ")
greetString.update(2 , "Scala")

for(i <- 0.to(2))				// to method on object 0 is called with parameter as 2
	print(greetString.apply(i))	// default apply method is called on array with parameter as index

*/

println()

println("Another way to declare Array")

//Another way to declare an array

var greetString2 = Array("Hello", " , ", "SCALA")
/*above line is semantically equivalent to 
var greetString2 = Array.apply("Hello", " , ", "SCALA")*/

greetString2.foreach(greet => print(greet))

/*
	Sample output:
D:\Projects\Scala\Chapter3>scala Arrays.scala
Hello, Scala
Another way to declare Array
Hello , SCALA
*/
