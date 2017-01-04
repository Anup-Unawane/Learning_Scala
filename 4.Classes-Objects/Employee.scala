import scala.beans.BeanProperty

/**
  * val creates accessors(getters), access to inner state
  * var creates both accessors and mutators(setters)
  * you can view class file using javap -p <class name>
  *
  *   call another constructor by invoking this
  *
  */
class Employee (@BeanProperty val firstName:String, @BeanProperty var lastName:String, @BeanProperty val title:String)      //This is default constructor
{
  require(firstName.nonEmpty, "First Name cannot be empty!!")     //preconditions using require
  require(lastName.nonEmpty, "Last Name cannot be empty!!")
  require(title.nonEmpty, "Title cannot be empty!!")

  if(title.contains("Senior") || title.contains("Junior"))    //Preconditions using manual check
    throw new IllegalArgumentException("Title cannot contain Senior or Junior!!")

  //Another constructor
  def this(firstName:String, lastName:String ) = {this(firstName, lastName, "Programmer")     //if constructor block is multiline, First call must be this
                                                  println("Multiline constructor block!!")}
}
