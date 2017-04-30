import java.time._

class Employee protected(val firstName:String, val lastName: String, val title:String, val hireDate:LocalDate)

object Employee
{
    def createEmployee(firstName:String, lastName:String, title:String) = new Employee(firstName, lastName, title, LocalDate.now)
    
    def createEmployee(firstName:String, lastName:String, title:String, hireDate:LocalDate) = new Employee(firstName, lastName, title, hireDate)
}

object EmployeeDesignRunner extends App
{
    val e1 = Employee.createEmployee("Bruce", "Wayne", "BatMan")
    println(e1.hireDate)
}

/**
    Sample Output
    
> scalac EmployeeDesign.scala

> scala EmployeeDesignRunner
    2017-04-30
**/