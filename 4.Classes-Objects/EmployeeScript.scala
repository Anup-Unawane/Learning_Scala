val emp1 = new Employee("Gabbar", "Singh")
println("FirstName:" + emp1.firstName)
println("LastName:" + emp1.lastName)

emp1.lastName = "Babbar"
println("Modified LastName :" + emp1.lastName)

println("title:" + emp1.title)

/**
  *Sample output
  *
******Before adding var and val to class params
E:\Courses\scala\IntellijIDEA\src>scalac Employee.scala

E:\Courses\scala\IntellijIDEA\src>javap -p Employee.class
Compiled from "Employee.scala"
public class Employee {
  public Employee(java.lang.String, java.lang.String);
}

  ******After adding var and val to class params
E:\Courses\scala\IntellijIDEA\src>scalac Employee.scala

E:\Courses\scala\IntellijIDEA\src>javap -p Employee.class
Compiled from "Employee.scala"
public class Employee {
  private final java.lang.String firstName;
  private java.lang.String lastName;
  public java.lang.String firstName();
  public java.lang.String lastName();
  public void lastName_$eq(java.lang.String);
  public Employee(java.lang.String, java.lang.String);
}

E:\Courses\scala\IntellijIDEA\src>scala -cp . EmployeeScript.scala
FirstName:Gabbar
Modified LastName :Babbar

E:\Courses\scala\IntellijIDEA\src>scala -cp . EmployeeScript.scala
FirstName:Gabbar
LastName:Singh
Modified LastName :Babbar


  ---After adding title parameter to constructor
E:\Courses\scala\IntellijIDEA\src>scalac Employee.scala

E:\Courses\scala\IntellijIDEA\src>scala -cp . EmployeeScript.scala
Multiline constructor block!!
FirstName:Gabbar
LastName:Singh
Modified LastName :Babbar
title:Programmer

E:\Courses\scala\IntellijIDEA\src>


  */
