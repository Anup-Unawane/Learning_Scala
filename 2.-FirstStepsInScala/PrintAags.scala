// Not a good scala style. Just for Demo purpose
var i = 0
while(i < args.length){
	println(args(i))
	i += 1			// JAVA's ++i and i++ operators DO NOT work in scala
}


/*Sampel Output:

D:\Projects\Scala\Chapter2>scala PrintArgs.scala A B C D 1 2 3
A
B
C
D
1
2
3
*/
