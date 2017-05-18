/**
 *	 Functions declared with syntax style - 2
 **/

object Functions_2 extends App 
{
	val f1:Int => Int = new Function1[Int, Int]
    {
  		def apply(x:Int):Int = x+1
    }    

val f0:() => Int = new Function0[Int]
  {
    def apply() = 1
  }


	val f2:(Int, String) => String = new Function2[Int, String, String]
  {
    def apply(x:Int, y:String) = y + x
  }
	
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
