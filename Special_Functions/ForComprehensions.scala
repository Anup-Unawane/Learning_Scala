/**
 * 1. For Comprehensions are just map, flatMap, filter, withFilter and foreach behind the scenes.
 * 2. They look like for loops but are not.
 * 3. They returns collections like List, Set, Options etc.
 * 4. Any object with map, flatMap, withFilter and foreach can be used in For Comprehensions.
 **/

object ForComprehensions extends App
{
    //Simple for loop
    for(i <- 1 to 10) print(i + " ")
    
    println("")
    
    //for loop with yield on range
    val res1 = for(i <- 1 to 10) yield ( i + 1)
    println("for(i <- 1 to 10) yield ( i + 1) : " + res1)
    
    //using map function on range
    val res2 = (1 to 10).map(i => i+1)
    println("(1 to 10).map(i => i+1) : " + res2)
    
    
    //using for-yield on Options
    val res3 = for(i <- Some(100)) yield (i + 40)
    println("for(i <- Some(100)) yield (i + 40) : " + res3)
    
    //using map function on Options
    val res4  = Some(100).map( i => i + 40)
    println("Some(100).map( i => i + 40) : " + res4)
    
    
    //using for-yield on 2 list at a time
    val res5 = for(i <- 1 to 4;
                   j <- 5 to 8) yield(i,j)
    println("for(i <- 1 to 4; j <- 5 to 8) yield(i,j) : " + res5)
       
    //using map and flatMap functions on 2 lists at a time
    val res6 = (1 to 4).flatMap(i => (5 to 8).map(j => (i,j)))
    println("(1 to 4).flatMap(i => (5 to 8).map(j => (i,j))) : " + res6)
       
       
    //using for-yield on 2 lists with conditions. Using only even numbers in 1st List
    val res7 = for( i <- List(1,2,3,4) 
                    if(i % 2 == 0);
                    j <- List(5,6,7,8)) 
                        yield (i, j) 
    println("for(i <- List(1,2,3,4) if(i % 2 == 0); j <- List(5,6,7,8)) yield (i, j) : " + res7)
    
    val res8 = for(i <- List(1,2,3,4);
                   j <- List(5,6,7,8) 
                    if(j < 7)) yield (i,j)
    println("for(i <- List(1,2,3,4);j <- List(5,6,7,8) if(j < 7)) yield (i,j) : " + res8)
    
    //using filter-flatMap on 2 lists with conditions
    val res9 = List(1,2,3,4)
                .filter(i => i%2 == 0)
                .flatMap(i => List(5,6,7,8).map(j => (i,j)))
    println("List(1,2,3,4).filter(i => i%2 == 0).flatMap(i => List(5,6,7,8).map(j => (i,j))) : " + res9 )
    
    val res10 = List(1,2,3,4)
                 .flatMap( i => List(5,6,7,8)
                    .filter(j => j < 7)
                    .map(j => (i,j)))
    println("List(1,2,3,4).flatMap( i => List(5,6,7,8).filter(j => j < 7).map(j => (i,j))) : " + res10)
    
    //using withFilter-flatMap-map on 2 Lists with conditions
    val res11 = List(1,2,3,4)
                .withFilter(i => i%2 == 0)
                .flatMap(i => List(5,6,7,8).map(j => (i,j)))
    println("List(1,2,3,4).withFilter(i => i%2 == 0).flatMap(i => List(5,6,7,8).map(j => (i,j))) : " + res11 )
    
    val res12 = List(1,2,3,4)
                 .flatMap( i => List(5,6,7,8)
                    .withFilter(j => j < 7)
                    .map(j => (i,j)))
    println("List(1,2,3,4).flatMap( i => List(5,6,7,8).withFilter(j => j < 7).map(j => (i,j))) : " + res12)
}

/**
    Sample Output
    
1 2 3 4 5 6 7 8 9 10
for(i <- 1 to 10) yield ( i + 1) : Vector(2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
(1 to 10).map(i => i+1) : Vector(2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
for(i <- Some(100)) yield (i + 40) : Some(140)
Some(100).map( i => i + 40) : Some(140)
for(i <- 1 to 4; j <- 5 to 8) yield(i,j) : Vector((1,5), (1,6), (1,7), (1,8), (2,5), (2,6), (2,7), (2,8), (3,5), (3,6), (3,7), (3,8), (4,5), (4,6), (4,7), (4,8))
(1 to 4).flatMap(i => (5 to 8).map(j => (i,j))) : Vector((1,5), (1,6), (1,7), (1,8), (2,5), (2,6), (2,7), (2,8), (3,5), (3,6), (3,7), (3,8), (4,5), (4,6), (4,7), (4,8))
for(i <- List(1,2,3,4) if(i % 2 == 0); j <- List(5,6,7,8)) yield (i, j) : List((2,5), (2,6), (2,7), (2,8), (4,5), (4,6), (4,7), (4,8))
for(i <- List(1,2,3,4);j <- List(5,6,7,8) if(j < 7)) yield (i,j) : List((1,5), (1,6), (2,5), (2,6), (3,5), (3,6), (4,5), (4,6))
List(1,2,3,4).filter(i => i%2 == 0).flatMap(i => List(5,6,7,8).map(j => (i,j))) : List((2,5), (2,6), (2,7), (2,8), (4,5), (4,6), (4,7), (4,8))
List(1,2,3,4).flatMap( i => List(5,6,7,8).filter(j => j < 7).map(j => (i,j))) : List((1,5), (1,6), (2,5), (2,6), (3,5), (3,6), (4,5), (4,6))
List(1,2,3,4).withFilter(i => i%2 == 0).flatMap(i => List(5,6,7,8).map(j => (i,j))) : List((2,5), (2,6), (2,7), (2,8), (4,5), (4,6), (4,7), (4,8))
List(1,2,3,4).flatMap( i => List(5,6,7,8).withFilter(j => j < 7).map(j => (i,j))) : List((1,5), (1,6), (2,5), (2,6), (3,5), (3,6), (4,5), (4,6))    
**/
