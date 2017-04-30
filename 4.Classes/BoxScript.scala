val intBox = new Box(1)  //Box[Int]
val intBox2 = Box(1)  //Box[Int]
val intBox3 = Box(1):Box[Int]  //Box[Int]
val intResult:Int = intBox3.t

val stringBox = new Box("Scala") //Box[String]
val stringBox2 = Box[String]("Scala") //Box[String]
val mgrBox = Box(new Manager("James", "Gosling", "Programmer", 
                             Department("Java")))   //Box[Manager]
val empBox = Box[Employee](new Manager("James", "Gosling", "Programmer", 
                             Department("Java")))   //Box[Employee]                             
                             
val doubleBoxBox = Box(Box(3.14)) //Box[Box[Double]]
val dbl:Double = doubleBoxBox.t.t
println(dbl)

val intBox4 = Box(200)                         
val cplIntStringBox:Box[Couple[Int, String]] = intBox4.coupleWith("Scala")
println(cplIntStringBox.t.first)
println(cplIntStringBox.t.second)
                         
/** 
    Sample output
scala -nc BoxScript.scala
3.14
200
Scala
*/