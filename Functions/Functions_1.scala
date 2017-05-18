/**
 *	 Functions declared with syntax style - 1
 *	 Here same functions f0, f1, f2 are defined in different style.
 *   Check other file Functions_2.scala, Functions_3.scala, Functions_4.scala	  		 		
 */

object Functions_1 extends App 
{
	val f1:Function1[Int, Int] = new Function1[Int, Int]
    {
  		def apply(x:Int):Int = x+1
    }    

val f0:Function0[Int] = new Function0[Int]
  {
    def apply() = 1
  }


	val f2:Function2[Int, String, String] = new Function2[Int, String, String]
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