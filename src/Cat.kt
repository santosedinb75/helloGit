class Cat(name: String) {
    private val catName = name
    fun meow() {
        println("Meow")
    }

    fun getColor(): String {
        return "gold"
    }

    fun getName(): String {
        return catName
    }
}