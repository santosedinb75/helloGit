fun main(args: Array<String>) {
    val newPuppy = Dog()
    val newKitty = Cat("Whiskers")
    val newBirdy = Bird("Tweety")
    println("Fido is ${newPuppy.getColor()}")
    newPuppy.bark()
    println("${newKitty.getName()} is ${newKitty.getColor()}")
    newKitty.meow()
    println( "${newBirdy.birdName} is a ${newBirdy.getBreed()}")
    newBirdy.tweet()

    println("Howdy Animals")
}