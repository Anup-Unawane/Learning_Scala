println("For Loops in scala")

var result = ""

for(a <- 1 to 100)
{
  result = result + a
  if(a < 100)
    result = result + ","
}

println(result)

println("\n\n For Loops in scala for List Operations")
val xs = List(1,2,3,4)
var lsResult = List[Int]()

for(a <- xs)
{
  lsResult = lsResult :+ (a+ 1)
}

println(lsResult)

println("\n\n For Loops in scala for List Operations using yield")
val lsResult2 = for(a <- xs) yield(a + 1)
println(lsResult2)


