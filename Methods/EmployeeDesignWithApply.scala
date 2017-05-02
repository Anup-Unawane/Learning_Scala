import java.time._

class Employee protected(val firstName:String, val lastName: String, val title:String, val hireDate:LocalDate)

object Employee
{
    def apply(firstName:String, lastName:String, title:String) = 
        new Employee(firstName, lastName, title, LocalDate.now)
    
    
    //if a method name is "apply", you dont have to explicitly call it.
    //apply can be used in classes and objects
    def apply(firstName:String, lastName:String, title:String, hireDate:LocalDate) = 
        new Employee(firstName, lastName, title, hireDate)
}

case class Department(name:String)

object EmployeeDesignWithApplyRunner extends App
{
    val e1 = Employee("Bruce", "Wayne", "BatMan")
    println(e1.hireDate)
    
    val department = Department.apply("Sports")
    val department2 = Department("Sports")
    println(department)
    println(department2)
}

/**
    Sample Output
    
> scalac EmployeeDesignWithApply.scala

> scala EmployeeDesignWithApplyRunner
2017-05-02
Department(Sports)
Department(Sports)
**/