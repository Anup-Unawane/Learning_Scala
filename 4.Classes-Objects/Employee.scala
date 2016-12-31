/**
  * val creates accessors(getters), access to inner state
  * var creates both accessors and mutators(setters)
  * you can view class file using javap -p <class name>
  *
  *   call another constructor by invoking this
  *
  */
class Employee (val firstName:String, var lastName:String, val title:String)      //This is default constructor
{
  //Another constructor
  def this(firstName:String, lastName:String ) = {this(firstName, lastName, "Programmer")     //if constructor block is multiline, First call must be this
                                                  println("Multiline constructor block!!")}
}
