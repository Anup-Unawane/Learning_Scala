/*
    Parameterized methods can be used in conjuction with parameterized classes
*/

//Couple class with multiple parameterized types
case class Couple[A, B](first:A, second:B)
{
    //Since type is known at class level, then it does not need to be declared at method level
    def swap:Couple[B, A] = Couple(second, first)
}