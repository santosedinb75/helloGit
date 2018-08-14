fun main(args: Array<String>) {
    val fido = Dog()
    val whiskers = Cat("Whiskers")
    println("Fido is ${fido.getColor()}")
    fido.bark()
    println("${whiskers.getName()} is ${whiskers.getColor()}")
    whiskers.meow()
}