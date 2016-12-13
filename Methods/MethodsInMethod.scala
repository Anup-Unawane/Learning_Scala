/***
	Methods can be hidden inside another method.
	Inner methods does not interact with outside world.
	Outside method has exclusive access to inner method.
**/

import scala.annotation.tailrec

def factorial(n:BigInt) = {

	@tailrec
	def fact(n:BigInt, acc:BigInt):BigInt =
	{
		if(n == 1 || n == 1 ) acc
		else fact(n - 1, acc * n)
	}

	fact(n , 1)
}

println("\n5! = " + factorial(5))
println("\n100! = " + factorial(100))

/**  SAMPLE OUTPUT

5! = 120

100! = 933262154439441526816992388562667004907159682643816214685929638952175999932299156089414639761
56518286253697920827223758251185210916864000000000000000000000000

 **/
