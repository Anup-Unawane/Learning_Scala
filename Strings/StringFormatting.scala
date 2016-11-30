//Java Style formatting
var str = String.format("This is a %s", "Java Style String formatting")
println(str)

println()

// Scala Style formatting
var str2 = "This is a %s".format("Scala Style String formatting")
println(str2)

println()

//Using positions in formatting
val str3 = "Try Harder for %3$s, %2$s, %1$s".format("thrice", "twice", "once")
println(str3)

import java.time._   //JDK 8 Impoty

println()
//outputting Date
println("Lets eat lunch on %1$te, %1$tB, %1$tY.".format(LocalDate.now))
printf("Lets eat lunch on %1$te, %1$tB, %1$tY.", LocalDate.now)

/**
Sample Output

E:\Courses\scala\scripts>scala StringFormatting.scala
This is a Java Style String formatting

This is a Scala Style String formatting

Try Harder for once, twice, thrice

Lets eat lunch on 1, December, 2016.
Lets eat lunch on 1, December, 2016.
E:\Courses\scala\scripts>

**/
