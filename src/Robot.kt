class Robot(
    override var health: Int,
    override var power: Int,
    var battery: Int
    ): Human() {
    override fun attack(): Int {
        return (1..15).random()
    }
    override fun heal() {
        this.health += (1..15).random() + battery
    }
    override fun getDamage(at:Int) {
        this.health -= at
    }
    override fun gotHealth(): Int {
        if (health > 0) {
            return 1
        }
        else
            return 0
    }
    override fun className(): String {
        return "Robot"
    }
}