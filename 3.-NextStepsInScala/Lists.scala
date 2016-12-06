/*Lists are immutable objects in scala. 
	Lists have type as scala.List. This is different from java.util.List as java lists are mutable
	scala.List class does not offer append operation, because time it takes to append to as list grows linerly with size of list 
	whereas prepending with :: takes place in constant time
*/

val oneTwo = List(1, 2)
val threeFour = List(3, 4)

val oneTwoThreeFour = oneTwo ::: threeFour 		// ::: is a method on scala.List for list concatenation

println(""  + oneTwo + " AND "  + threeFour + " Are not changed")
println("New list is generated as::" + oneTwoThreeFour)


val twoThree = List(2, 3)
val oneTwoThree = 1 :: twoThree 			// :: is called as cons operator. It prepends new element to begining of existing list
											// If a method name ends with : , then this method is invoked on right operand

println(oneTwoThree)

//List Operations:

val paramList = List("cool", "tool", "rule")		//creates new list with given values

println("paramList:" + paramList)

val thrill = "will" :: "fill" :: "untill" :: Nil		//creates new list with will, fill, untill. Nil is empty list.

println("thrill:" + thrill)

println("thrill(2) :" + thrill(2))			//returns element at index 2

println("No.of elements in list thrill who has length 4 : " + thrill.count(s => s.length == 4))	//returns count of elements in list having length 4

println("New list after removing first 2 elements:" + thrill.drop(2))	//returns new list with first 2 elements removed

println("New list after removing last 2 elements:" + thrill.dropRight(2)) //returns new list with last 2 elements removed

println("check if untill exists in list:" + thrill.exists(s => s == "untill")) //returns if untill is present in list

println("New list with all strings having length 4:" + thrill.filter(s => s.length == 4))  //returns new list containing all elements having length 4

println ("Checks whether all elements in list end with character l: " + thrill.forall(s => s.endsWith("l")))	//Checks whether all elements in list end with character l

thrill.foreach(s => print(s))		//prints each element in list
thrill.foreach(print)				// same as above. but more consice

println()

println("first element :" + thrill.head)	//gives first element in list

println("LAst element :" + thrill.last)	//gives last element in list

println("All initial elements in list::" + thrill.init) 	//Returns a new list containing all but last element

println("All last elements in list::" + thrill.tail)		   //Returns a new list containing all but first element

println("Is List empty:" + thrill.isEmpty)			//Checks list is empty or not

println("Size of List:" + thrill.length)		//Size of list

println("New list with modification:" + thrill.map(s => s + "y"))		//Appends y to each element in list (for this operation). Actually executes an operation on each element in list & returns resultant elements with new list.

println(" String representation:" + thrill.mkString("~~"))			//Returns a string will all elements in list seperated by given string(here ~~). 

println("List reversal::" + thrill.reverse)				//Reversing list

println("Sorted List:" + thrill.sortWith(_ < _))	//Sorted list


/**Sample Output

D:\Projects\Scala\Chapter3>scala Lists.scala
List(1, 2) AND List(3, 4) Are not changed
New list is generated as::List(1, 2, 3, 4)
List(1, 2, 3)
paramList:List(cool, tool, rule)
thrill:List(will, fill, untill)
thrill(2) :untill
No.of elements in list thrill who has length 4 : 2
New list after removing first 2 elements:List(untill)
New list after removing last 2 elements:List(will)
check if untill exists in list:true
New list with all strings having length 4:List(will, fill)
Checks whether all elements in list end with character l: true
willfilluntillwillfilluntill
first element :will
LAst element :untill
All initial elements in list::List(will, fill)
All last elements in list::List(fill, untill)
Is List empty:false
Size of List:3
New list with modification:List(willy, filly, untilly)
 String representation:will~~fill~~untill
List reversal::List(untill, fill, will)
Sorted List:List(fill, untill, will)

**/
