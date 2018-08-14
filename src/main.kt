fun main(args: Array<String>) {
    val fido = Dog()
    val whiskers = Cat("Whiskers")
    val tweety = Bird("Tweety")
    println("Fido is ${fido.getColor()}")
    fido.bark()
    println("${whiskers.getName()} is ${whiskers.getColor()}")
    whiskers.meow()
    println( "${tweety.name} is a ${tweety.getBreed()}")
    tweety.tweet()
}