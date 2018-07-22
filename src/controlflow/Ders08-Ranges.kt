package controlflow


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 21.07.2018 - 22:17          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    val aToz = 'a'..'z'
    val rakam = 0..9

    print("Bir karakter giriniz : ")
    val oneChar: Char? = readLine()?.get(0)

    when (oneChar) {

        in aToz -> println("Karakter bulundu.")
        else -> println("Karakter bulunamadı.")
    }

    println("\n------------------------------------------------------------")

    for (item in rakam) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    //kucukten buyuge yaparsaniz yazdirmaz.
    for (item in 5 downTo 1) {
        print("$item ")
    }

    println("")

    for (item in 5.downTo(1)) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    for (item in 1 until 5) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    for (item in 1.rangeTo(5)) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    for (item in 1..5 step 2) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    for (item in (1..5).reversed() step 2) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    val chars = ('a'..'e')

    val singleChar = chars.iterator()

    while (singleChar.hasNext()) {
        val nextChar = singleChar.next()
        print("$nextChar ")
    }

    println("\n------------------------------------------------------------")

    val intRange = IntRange(1, 5)

    for (item in intRange) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    val intRangeFromClosedRange = IntProgression.fromClosedRange(5, 1, -1)

    for (item in intRangeFromClosedRange) {
        print("$item ")
    }

    println("\n------------------------------------------------------------")

    val range = (1..9).step(3)

    val firstRange = range.first
    val lastRange = range.last
    val maxRange = range.max()
    val minRange = range.min()

    println("Range starts with $firstRange and end with $lastRange max with $maxRange min with $minRange")
}