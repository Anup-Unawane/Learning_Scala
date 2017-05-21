/**
 * Currying is taking a set of arguments and turning them into sequence of functions returning functions.
 * You can convert a function into a currying function by calling curried on that function.
 * Use Funtion.uncurried to uncurry a function.
 * Currying is named after mathematician Haskel Curry.
 */

object Currying extends App{
  val g = (x:Int) => (y:Int) => x + y    //here g is a function which returns a function with returns Int
  
  val f = (x:Int, y:Int) => x + y
  
  val fc = f.curried    //fc and g are the same functions
  
  val fuc = Function.uncurried(fc)
  
  println("fuc(4, 5) : " +fuc(4, 5))
} 

/**
	Sample Output
fuc(4, 5) : 9
*/