/**
	Reasons to include return types-
	1. Make intentions clear
	2. Type inferencer inferred wrong type
	3. Method will be called recursively
	4. Method is overloaded
*/
def add(x:Int, y:Int):Int =
{
	return x + y
}

def subtract(x:Int, y:Int) = x-y

println("5 + 2 = " + add(5,2))

println("8 - 3 = " + subtract(8, 3))

def numberStatus(a:Int) =
	if(a < 10) "Less than 10"
	else if (a > 10) "Greater than 10"
	else "Equal to 10!!"

println(numberStatus(9))

/**
Sample output
E:\Courses\scala\scripts>scala BasicMethods.scala
5 + 2 = 7
8 - 3 = 5
Less than 10
*/
