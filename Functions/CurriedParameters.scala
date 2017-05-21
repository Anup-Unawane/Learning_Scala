

object CurriedParameters  extends App{
  
  def foo(x:Int, y:Int, z:Int) = x + y + z
  
  def bar(x:Int)(y:Int)(z:Int) = x + y + z
  
  def baz(x:Int, y:Int)(z:Int) = x + y + z
  
  val f = foo(5, _:Int, _:Int)    //partially declaring functions 
  
  val b = bar(5) _
  
  println("f(3, 4) : " + f(3, 4))
  println("b(10)(19) : " + (b(10)(19)))
  
}
/**

*  Sample Output

f(3, 4) : 12
b(10)(19) : 34
f(3, 4) : 12
b(10)(19) : 34


*/


/**
	on Scala Console
scala> def foo(x:Int, y:Int, z:Int) = x + y + z
foo: (x: Int, y: Int, z: Int)Int

scala> def bar(x:Int)(y:Int)(z:Int) = x + y + z
bar: (x: Int)(y: Int)(z: Int)Int

scala> def baz(x:Int, y:Int)(z:Int) = x + y + z
baz: (x: Int, y: Int)(z: Int)Int

scala> val f = foo _
f: (Int, Int, Int) => Int = <function3>

scala> val b = bar _
b: Int => (Int => (Int => Int)) = <function1>

scala>  val c = baz _
c: (Int, Int) => Int => Int = <function2>

*/