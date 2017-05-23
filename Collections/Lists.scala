/**
1. List is companion object
2. List is Immutable object with duplicates allowed, access by index and searchable
3. Nil is an empty list
*/
object Lists extends App
{
    //List Declaration
    val a = List(1,2,3,4,5)
    val a2 = List.apply(1,2,3,4,5)
    val a3 = 1::2::3::4::5::Nil
    
    println("a.head = " + a.head)   //1. First Element
    println("a.tail = " + a.tail)   //2,3,4,5   //All Elements other than first one
    println("a.init = " + a.init)   // All Initial elements except last one
    println("a.last = " + a.last)   //Last Element in list
    
    println("a(3) = " + a(3))       //4th element in list
    println("a.apply(3) = " + a.apply(3))       //4th element in list
    
    println("a.max = " + a.max)
    println("a.min = " + a.min)
    println("a.isEmpty = " + a.isEmpty)
    println("a.nonEmpty = " + a.nonEmpty)
    
    println("a.updated(3,10) = " + a.updated(3,10)) //replace 4th element with 10
    
    println("a.mkString(\",\") = " +  a.mkString(","))
    println("a.mkString(\"**\") = " +  a.mkString("**"))
    println("a.mkString(\"[\",\"**\", \"]\") = " +  a.mkString("[", "**", "]"))
}