package controlflow


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 21.07.2018 - 20:09          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    // TODO if if ve if else calisma hizi sorusu sor.
    val isPremiumUser = false

    // if(isPremiumUser == false) yazmayin.
    if (isPremiumUser) {

        println("Premium User")
    }

//    if (isPremiumUser == true) {
//
//        println("Premium User")
//    }

    println("------------------------------------------------------------")

    if (isPremiumUser) {

        println("Premium User")
    } else {
        println("Non-Premium User")
    }

    println("------------------------------------------------------------")

    val premiumText = if (isPremiumUser) {

        "Premium User"
    } else {
        "Non-Premium User"
    }

    println(premiumText)

    println("------------------------------------------------------------")

    val normalUserFee = 1_000
    val premiumUserfee = 1_000_000

    println("${
    if (normalUserFee > premiumUserfee)
        "$normalUserFee is greater than $premiumUserfee"
    else "$normalUserFee is smaller than $premiumUserfee"
    }")

    println("------------------------------------------------------------")

    val amountOfSalary: Int? = null
    //val resultOfJava = amountOfSalary ? amountOfSalary : "Ücret Belirsiz"
    val resultAmountOfSalary = amountOfSalary ?: "Ücret Belirsiz"

    println(resultAmountOfSalary)
}