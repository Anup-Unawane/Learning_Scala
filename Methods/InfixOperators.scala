class Foo(x:Int)
{
    def bar(y:Int) = x + y
    def baz(a:Int, b:Int) = x + a + b
    def bab(y:Int) = new Foo(x + y)
    def qux(y:Int) = new Foo(x + y)

}

object InfixOperatorRunner extends App
{
    val foo = new Foo(10)
    println("foo.bar(5) = " + foo.bar(5))
    println("foo bar 5 = " + (foo bar 5 ))
    println("foo.baz(10, 14) = " + foo.baz(10, 14))
    println("foo baz (10, 14) = " + (foo baz (10, 14)))
    
    //infix operators are similar to mathematical operators in scala 
    //e.g.consider following examples
    println("3.+(10) = " + (3.+(10)))
    println("foo bar 4 + 19 = " + ((foo bar 4) + 19))
    
    //chaining of infix operators
//    println(foo bab 4 bab 10 bab 19 bab (100 + 20) bar 40 + 300)
    println(foo qux 4 qux 10 qux 19 qux (100 + 19) bar 40 + 300)
}

/**
    Sample Output
> scalac InfixOperators.scala

> scala InfixOperatorRunner
foo.bar(5) = 15
foo bar 5 = 15
foo.baz(10, 14) = 34
foo baz (10, 14) = 34
3.+(10) = 13
foo bar 4 + 19 = 33
502
**/