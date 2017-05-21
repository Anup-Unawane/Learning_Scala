/**
 * By Name parameters are parameters that can be called by block and lazily evaluated.
 * By Name parameters are excellent for catching exception and cleaning up resources after you have done.
 */

object ByNameParameters extends App
{
  def byValue(x:Int)(y:Int) = {println("By Value:"); x + y}
  
  def byFunction(x:Int)(y: () => Int) = {println("By Function:"); x + y()}
  
  def byName(x:Int)(y: => Int) = {println("By Name:"); x + y}
  
  val a = byValue(3){
                      println("In ByValue call..");
                      19
                    }    //this function will be evaluated first
  
  val b = byFunction(3)(() => {println("In ByFunction Call.."); 19}) // This line will be evaluated lazily. after call to byFunction
  
  val c = byName(3){
                    println("In ByName call...");
                    19
                  }  //This line will be evaluated lazily.
  
   def divideSafely(f: =>Int):Option[Int] = {
      try
      {
        Some(f)
      }catch
      {
        case ae: ArithmeticException => None
      }
    
  } 
  
  val d = divideSafely(
      {
        val x = 10
        val y = 5
        x / y
        
      })
  
  println("d = " + d)

  val e = divideSafely(
      {
        val x = 10
        val y = 0
        x / y
        
      })
  
  println("e = " + e)
 
  
}

/*
Sample Output

In ByValue call..
By Value:
By Function:
In ByFunction Call..
By Name:
In ByName call...
d = Some(2)
e = None

*/