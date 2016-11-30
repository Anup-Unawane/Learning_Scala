val lyrics = """This is multiline String or smart String using defautl pipe char as margin
				| This is line 2
				| This is line3
				| This is line 4.""".stripMargin

println(lyrics)				

println()

val msg = """ This is multiline String or smart String using at the rate char as margin
				@ This is line 2
				@ This is line3
				@ This is line 4.""".stripMargin('@')
println(msg)

println("\nREgEx using simple string")
val timeMsg = "We can meet at 12:30PM or 1:15AM or 5:30PM."
val regEx = "(\\s|[0-9])?[0-9]:[0-5][0-9]|\\s*(AM|PM)".r

println(regEx.findAllIn(timeMsg).toList)

println("\nREgEx using smart string")

//Note here: Slashes are not required to escape for smart strings. 
val smartRegEx = """(\s|[0-9])?[0-9]:[0-5][0-9]|\s*(AM|PM)""".r 
println(smartRegEx.findAllIn(timeMsg).toList)
