import scala.beans.BeanProperty

class Employee1 (@BeanProperty val firstName:String, @BeanProperty var lastName:String)
{

}

/***
  * SAMPLE OUTPUPT
  * E:\Courses\scala\IntellijIDEA\src>scalac Employee1.scala

E:\Courses\scala\IntellijIDEA\src>javap -p Employee1.class
Compiled from "Employee1.scala"
public class Employee1 {
  private final java.lang.String firstName;
  private java.lang.String lastName;
  public java.lang.String firstName();
  public java.lang.String lastName();
  public void lastName_$eq(java.lang.String);
  public void setLastName(java.lang.String);
  public java.lang.String getFirstName();
  public java.lang.String getLastName();
  public Employee1(java.lang.String, java.lang.String);
}

E:\Courses\scala\IntellijIDEA\src>

  */
