abstract class Human {
    abstract var health: Int
    abstract var power: Int
    abstract fun attack(): Int
    abstract fun getDamage(at: Int)
    abstract fun heal()
    abstract fun gotHealth():Int
    abstract fun className():String
}