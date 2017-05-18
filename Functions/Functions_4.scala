/**
 *	 Functions declared with syntax style - 4
 * 		1. Functions are a trait that is instantiated anonymously
 * 		2. apply method in function in not needed to call explicitly
 *    3. Using tuple ,you can return multiple items from a function
 * 
 **/

object Functions_4 extends App 
{
	val f1 = (x:Int) => x+1

	val f0 = () => 1

	val f2 = (x:Int, y:String) => y + x

	//here f3 returns a tuple of 2 elements
	val f3 = (x:String) => (x, x.size)
	
		println("f0() :" + f0())
		println("f1(3) :" + f1(3))
		println("f2(3, cool) :" + f2(3, "Cool"))
		println("f3(\"Spider\") :" + f3("Spider"))
} 

  

/**
 Sample Output:

f0() :1
f1(3) :4
f2(3, cool) :Cool3
f3("Spider") :(Spider,6)

 */
