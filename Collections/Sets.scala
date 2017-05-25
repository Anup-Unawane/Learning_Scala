/*
    1. Set is a companion object.
    2. Set is Immutable object with duplicates not allowed, searchable
*/

object Sets extends App
{
    val set = Set.apply(1,2,3,4)
    val set2 = Set(1,2,3,4,5)      //You can not create a set using new because trait Set is abstract; cannot be instantiated
    val set3 = Set(1,2,4,3,4,5)
    val set4 = Set(1,2,3,4,5,6,6,7)
    val set5 = Set(1,2) 
    
    println("set: " + set)
    println("set2: " + set2)
    println("set3: " + set3)
    println("set4: " + set4)
    
    //Set Operations
    println("set diff set4 : " + set.diff(set4))            //empty set
    println("set4.diff(set) :" + set4.diff(set))            //Set(5,6,7)
    println("set union set3 :" + set.union(set3))           //Set(1,2,3,4,5)
    println("set intersect set3 : " + set.intersect(set3))  //Set(1,2,3,4)
    println("set5 intersect set4 : " + set5.intersect(set4))//Set(1,2)

    //Set Union using ++
    println("set ++ set2 : " + (set ++ set2))    //Set(1,2,3,4,5)
    
    //Adding elements from another List to Set
    println("set ++ List(15,19,20) : " + (set ++ List(15,19,20)))    //Set(1,2,3,4,15,19,20)
    
    println("set -- set5 : " + (set -- set5)) //Set subtraction
    println("set - 3 : " + (set - 3))         //remove element 3 from set
    
    //Check if an element is present in set
    println("set.apply(4) : " + set.apply(4))
    println("set.apply(10) : " + set.apply(10))         //apply method is mapped to contains method in set
    println("set.contains(10) : " + set.contains(10))
}

/**
    Sample Output
set: Set(1, 2, 3, 4)
set2: Set(5, 1, 2, 3, 4)
set3: Set(5, 1, 2, 3, 4)
set4: Set(5, 1, 6, 2, 7, 3, 4)
set diff set4 : Set()
set4.diff(set) :Set(5, 6, 7)
set union set3 :Set(5, 1, 2, 3, 4)
set intersect set3 : Set(1, 2, 3, 4)
set5 intersect set4 : Set(1, 2)
set ++ set2 : Set(5, 1, 2, 3, 4)
set ++ List(15,19,20) : Set(20, 1, 2, 3, 19, 4, 15)
set -- set5 : Set(3, 4)
set - 3 : Set(1, 2, 4)
set.apply(4) : true
set.apply(10) : false
set.contains(10) : false

**/
