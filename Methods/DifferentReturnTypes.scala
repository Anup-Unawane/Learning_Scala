/* Here return type is different in if and else blocks
So scala will infer return type as Any.

scala.Any is super class of all types in scala
scala.AnyVal and scala.AnyRef are subclasses of scala.Any

scala.AnyVal is superclass for all primitive types in scala like Byte, Int, Short, Char, Int, Boolean, Double, Float
scala.AnyRef is superclass for all other types. It is analogous to java.lang.Object

 **/

def add(x:Int, y:Int) = if(x > 10) (x+y).toString else x + y

println(add(11 , 2))

/* After printing 123, outer println will print () i.e. Unit. Similar to void in Java.
Unit is subclass of scala.AnyVal  */
println(println(123))

/** 
Sample Output:

E:\Courses\scala\scripts>scala DifferentReturnTypes.scala
13

E:\Courses\scala\scripts>scala
Welcome to Scala 2.11.8 (Java HotSpot(TM) 64-Bit Server VM, Java 1.8.0_92).
Type in expressions for evaluation. Or try :help.

scala> :paste
// Entering paste mode (ctrl-D to finish)

def add(x:Int, y:Int) = if(x > 10) (x+y).toString else x + y

// Exiting paste mode, now interpreting.

add: (x: Int, y: Int)Any

scala> :q
*/
