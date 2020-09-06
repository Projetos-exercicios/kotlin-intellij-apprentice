fun main() {
    val age1 = 42
    val age2 = 21

    val avg1 = (age1.toFloat() + age2.toFloat()) / 2
    var message = "Hello" + " my name is "
    val name = "Joe"
    message += name


    val bigString = """
	|You can have a string
	|that contains multiple
	|lines
	|by
	|doing this.
	""".trimMargin()
    println(bigString)

    val firstName = "Vanessa Sharine"
    val lastName = " Careaga Camelo"
    println(firstName + lastName)


    val coordinates = Pair(2,3)

    val row = coordinates.first
    val column =  coordinates.second


}