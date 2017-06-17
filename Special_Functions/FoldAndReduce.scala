/**
 * foldLeft and foldRight will perform a reduction operation with a seed value.
 * reduceLeft and reduceRight will perform a reduction operation without a seed value. 
 * Fold and Reduce operations can be applied to List, Set, String, Map, Stream and Options.
 **/
object FoldAndReduce extends App
{
    //using foldLeft
    val foldLeftRes = (1 to 10).foldLeft(0){(total:Int, next:Int) => 
                                              println(s"Total: $total, Next:$next")
                                              total + next}
    println("foldLeftRes: " + foldLeftRes + "\n\n")
    
    //using reduceLeft
    val reduceLeftRes = (1 to 10).reduceLeft{(total:Int, next:Int) => 
                                              println(s"Total: $total, Next:$next")
                                              total + next}
    println("reduceLeftRes: " + reduceLeftRes + "\n\n")
    
    //using foldRight
    val foldRightRes = (1 to 10).foldRight(0){(next:Int, total:Int ) => 
                                              println(s"Total: $total, Next:$next")
                                              total + next}
    println("foldRightRes: " + foldRightRes + "\n\n")
    
    //using reduceRight
    val reduceRightRes = (1 to 10).reduceRight{(next:Int, total:Int ) => 
                                              println(s"Total: $total, Next:$next")
                                              total + next}
    println("reduceRightRes: " + reduceRightRes + "\n\n")

    //alternatives for above functionalities
    println("(1 to 10).sum : " + (1 to 10).sum)
    println("(1 to 10).product : " + (1 to 10).product)
    
    //shorthand notation for foldLeft example
    println("(1 to 10).foldLeft(0)(_ + _) : " + (1 to 10).foldLeft(0)(_ + _))
    println("(1 to 10).mkString(\",\") : " + (1 to 10).mkString(","))
}

/***
    Sample Output
Total: 0, Next:1
Total: 1, Next:2
Total: 3, Next:3
Total: 6, Next:4
Total: 10, Next:5
Total: 15, Next:6
Total: 21, Next:7
Total: 28, Next:8
Total: 36, Next:9
Total: 45, Next:10
foldLeftRes: 55


Total: 1, Next:2
Total: 3, Next:3
Total: 6, Next:4
Total: 10, Next:5
Total: 15, Next:6
Total: 21, Next:7
Total: 28, Next:8
Total: 36, Next:9
Total: 45, Next:10
reduceLeftRes: 55


Total: 0, Next:10
Total: 10, Next:9
Total: 19, Next:8
Total: 27, Next:7
Total: 34, Next:6
Total: 40, Next:5
Total: 45, Next:4
Total: 49, Next:3
Total: 52, Next:2
Total: 54, Next:1
foldRightRes: 55


Total: 10, Next:9
Total: 19, Next:8
Total: 27, Next:7
Total: 34, Next:6
Total: 40, Next:5
Total: 45, Next:4
Total: 49, Next:3
Total: 52, Next:2
Total: 54, Next:1
reduceRightRes: 55


(1 to 10).sum : 55
(1 to 10).product : 3628800
(1 to 10).foldLeft(0)(_ + _) : 55
(1 to 10).mkString(",") : 1,2,3,4,5,6,7,8,9,10

**/
