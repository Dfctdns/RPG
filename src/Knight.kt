class Knight(
    override var health: Int,
    override var power: Int,
    var defence: Int,
): Human() {
    override fun attack(): Int {
        return (1..15).random()
    }
    override fun heal() {
        this.health += (1..15).random()
    }
    override fun getDamage(at:Int) {
        if(defence < at) {
            this.health -= at + defence
        }
    }
    override fun gotHealth(): Int {
        if (health > 0) {
            return 1
        }
        else
            return 0
    }

    override fun className():String {
        return "Knight"
    }
}