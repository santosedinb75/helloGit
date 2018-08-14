fun main(args: Array<String>) {
    val fido = Dog()
    val whiskers = Cat()
    println("Fido is ${fido.getColor()}")
    fido.bark()
    println("Whiskers is ${whiskers.getColor()}")
    whiskers.meow()
}