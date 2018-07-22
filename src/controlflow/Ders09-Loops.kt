package controlflow


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 21.07.2018 - 22:50          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    for (item in 0..9) {
        print(item)
    }

    println("\n------------------------------------------------------------")

    val grade = arrayOf(80, 85, 60, 90, 70)

    for (index in grade.indices) {

        println("grade[$index] ${grade.get(index)}")
    }

    println("------------------------------------------------------------")

    for ((index, value) in grade.withIndex()) {

        println("grade[$index] $value")
    }

    println("------------------------------------------------------------")

    val dot = "*"
    repeat(3) {

        for (item in (0..it)) {

            print(dot)
            dot.plus("*")
        }
        Thread.sleep(1000)
    }

    println()

    println("------------------------------------------------------------")

    // for'un icine if yazar durumdaysak while kullanmak daha dogru
    var index = 0
    while (false) {

        if (index == 3) {
            continue
        }

        println(index)
        index++

        if (index > 4)
            break
    }

    println("------------------------------------------------------------")

    index = 0

    do {
        println(index)
        index++
    } while (index < 4)

    println("------------------------------------------------------------")

    (2..5).forEach { i ->
        print(i)
    }

    println()

    (2..5).forEach {
        print(it)
    }

    println("------------------------------------------------------------")

    (2..5).forEachIndexed { index, value ->
        println("index = $index, item = $value")
    }

    println("------------------------------------------------------------")

    val map = mapOf(1 to "Gökhan", 2 to "Fatma", 3 to "Mahmut", 5 to "Gökhan")
    map.forEach { (index, value) -> println("index = $index, value = $value") }

    println()

    map.forEach { println("index = ${it.key}, value = ${it.value}") }

    println("------------------------------------------------------------")

    //tiplere uygun filter ifadeleri yazilmalidir.
    val filterKeys = map.filterKeys { it == 2 || it == 3 }
    println("Key degeri 2 veya 3 olan ifadeler = $filterKeys")

    //tiplere uygun filter ifadeleri yazilmalidir.
    val filterValues = map.filterValues { it == "Gökhan" || it == "Fatma" }
    println("Value degeri Gökhan veya Fatma olan ifadeler = $filterValues")

    //tiplere uygun filter ifadeleri yazilmalidir.
    val filter = map.filter { it.key == 5 && it.value == "Gökhan" }
    println("Key degeri 5 ve ismi Gökhan olan ifadeler = $filter")

    val filterNot = map.filterNot { it.key == 5 && it.value == "Gökhan" }
    println("(Key degeri 5 ve ismi Gökhan) olmayan ifadeler = $filterNot")

    println("------------------------------------------------------------")
}