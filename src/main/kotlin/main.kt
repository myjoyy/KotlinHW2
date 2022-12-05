fun main() {

    println("TASK #1")
    val amount = 3300
    var tax = (amount / 100) * 0.75
    val toTransfer = if (amount > 35) amount - tax else "Минимальная сумма для перевода 35 рублей!"
    println("Сумма к переводу " + amount + ", Комиссия: " + tax)
    println("Итого, с учётом комиссии: " + toTransfer)

    println()

    println("TASK #2")
    val likes = 221
    val variant = if (likes % 2 == 0) "людям" else "человеку"
    println("Понравилось " + likes + " " + variant)

    println()

    println("# TASK 3")
    val cart = 17000
    val vip = true // СТАТУС ПОСТОЯННОГО ПОКУПАТЕЛЯ
    val discountMax = cart - cart * 0.05
    val discountVip = cart * 0.01
    val discountCalc = if (cart < 1000) cart else
                       if (cart > 1000 && cart < 10000 && vip == true) (cart - discountVip) - 100 else
                       if (cart > 1000 && cart < 10000) cart - 100 else
                       if (cart > 10000 && vip == true) discountMax - discountVip else
                       if (cart > 10000) cart - discountMax else 0

    println("КОРЗИНА: ${cart} , СКИДКА ПОСТОЯННОГО ПОКУПАТЕЛЯ: ${if (vip == true) discountVip else "НЕТ"}")
    println("ИТОГО, СО СКИДКАМИ: ${discountCalc}")

}


