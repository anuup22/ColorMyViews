fun main() {
    print("Enter your age: ")
    val age = readlnOrNull()
    val ex = age?.toInt()
    println("Your age is: $age")
}