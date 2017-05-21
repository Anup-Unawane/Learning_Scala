/**
 * Functions can take other functions as parameter, which are called as Higher Order Functions.
 * Higher order function term is also used describe methods taking another function as parameter.
 * Functions can also return functions and these are used for applying functions in parts. 
 */

object FunctionsWithFunctions extends App
{
  //Function accepting another function as parameter
  val f = (x: Int, y:Int => Int) => y(x)  
  
  //all below lines are functionally similar
  
  println("1. f(3, (m:Int) => m +1 : " + f(3, (m:Int) => m +1 )) //(m:Int) => m +1 ) is input function to function f
  
  println("2. f(3, m => m +1 : " + f(3, m => m +1 )) //m:Int can be replaced using m
  
  println("3. f(3, _ +1 : " + f(3, _ +1 )) //m can be replaced using '_'
  
  println("4. f(3, 1 +  : " + f(3, 1 +  )) // _ + 1 can be represented as 1 + _. Since '_' is last parameter,
                                           // we can remove it and keep only "1 +" 

  //Function returning another function
  val g = (x:Int) => (y:Int) => x + y     //here f is a function that returns another function
  println("g.apply(4).apply(5) : " + g.apply(4).apply(5))
  println("g(4)(5) : " + g(4)(5))
}

/**
	Sample Output
1. f(3, (m:Int) => m +1 : 4
2. f(3, m => m +1 : 4
3. f(3, _ +1 : 4
4. f(3, 1 +  : 4
g.apply(4).apply(5) : 9
g(4)(5) : 9
 */
