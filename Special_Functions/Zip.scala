/**
 * Zip intertwines two collections.
 * Zip result will be size of shorter collection.
 * Zip can be performed on Lists, Sets, Maps, String, Options,Streams.
**/
object Zip extends App
{
    val a = List(1,2,3,4)
    val b = List(5,6,7,8)
    println("a zip b : " + (a zip b))
    
    println("(1 to 5) zip (6 to 9) : " + ((1 to 5) zip (6 to 9)))
    println("(1 to 2) zip (6 to 9) : " + ((1 to 2) zip (6 to 9)))
}

/**
Sample output

a zip b : List((1,5), (2,6), (3,7), (4,8))
(1 to 5) zip (6 to 9) : Vector((1,6), (2,7), (3,8), (4,9))
(1 to 2) zip (6 to 9) : Vector((1,6), (2,7))

**/
