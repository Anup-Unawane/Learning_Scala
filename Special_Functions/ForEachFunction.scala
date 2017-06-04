/**
    1. foreach is a method that takes a function which takes each element and returns unit
    2. Useful if you want to print to screen
    3. foreach available on List, Range, Set, Map, String, Option, Streams etc.
    4. Difference between map and foreach is map must return something
**/
object ForEachFunction extends App
{
    val a = 1 to 10
    a.foreach( x => println(x))
    
    //above line can be reduced to
/*    a foreach(  println _)
    a foreach println
*/
}

/**
    Sample Output
1  
2  
3  
4  
5  
6  
7  
8  
9  
10 
**/