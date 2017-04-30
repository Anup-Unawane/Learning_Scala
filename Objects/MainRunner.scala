object MainRunner
{
    def main(args:Array[String]):Unit = println("Hello from Scala Main Method!!!")
}

/**
    Sample Output
> scala MainRunner.scala
Hello from Scala Main Method!!!

//compiling scala file
scalac MainRunner.scala

//Running scala class using java
> java -cp .;C:\scala\lib\scala-library.jar MainRunner
Hello from Scala Main Method!!!
**/