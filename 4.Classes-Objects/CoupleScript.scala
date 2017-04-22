val cplIntString = new Couple(10, "Scala")  //Couple[Int, String]
val cplIntString2:Couple[Int, String] = Couple(11, "Java")  //Couple[Int, String]
val cplStringString = Couple("Scala", "Java")   //Couple[String, String]
val cplDoubleInt = Couple(3.14, 100)    //Couple[Double, Int]
val cplStringCplIntDouble = Couple("Scala", Couple(12, 3.14))   //Couple[String, Couple[Int, Double]]

println("Pi value is: " + cplStringCplIntDouble.second.second)

val empCpl = Couple(new Employee("Johnny", "English"), new Employee("James", "Bond"))
println(empCpl)
println(empCpl.swap)

/**
    Sample Output 
scala -nc CoupleScript.scala
Pi value is: 3.14
Couple(Employee(Johnny, English, Programmer),Employee(James, Bond, Programmer))
Couple(Employee(James, Bond, Programmer),Employee(Johnny, English, Programmer))
*/
