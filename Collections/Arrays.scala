/**
    1. Arrays in scala are converted into primitive arrays in JVM
    2. Behaviour wise arrays are similar to Lists
    3. Arrays are mutable
    4. Variable arguments (var args) use arrays to hold extra parameters
    
**/

object Arrays extends App
{
    val a:Array[Int] = Array(1,2,3,4,5)
    
    println("a.head : " + a.head)
    println("a.tail : " + a.tail)
    println("a.init : " + a.init)
    println("a.last : " + a.last)
    println("a.apply(2) : " + a.apply(2))
    println("a(2) : " + a(2))
    println("a.max : " + a.max)
    println("a.isEmpty : " + a.isEmpty)
    
    def varArgsMethod(x:Int, y:String, z:Any*) = 
    {
        println("z is received as:" + z)
        
        "Parameters received as %d, %s & %s".format(x, y, z.mkString(", "))
    }
    
    println(varArgsMethod(101,"Two", a))
    println(varArgsMethod(102,"Three", "aa", "BB", 12, 34.6))
    println(varArgsMethod(103,"Four", List("CC", "BB", 12, 34.6)))
    println(varArgsMethod(104,"Five", List("EE", "FF", 34, 5.6):_*))    //This will remove List Prefix from mkString
}

/**
    Sample Output
a.head : 1
a.tail : [I@2de23121
a.init : [I@63475ace
a.last : 5
a.apply(2) : 3
a(2) : 3
a.max : 5
a.isEmpty : false
z is received as:WrappedArray([I@65d09a04)
Parameters received as 101, Two & [I@65d09a04
z is received as:WrappedArray(aa, BB, 12, 34.6)
Parameters received as 102, Three & aa, BB, 12, 34.6
z is received as:WrappedArray(List(CC, BB, 12, 34.6))
Parameters received as 103, Four & List(CC, BB, 12, 34.6)
z is received as:List(EE, FF, 34, 5.6)
Parameters received as 104, Five & EE, FF, 34, 5.6

**/