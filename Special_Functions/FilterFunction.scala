/***
* 1. filter filters out elements that meet predicates criteria
* 2. filterNot filters out elements that do not meed predicates criteria.
* 3. exists tests if something exists in a collection based on a function
* 4. These methods are available on List, Range, Set, Map, String, Option etc.
***/
object FilterFunction extends App
{
    val a = 1 to 10
    
    //filter function
    println("a.filter(x => x % 2 == 0) : " + a.filter(x => x % 2 == 0))  //Filter even numbers
    
    //filterNot function
    println("a.filterNot(x => x % 2 == 0) : " + a.filterNot(x => x % 2 == 0))  //Filter odd numbers

    //exists
    println("a.exists(_ % 2 == 0) : " + a.exists(_ % 2 == 0))       //does a contain even numbers
    
    //filter function using a string
    def filterVowels(s:String) = s.toLowerCase().filter(c => Set('a', 'e', 'i', 'o', 'u').contains(c))
    println("filterVowels(\"Orange\") :" + filterVowels("Orange"))

    //filter function on a set
    val b = Set("Red", "Green", "Purple", "Blue", "Orange");
    
    //filter colours containing no. vowels > 1
    println("b.filter(s => filterVowels(s).size > 1) : " + b.filter(s => filterVowels(s).size > 1))        
    
    //filter function on a map
    val c = Map(1 -> "One", 2 -> "Two", 3 -> "Three", 4 -> "Four")
    println("c.filterKeys( _ % 2 == 0) : " + c.filterKeys( _ % 2 == 0))      //filter even keys
    
    //filter function on Option
    println("Some(5).filter(_ % 2 == 0) : " + Some(5).filter(_ % 2 == 0))
    println("Some(4).filter(_ % 2 == 0) : " + Some(4).filter(_ % 2 == 0))
    
}

/**
    Sample Output
a.filter(x => x % 2 == 0) : Vector(2, 4, 6, 8, 10)
a.filterNot(x => x % 2 == 0) : Vector(1, 3, 5, 7, 9)
a.exists(_ % 2 == 0) : true
filterVowels("Orange") :oae
b.filter(s => filterVowels(s).size > 1) : Set(Blue, Green, Purple, Orange)
c.filterKeys( _ % 2 == 0) : Map(2 -> Two, 4 -> Four)
Some(5).filter(_ % 2 == 0) : None
Some(4).filter(_ % 2 == 0) : Some(4)
**/
