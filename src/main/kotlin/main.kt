fun main() {
    val price = 100
    val quantity = 1
    val regularClient: Boolean = true
    val discount_1_count = 1_000
    val discount_1_val = 100
    val discount_2_count = 10_000
    val discount_2_val = 0.05f
    val discount_3_val = 0.01f

    var amount: Int = price * quantity

    if (quantity > discount_2_count) {
        amount -= (amount * discount_2_val).toInt()
    } else if (quantity > discount_1_count) {
        amount -= discount_1_val
    }

    if (regularClient)
        amount -= (amount * discount_3_val).toInt()

    println("Стоимость $amount руб. Скидка ${price * quantity - amount} руб.")
}