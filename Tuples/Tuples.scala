//Tuples in scala
/**
    1. Tuples are dummy containers
    2. Tuples are Typed
    3. Tuples go all the way to Tuple22
    4. Tuple2 has a swap method
    5. Tuples are immutable
**/
object Tuples extends App
{
    val t = (1, "Cool", 3.14)
    println("First Element:" + t._1)
    println("Second Element:" + t._2)
    println("Third Element:" + t._3)
    println("Complete Tuple:" + t)
    
    val t2:(Int, String, Double) = t
    val t3:Tuple3[Int, String, Double] = t

    case class Department(dept:String)        
    val devtpl = (4, new Department("DEV"))
    println("dev tuple:" + devtpl)
    
    val d2 = devtpl.swap
    println("Swapped Dev Tuple:" + d2)
    
    println("Original Dev Tuple:" + devtpl)
    
}