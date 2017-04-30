class ChecksumAccumulator{
	private var sum = 0;

	def add(b:Byte) {sum += b}

	def checkSum() :Int = ~(sum & 0xFF) + 1

}

val acc = new ChecksumAccumulator
acc.add(5)
println("checkSum is :" + acc.checkSum)

/**
	Sample Output
	>scala ChecksumAccumulator.scala
	checkSum is :-5

**/
