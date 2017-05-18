/**
 * Functions are their own objects
 * Methods are not Functions
 * Methods belong to context
 * 
 */
 
object MyObject
{
  val f = (x:Int) => x+1  
  def g(x:Int) = x+1
}

object MethodsOrFunctions extends App   
{
  println("MyObject.f(4) :" + MyObject.f(4))
  println("MyObject.f.apply(4) :" + MyObject.f.apply(4))
  println("MyObject.g(4) :"  + MyObject.g(4))
}

/**
  Sample Output
MyObject.f(4) :5
MyObject.f.apply(4) :5
MyObject.g(4) :5


*/