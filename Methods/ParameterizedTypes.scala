/**
	1. Parameterized types maintain type consitency
	2. use [] for parameterized types instead of <> as in java
	3. Similar to Java Generics and C++ Templates
	4. Prefer single letters like A, B, C, D, E, T
	5. If method called with different types parameters, return type will be their common parent 

**/

def decide[T](b:Boolean, x:T, y:T):T = if(b) x else y			// Here T is Type

println("decide(true, \"A\", \"B\") : " + decide(true, "A", "B") )
println("decide(false, 3, 10) : " + decide(false, 3, 10) )
println("decide(true, 'c', 'd') : " + decide(true, 'c', 'd') )

def getNextChar(c:Char):Char = (c + 1).toChar
println("getNextChar(decide(true, 'a', 'e')) : " +  getNextChar(decide(true, 'a', 'e')))


/**
	Sample output
E:\Courses\scala\scripts>scala ParameretisecTypesMethod.scala
decide(true, "A", "B") : A
decide(false, 3, 10) : 10
decide(true, 'c', 'd') : c
getNextChar(decide(true, 'a', 'e')) : b

**/
