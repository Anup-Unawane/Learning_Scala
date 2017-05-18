/**
 *	 Functions declared with syntax style - 3
 **/

object Functions_3 extends App 
{
	val f1:Int => Int = (x:Int) => x+1

	val f0:() => Int = () => 1

	val f2:(Int, String) => String = (x:Int, y:String) => y + x

		println("f0() :" + f0())
		println("f1(3) :" + f1(3))
		println("f2(3, cool) :" + f2(3, "Cool"))
} 

/**
 Sample Output:

f0() :1
f1(3) :4
f2(3, cool) :Cool3

 */
