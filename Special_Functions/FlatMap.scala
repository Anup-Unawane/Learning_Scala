/**
 * FlatMap for Collections is combination of flatten and map.
 * FlatMap can be applied to List, Set, Map, String, Options and Streams 
**/
object FlatMap extends App
{
    //FlatMap on a list
    val a = List(1,2,3,4,5)
    println("a.map(x => List(-x, 0, x)) :" + a.map(x => List(-x, 0, x)))
    println("a.map(x => List(-x, 0, x)).flatten :" + a.map(x => List(-x, 0, x)).flatten)
    println("a.flatMap(x => List(-x, 0, x)) :" + a.flatMap(x => List(-x, 0, x)))
    
    val b:List[List[List[Int]]] = List(
                                     List(List(1,2,3), List(4,5,6)), 
                                     List(List(7,8,9), List(10,11,12)) 
                                    )
    println("List[List[List[Int]]]:" + b)
    
    println("b.flatMap(c => c).flatMap(c => c).flatMap(c => List(-c, c)) ::" + b.flatMap(c => c).flatMap(c => c).flatMap(c => List(-c, c)))
    
    //FlatMap on a set
    val c = Set(2,4,10,11)
    println("c.flatMap(x => Set(x, x*5)) : " + c.flatMap(x => Set(x, x*5)))
    
    //flatMap on a Map
    val d = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
    println("d.flatMap(t => Map(t._1 -> t._2, t._1*100 -> t._2 + \" Hundread\")) :" + 
            d.flatMap(t => Map(t._1 -> t._2, t._1*100 -> (t._2 + " Hundread"))))

    //flatMap on Options
    println("Some(4).flatMap(c => Some(c + 19)) :" + Some(4).flatMap(c => Some(c + 19)))
    
    //if asInstanceOf is not given, scala compiler will throw error as:
    //value + is not a member of Nothing
    println("None.asInstanceOf[Option[Int]].flatMap(c => Some(c + 19)) : " 
             + None.asInstanceOf[Option[Int]].flatMap(c => Some(c + 19)))

    //flatMap with a function returning None
    println("Some(10).flatMap(c => None) :" + Some(10).flatMap(c => None)) 
    
    //flatMap with a list containing various Options
    println("List(Some(4), None, Some(5), None, None, Some(10)).flatMap(c => c) : " 
            + List(Some(4), None, Some(5), None, None, Some(10)).flatMap(c => c)) //This will remove Nones from list
    
}

/**
Sample Output:
a.map(x => List(-x, 0, x)) :List(List(-1, 0, 1), List(-2, 0, 2), List(-3, 0, 3), List(-4, 0, 4), List(-5, 0, 5))
a.map(x => List(-x, 0, x)).flatten :List(-1, 0, 1, -2, 0, 2, -3, 0, 3, -4, 0, 4, -5, 0, 5)
a.flatMap(x => List(-x, 0, x)) :List(-1, 0, 1, -2, 0, 2, -3, 0, 3, -4, 0, 4, -5, 0, 5)
List[List[List[Int]]]:List(List(List(1, 2, 3), List(4, 5, 6)), List(List(7, 8, 9), List(10, 11, 12)))
b.flatMap(c => c).flatMap(c => c).flatMap(c => List(-c, c)) ::List(-1, 1, -2, 2, -3, 3, -4, 4, -5, 5, -6, 6, -7, 7, -8, 8, -9, 9, -10, 10, -11, 11, -12, 12)
c.flatMap(x => Set(x, x*5)) : Set(10, 20, 2, 50, 11, 55, 4)
d.flatMap(t => Map(t._1 -> t._2, t._1*100 -> t._2 + " Hundread")) :Map(1 -> One, 2 -> Two, 3 -> Three, 300 -> Three Hundread, 200 -> Two Hundread, 100 -> One Hundread)
Some(4).flatMap(c => Some(c + 19)) :Some(23)
None.asInstanceOf[Option[Int]].flatMap(c => Some(c + 19)) : None
Some(10).flatMap(c => None) :None
List(Some(4), None, Some(5), None, None, Some(10)).flatMap(c => c) : List(4, 5, 10)
    
    
**/
