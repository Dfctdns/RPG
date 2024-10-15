fun main() {
    val knight = Knight(100, 100, 10)
    val wizard = Wizard(100, 100, 10)
    val robot = Robot(100, 100, 10)
    val attack1 = readln().toInt()
    val defense1 = readln().toInt()
    val attack2 = readln().toInt()
    val defense2 = readln().toInt()
    val attack3 = readln().toInt()
    val defense3 = readln().toInt()
    val ar = arrayOf(knight, wizard, robot)
    while(robot.gotHealth() + wizard.gotHealth() + knight.gotHealth() > 1) {
        if (ar[defense1 - 1].gotHealth() == 1) {
            val giveDamage1 = ar[attack1 - 1].attack()
            val getDamage1 = ar[defense1 - 1].getDamage(giveDamage1)
            println("${ar[attack1 - 1].className()} атаковал ${ar[defense1 - 1].className()} на $giveDamage1 урона")
        }
        if (ar[defense2 - 1].gotHealth() == 1) {
            val giveDamage2 = ar[attack2 - 1].attack()
            val getDamage2 = ar[defense2 - 1].getDamage(giveDamage2)
            println("${ar[attack2 - 1].className()} атаковал ${ar[defense2 - 1].className()} на $giveDamage2 урона")
        }
        if (ar[defense3 - 1].gotHealth() == 1) {
            val giveDamage3 = ar[attack3 - 1].attack()
            val getDamage3 = ar[defense3 - 1].getDamage(giveDamage3)
            println("${ar[attack3 - 1].className()} атаковал ${ar[defense3 - 1].className()} на $giveDamage3 урона")
        }
        println("По итогам раунда у ${ar[attack1 - 1].className()} осталось ${ar[attack1 - 1].health} hp")
        println("По итогам раунда у ${ar[attack2 - 1].className()} осталось ${ar[attack2 - 1].health} hp")
        println("По итогам раунда у ${ar[attack3 - 1].className()} осталось ${ar[attack3 - 1].health} hp")
    }
        for (i in ar.indices) {
            if (ar[i].gotHealth() == 1) {
                println("Победил ${ar[i].className()}!!!")
                break
            }
    }
}