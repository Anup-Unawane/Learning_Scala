//Objects are like utility classes in java. methods in objects can be considered as static methods in jav
//all objects in scala are singleton.
/***
    Objects in scala can be used for:
    1. Singleton 
    2. Factory pattern
    3. Pattern matching login
    4. Utility method which does not require instance or state
    5. Default values
    6. Main method
**/

object MyObject
{
    def add(x:Int, y:Int)= x+y    
}

println("10 + 20 = " + MyObject.add(10,20))

class Employee(val firstName:String, val lastName:String, val title:String)

//any object can extend from a class
object NewEmployee extends Employee("James", "Bond", "Spy")

println("FirstName:" + NewEmployee.firstName)
println("LastName:" + NewEmployee.lastName)
println("Title:" + NewEmployee.title)


/**
Sample Output

10 + 20 = 30
FirstName:James
LastName:Bond
Title:Spy
**/