
val a = 99

//String interpolator s is used for simple String formatting
// s interpolator is used to get information from context
println(s"${a} birds flying in the sky")
println(s"${a+5} insects flying in the air")

val ticketCost = 50
val movie = "Inferno"
//f interpolator is used to get information from context as well as used to format string
//f interpolator is used for C/Java style formatting
println(f"Ticket Cost for movie $movie%s is $$$ticketCost%1.2f")	//require $$ to print $ symbol

val incr = 25
println(f"Ticket Cost for movie $movie%s is $$$ticketCost%1.2f %n that is $incr%% increment from last week.") //require %% to print % char and %n for new line


println()
//f interpolator also works with smart string
println(f"""Ticket Cost for movie $movie%s is $$$ticketCost%1.2f 
			|that is $incr%% increment from last week.""".stripMargin)
