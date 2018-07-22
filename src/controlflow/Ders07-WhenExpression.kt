package controlflow

import java.lang.Long.parseLong


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 21.07.2018 - 20:41          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    for (item in args) {

        when (item) {

            "EN" -> {
                println("Dil İngilizce")
            }

            "TR" -> println("Dil Türkçe")

            "FR" -> {
                println("Dil Fransızca")
            }
            "IT" -> {
                println("Dil Italyanca")
            }
            "AR" -> {
                println("Dil Arapça")
            }

            else -> {

                println("Dil Bulunamadı")
            }
        }
    }

    println("------------------------------------------------------------")

    for (item in args) {

        val lang = when (item) {

            "TR" -> {
                "Dil Türkçe"
            }
            "EN" -> "Dil İngilizce"

            "FR" -> {
                "Dil Fransızca"
            }
            "IT" -> {
                "Dil Italyanca"
            }
            "AR" -> {
                "Dil Arapça"
            }

            else -> {

                "Dil Bulunamadı"
            }
        }

        println(lang)
    }

    println("------------------------------------------------------------")

    for (item in args) {

        when (item) {

            "TR" -> {
                println("Avrasya Dili")
            }

            "EN", "FR", "IT" -> {
                println("Avrupa Bölgesi Dilleri")
            }

            "AR" -> {
                println("Orta Asya Dili")
            }

            else -> {

                "Dil Bulunamadı"
            }
        }
    }

    println("------------------------------------------------------------")

    val tcKimlikNo = "15860826552"
    when (15860826552) {
        parseLong(tcKimlikNo) -> println("tcKimlikNo encodes 15860826552")
        else -> println("tcKimlikNo does not encode 15860826552")
    }

    println("------------------------------------------------------------")

    print("Cinsiyeti Nedir : ")
    // println("Cinsiyeti Kadın mı? " + isWomen())

    println("------------------------------------------------------------")

    val someObject: Any = "23".toInt()

    when (someObject) {
        is Int -> println("intValue = ${someObject + 1}")
        is String -> println("$someObject karakter sayısı : ${someObject.length}")
        is Boolean -> println("Öğrenci mi ? $someObject")
    }

    println("------------------------------------------------------------")

    val number = 15

    println(when (number) {

        in 0..10 -> "Number 0 ile 10 arasındadır."
        in 11..20 -> "Number 11 ile 20 arasındadır."
        in 21..30 -> "Number 21 ile 30 arasındadır."
        else -> "Number tanımsızdır."
    })

    println("------------------------------------------------------------")

    val charArray: CharArray = charArrayOf('s', 'u', 'l', 't', 'a', 'n')
    val birdName = String(charArray)
    val birdName2 = String(charArray)

    println(when {
        birdName == birdName2 -> "Kuşun Adını Doğru bildin."
        else -> "Kusun Adını Bilemedin."
    })

    println(when {
        birdName === birdName2 -> "Kuşun Adını Doğru bildin."
        else -> "Kusun Adını Bilemedin."
    })
}

fun isWomen(): Boolean = when (readLine()!!) {

    "evet" -> true
    "hayır" -> false
    else -> false
}