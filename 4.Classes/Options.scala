class Employee(val firstName:String, val midName:Option[String], val lastName:String){
    def this(firstName:String, midName:String, lastName:String) = 
        this(firstName, Some(midName), lastName)
    
    def this(firstName:String, lastName:String) = 
        this(firstName, None, lastName)
    
    def this() = 
        this("Unknown", "Unknown")
}

object Options extends App
{
    val midName = Some("Shahaji")
    val midName2:Option[String] = midName
    val midName3:Some[String] = midName
    
    val noMidName = None
    val noMidName2:Option[String] = noMidName
    val noMidName3:Option[Nothing] = noMidName
    val noMidName4:None.type = noMidName
    
    val shivaji = new Employee("Shivaji", midName, "Bhosale")
    val charlie = new Employee("Charlie", "Chaplin")
    val stranger = new Employee()
    
    println(midName.getOrElse("No Middle Name"))
    println(noMidName.getOrElse("No Middle Name"))
    println("Shivaji Middle Name:" + shivaji.midName.getOrElse("No Middle Name"))
    println("Charlie Middle Name:" + charlie.midName.getOrElse("No Middle Name"))
    println("Stranger Middle Name:" + stranger.midName.getOrElse("No Middle Name"))
    
    def getMiddleName(x:Option[String]):String =
    {
        x match
        {
            case Some(name) => name
            case None => "No Middle Name"
        }
    }
    
    println("Shivaji Middle Name using function:" +getMiddleName(shivaji.midName))
    println("Shivaji Middle Name using function:" +getMiddleName(charlie.midName))
    println("Shivaji Middle Name using function:" +(stranger.midName))
}

/**
Sample Output

> scalac Options.scala

> scala Options
Shahaji
No Middle Name
Shivaji Middle Name:Shahaji
Charlie Middle Name:No Middle Name
Stranger Middle Name:No Middle Name
Shivaji Middle Name using function:Shahaji
Shivaji Middle Name using function:No Middle Name
Shivaji Middle Name using function:None

**/