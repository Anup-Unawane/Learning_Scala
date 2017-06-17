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
