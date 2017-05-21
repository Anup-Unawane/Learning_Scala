/***
 * Closures are functions that close around the environment.
 * Closures are used to make up the functions from environment
 * It is good practice to enclose around something stable. e.g. val
 */

class FunctionRunner(x:Int)
{
  def runFunction(y:Int => Int) = y(x)  
}

object Closures extends App{
  val m = 200    //m is an outside variable. If m is of type var, function will change its value
  val f = (x:Int) => x + m  //define function here
  
  val frnr = new FunctionRunner(100)
  println("frnr.runFunction(f): " + frnr.runFunction(f))
  
  // using closure with a variable
  var n = 200
  val f2 = (x:Int) => x + n
  println("frnr.runFunction(f2): " + frnr.runFunction(f2))
  n = 300
  println("After n = 300\nfrnr.runFunction(f2): " + frnr.runFunction(f2))
}

/**
	Sample Output
frnr.runFunction(f): 300
frnr.runFunction(f2): 300
After n = 300
frnr.runFunction(f2): 400

 */
