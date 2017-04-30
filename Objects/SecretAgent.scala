/**
    1.Class SecretAgent and object SecretAgent are called as companion object.
    2.For companion classes, create a class and an object with same name.
    3.Both class and object must present in same file.
    4.Companion object can't have main method
    5.Companion object can have access to private members in Companion class
    6.Companion classes have access to private members in Companion object.
*/

class SecretAgent(val name:String)
{
    def shoot(n:Int)
    {
        import SecretAgent._        //This means every method inside SecretAgent companion object is imported
        decrementBullets(n)
    }
}

object SecretAgent
{
    private var bullets:Int = 3000
    
    private def decrementBullets(count:Int)=
    {
        if((bullets - count) <= 0 ) bullets = 0
        else
            bullets = bullets - count
    }
    
    def getBullets:Int = bullets
}

object SecretAgentRunner extends App
{
    val bond = new SecretAgent("James Bond")
    val ethan = new SecretAgent("Ethan Hunt")
    val jason = new SecretAgent("Jason Bourne")
    
    bond.shoot(800)
    ethan.shoot(400)
    jason.shoot(300)
    
    println("Bullets Left are :" + SecretAgent.getBullets)
}

/**
    Sample Output
> scalac SecretAgent.scala

> scala SecretAgentRunner
Bullets Left are :1500

**/