/**
	1. isInstanceOf will return boolean if object is instance of a type
	2. asInstanceOf will cast object to a certain type if that object is convertible to that type
	3. Wrong use of asInstanceOf will result in ClassCastException

**/



val str:Any = "isInstanceOf Demo"
println("Is str String::" + str.isInstanceOf[String])
println("Is str Int::" + str.isInstanceOf[Int])
println("Is str CharSequence::" + str.isInstanceOf[CharSequence])
println("Is str AnyRef::" + str.isInstanceOf[AnyRef])
println("Is str Any::" + str.isInstanceOf[Any])
println("Is str java.lang.Object::" + str.isInstanceOf[Object])

val h:String = str.asInstanceOf[String]
println("h =" + h)

def decide(x:Any):Int = if(x.isInstanceOf[Int]) x.asInstanceOf[Int] + 2 else -1

println("decide(4):" + decide(4))
println("decide(\"ABC\"):" + decide("ABC"))

def decideBadly(x:Any):Int = x.asInstanceOf[Int] + 10
println("decideBadly(4):" + decideBadly(4))		
println("decideBadly(\"ABC\"):" + decideBadly("ABC"))		//This will throw ClassCastException



/**
Sample Output

E:\Courses\scala\scripts>scala IsAndAsInstanceOf.scala
Is str String::true
Is str Int::false
Is str CharSequence::true
Is str AnyRef::true
Is str Any::true
Is str java.lang.Object::true
h =isInstanceOf Demo
decide(4):6
decide("ABC"):-1
decideBadly(4):14
java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
        at scala.runtime.BoxesRunTime.unboxToInt(BoxesRunTime.java:101)
        at Main$$anon$1.decideBadly(IsAndAsInstanceOf.scala:17)
        at Main$$anon$1.<init>(IsAndAsInstanceOf.scala:19)
        at Main$.main(IsAndAsInstanceOf.scala:1)
        at Main.main(IsAndAsInstanceOf.scala)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at scala.reflect.internal.util.ScalaClassLoader$$anonfun$run$1.apply(ScalaClassLoader.scala:
70)
        at scala.reflect.internal.util.ScalaClassLoader$class.asContext(ScalaClassLoader.scala:31)
        at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.asContext(ScalaClassLoader.sc
ala:101)
        at scala.reflect.internal.util.ScalaClassLoader$class.run(ScalaClassLoader.scala:70)
        at scala.reflect.internal.util.ScalaClassLoader$URLClassLoader.run(ScalaClassLoader.scala:10
1)
        at scala.tools.nsc.CommonRunner$class.run(ObjectRunner.scala:22)
        at scala.tools.nsc.ObjectRunner$.run(ObjectRunner.scala:39)
        at scala.tools.nsc.CommonRunner$class.runAndCatch(ObjectRunner.scala:29)
        at scala.tools.nsc.ObjectRunner$.runAndCatch(ObjectRunner.scala:39)
        at scala.tools.nsc.ScriptRunner.scala$tools$nsc$ScriptRunner$$runCompiled(ScriptRunner.scala
:175)
        at scala.tools.nsc.ScriptRunner$$anonfun$runScript$1.apply(ScriptRunner.scala:192)
        at scala.tools.nsc.ScriptRunner$$anonfun$runScript$1.apply(ScriptRunner.scala:192)
        at scala.tools.nsc.ScriptRunner$$anonfun$withCompiledScript$1$$anonfun$apply$mcZ$sp$1.apply(
ScriptRunner.scala:161)
        at scala.tools.nsc.ScriptRunner$$anonfun$withCompiledScript$1.apply$mcZ$sp(ScriptRunner.scal
a:161)
        at scala.tools.nsc.ScriptRunner$$anonfun$withCompiledScript$1.apply(ScriptRunner.scala:129)
        at scala.tools.nsc.ScriptRunner$$anonfun$withCompiledScript$1.apply(ScriptRunner.scala:129)
        at scala.tools.nsc.util.package$.trackingThreads(package.scala:43)
        at scala.tools.nsc.util.package$.waitingForThreads(package.scala:27)
        at scala.tools.nsc.ScriptRunner.withCompiledScript(ScriptRunner.scala:128)
        at scala.tools.nsc.ScriptRunner.runScript(ScriptRunner.scala:192)
        at scala.tools.nsc.ScriptRunner.runScriptAndCatch(ScriptRunner.scala:205)
        at scala.tools.nsc.MainGenericRunner.runTarget$1(MainGenericRunner.scala:67)
        at scala.tools.nsc.MainGenericRunner.run$1(MainGenericRunner.scala:87)
        at scala.tools.nsc.MainGenericRunner.process(MainGenericRunner.scala:98)
        at scala.tools.nsc.MainGenericRunner$.main(MainGenericRunner.scala:103)
        at scala.tools.nsc.MainGenericRunner.main(MainGenericRunner.scala)


**/
