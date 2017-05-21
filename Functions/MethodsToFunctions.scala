/**
 * Methods can be converted into functions using partially applied functions
 * Use an '_' to turn method parameters into function parameters
 * If '_' is last character in method parameter, you can remove '_' 
 * 
 * */

class Summer(x:Int)
{
  def addSingleInt(y:Int) = x + y
  
  def addTwoInts(y:Int, z:Int) = x + y + z 
}

class FunctionExecutor(z:Int)
{
    def runSingleParamFn(f:Int => Int) = f(z)
    
    def runTwoParamFn(f:(Int, Int) => Int) = f(z, 10)
}

object MethodsToFunctions extends App 
{
    val x = new Summer(10)
    val singleFn = x.addSingleInt _
    
    println("singleFn.apply(20) : " + singleFn.apply(20))
    println("singleFn(20) : " + singleFn(20))
    
    val z = new FunctionExecutor(20)
    println("z.runSingleParamFn(singleFn) : " + z.runSingleParamFn(singleFn))
    println("z.runSingleParamFn(x.addSingleInt _) :" + z.runSingleParamFn(x.addSingleInt _))   
    println("z.runSingleParamFn(x.addSingleInt) :" + z.runSingleParamFn(x.addSingleInt))   
    
    val f2 = x.addTwoInts(40, _:Int)  //_ means parameter will be provided later
    println("z.runSingleParamFn(f2) : " + z.runSingleParamFn(f2))
    println("z.runTwoParamFn(x.addTwoInts) : " + z.runTwoParamFn(x.addTwoInts))
    
}

/**
 * Sample Output 
singleFn.apply(20) : 30
singleFn(20) : 30
z.runSingleParamFn(singleFn) : 30
z.runSingleParamFn(x.addSingleInt _) :30
z.runSingleParamFn(x.addSingleInt) :30
z.runSingleParamFn(f2) : 70
z.runTwoParamFn(x.addTwoInts) : 40

 */
