/***
    1. Maps store Key-Value Pairs
    2. Internally maps are collection of tuples and can be operated as such
    3. Symbols are like Strings but guaranteed to be Interned, perfect for Maps
**/
object Maps extends App
{
    //Map can be created using tuples
    val m = Map.apply((1, "One"), (2, "Two"), (3, "Three"))
    println("m : " + m)
    val m2 = Map((1, "One"), (2, "Two"), (3, "Three"))
    
    //declaring tuple using -> operator
    val tuple:(Int, String) = 3 -> "Three"
    println(tuple)
    
    //declaring map using tuples with -> operator
    val m3 = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
    println("m3 : " + m3)
    
    println(m3.get(1))      //Some("One"). get method returns option
    println(m3.apply(1))    //"One"
    println(m3(1))          //"One"
    println(m3.get(4))      //None
    //println(m3(4))          //throws NoSuchElementException

    println("m3.toList : " + m3.toList)
    println("m3.keys : " + m3.keys)
    println("m3.keySet : " + m3.keySet)
    println("m3.values.toSet : " + m3.values.toSet) //m3.values return MapLike.
    
    val m4 = Map("One"->1, "Two"->2, "Three"->3)
    println("m4 : " + m4)
    println("m4(\"Two\") : " + m4("Two"))

    // we can use Also Symbol as a key inside Map
    val sym = Symbol("Co")
    val sym2 = 'Co
    println("sym == sym2 :" + (sym == sym2))
    println("sym eq sym2 :" + (sym eq sym2))
    
    val elements:Map[Symbol, String] = Map('Co -> "Cobalt", 'H -> "Hydrogen", 'Pb -> "Lead")
    println("elements('Co) :" + elements('Co))
 
    println("elements - 'H : " + elements - 'H)
 
}

/**
Sample Output
m : Map(1 -> One, 2 -> Two, 3 -> Three)
(3,Three)
m3 : Map(1 -> One, 2 -> Two, 3 -> Three)
Some(One)
One
One
None
m3.toList : List((1,One), (2,Two), (3,Three))
m3.keys : Set(1, 2, 3)
m3.keySet : Set(1, 2, 3)
m3.values.toSet : Set(One, Two, Three)
m4 : Map(One -> 1, Two -> 2, Three -> 3)
m4("Two") : 2
sym == sym2 :true
sym eq sym2 :true
elements('Co) :Cobalt

**/
