class Person(val name:String, private val superHeroName:String)

object Person
{
    def showSuperHeroName(p:Person) = p.superHeroName   //Companion object can have access to private members in Companion class
}

object SuperHeroRunner extends App
{
    val p1 = new Person("Peter Parker", "Spiderman")
    println(Person.showSuperHeroName(p1))
}

/**
    Sample output
    
    > scala SuperHeroes.scala

> scalac SuperHeroes.scala

> scala SuperHeroes

> scala SuperHeroRunner
Spiderman

**/