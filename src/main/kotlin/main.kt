fun main() {

    println("TASK #1")
    val amount = 3300
    var tax = (amount / 100) * 0.75
    val toTransfer = if (amount > 35) amount - tax else "Минимальная сумма для перевода 35 рублей!"
    println("Сумма к переводу: ${amount}, Комиссия: ${tax}")
    println("Итого, с учётом комиссии: ${toTransfer}")

    println()

    println("TASK #2")

    val likes = 121
    val count = if ((likes - 1) % 10  == 0) "человеку" else if (likes <= 1) "человеку" else if (likes == 11)  "людям" else "людям"
    println("Понравилось  $likes $count")


    println()

    println("# TASK 3")
    val cart = 15000
    val vip = true // Статус покупателя
    val discountVip   = cart / 100
    val discountMax = cart / 20
    var discount =
        when (cart) {
            in 0..1000 -> 0
            in 1000..10000 -> cart - 100
            in 10000..10000000 -> cart - discountMax
            else -> 0
        }
    val status = if (vip) {discount - discountVip} else discount
    println("КОРЗИНА: ${cart} , СКИДКА ПОСТОЯННОГО ПОКУПАТЕЛЯ: ${if (vip == true) discountVip else "НЕТ"}")
    println( "Итого, со всеми скидками: ${if (vip == true) ("(-1% VIP) " + status + " рублей") else discount}")

}