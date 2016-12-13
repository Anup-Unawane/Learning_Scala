def factorial(n:BigInt):BigInt =
{
	if(n == 0 || n == 1) 1
	else
		n * factorial(n - 1)
}

println("factorial(5) = " + factorial(5))
println("factorial(100) = " + factorial(100))

/**
Sample Output
E:\Courses\scala\scripts>scala Factorial.scala
factorial(5) = 120
factorial(100) = 93326215443944152681699238856266700490715968264381621468592963895217599993229915608941
463976156518286253697920827223758251185210916864000000000000000000000000


**/
