/** 
	A singleton object that does not share the same name with companion class is called as Standalone object.
	Purpose of standalone object is 
	1. Keeping utility methods together
	2. Entry Point to Scala Application
	
**/

import ChecksumAccumulator.calculate

object CheckSummer
{

	def main(args : Array[String])
	{
		for(arg <- args)
			println("Checksum for " + arg + " : " + calculate(arg))	//If ChecksumAccumulator is imported , you can use ChecksumAccumulator.calculate(arg)

	}
}


/** Sample Output **/

/**

D:\Projects\Scala\Chapter4-Classes&objects>scalac SingletonChecksumAccumulator.scala CheckSummer.scala

D:\Projects\Scala\Chapter4-Classes&objects>dir
 Volume in drive D has no label.
 Volume Serial Number is 6871-383C

 Directory of D:\Projects\Scala\Chapter4-Classes&objects

13-12-2016  20:24    <DIR>          .
13-12-2016  20:24    <DIR>          ..
13-12-2016  20:24             1,291 ChecksumAccumulator$$anonfun$calculate$1.class
13-12-2016  20:24             2,321 ChecksumAccumulator$.class
13-12-2016  20:24             1,527 ChecksumAccumulator.class
13-12-2016  19:45               302 ChecksumAccumulator.scala
13-12-2016  20:24             1,601 CheckSummer$$anonfun$main$1.class
13-12-2016  20:24               850 CheckSummer$.class
13-12-2016  20:24               593 CheckSummer.class
13-12-2016  20:24               422 CheckSummer.scala
13-12-2016  20:24             1,050 SingletonChecksumAccumulator.scala
               9 File(s)          9,957 bytes
               2 Dir(s)  79,958,822,912 bytes free

D:\Projects\Scala\Chapter4-Classes&objects>scala CheckSummer This is a Test!!
Checksum for This : -152
Checksum for is : -220
Checksum for a : -97
Checksum for Test : -160

D:\Projects\Scala\Chapter4-Classes&objects>

**/
