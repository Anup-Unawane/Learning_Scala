/**
1. Named arguments allow calls by method parameter name
2. Names arguments allow calls in any order of parameters
3. Default arguments soecufy default values in method signature
4. If default arguments are difficult to call, use named arguments to assist.
**/

def processNumbers(b:Boolean = false, x:Int, y:Int) :Int = 	if(b) x else y

//Named Arguments
println("processNumbers(x = 10, y = 41, b = true) = " + processNumbers(x = 10, y = 41, b = true))

println("processNumbers(x = 6, y = 9) = " + processNumbers(x = 6, y = 9))

//Default Argument for y
def add(x:Int, y:Int = 5) = x + y

println("add(1, 2) = " + add(1, 2))
println("add(10) = " + add(10))

/***
	SAMPLE OUTPUT

E:\Courses\scala\scripts>scala NamedDefaultArguments.scala
processNumbers(x = 10, y = 41, b = true) = 10
processNumbers(x = 6, y = 9) = 9
add(1, 2) = 3
add(10) = 15

**/
