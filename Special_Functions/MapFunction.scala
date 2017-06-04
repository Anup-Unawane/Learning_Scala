object MapFunction extends App
{
    //Applying map function on a list
    val a = List(1,2,3,4,5,6)
    val f = (x:Int)=> x+1
    
    println("a.map(f) :" + a.map(f))
    println("a.map((x:Int) => x+1) : " + a.map((x:Int) => x+1))
    println("a.map(x => x+1):" + a.map(x => x+1))
    println("a.map(_ + 1):" + a.map(_ + 1))
    println("a.map(1 + _):" + a.map(1 + _))
    
    //This import is required to remove compilation warning as-
    //warning: there was one feature warning; re-run with -feature for details
    import scala.language.postfixOps        
    println("a.map(1+):" + a.map(1+))   //since we have removed _ for 1+ above warning is displayed
    
    //Applying map function on a Set
    var b = Set("Brown", "Red", "Green", "Purple", "Grey", "Yellow")
    println("b.map(x => x.size):" + b.map(x => x.size))     //Remember, Set contains unique values only.
    println("b.map(_.size):" + b.map(_.size))
    println("b.map(x => (x, x.size)): " + b.map(x => (x, x.size)))
    
    //Applying map function on a Map 
    val fifaTeams = Map('Germany -> 4, 'Brazil -> 5 , 'Italy -> 4, 'Argentina -> 2 )
    println("fifaTeams.map(t => (Symbol.apply(\"Team \" + t._1.name), t._2)) : " + fifaTeams.map(t => (Symbol.apply("Team " + t._1.name), t._2)))
    
    //Applying map function on a String
    println("\"Hello!\".map(x => (x+1)).toChar:" + "Hello!".map(x => (x+1).toChar))
    
    //Applying map function on Some
    println("Some(4).map(1+) :" + Some(4).map(1+))
    
    //Applying map function on None
    println("None.asInstanceOf[Option[Int]].map(1+) :" + None.asInstanceOf[Option[Int]].map(1+))
}

/**
    Sample Output
a.map(f) :List(2, 3, 4, 5, 6, 7)
a.map((x:Int) => x+1) : List(2, 3, 4, 5, 6, 7)
a.map(x => x+1):List(2, 3, 4, 5, 6, 7)
a.map(_ + 1):List(2, 3, 4, 5, 6, 7)
a.map(1 + _):List(2, 3, 4, 5, 6, 7)
a.map(1+):List(2, 3, 4, 5, 6, 7)
b.map(x => x.size):Set(6, 3, 5, 4)
b.map(_.size):Set(6, 3, 5, 4)
b.map(x => (x, x.size)): Set((Green,5), (Brown,5), (Red,3), (Yellow,6), (Grey,4), (Purple,6))
fifaTeams.map(t => (Symbol.apply("Team " + t._1.name), t._2)) : Map('Team Germany -> 4, 'Team Brazil -> 5, 'Team Italy -> 4, 'Team Argentina -> 2)
"Hello!".map(x => (x+1)).toChar:Ifmmp"
Some(4).map(1+) :Some(5)
None.asInstanceOf[Option[Int]].map(1+) :None    

**/
