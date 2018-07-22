package introduction


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 21.07.2018 - 07:57          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    val intValue: Int = 5

    // Java'da kucuk number veri tipleri buyuk number veri tiplerine donusturulebilirdi.
    // Kotlin'de direkt cevrim yoktur
    // val longValue : Long = intValue // hata verir.
    val longValue: Long = intValue.toLong()

    /*

    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

     */

    // Kotlin'de buyuk veri tipleri de kucuk veri tiplerine donusebilir.
    // Ancak buyuk veri tipi, kucuk veri tipinin deger araligi disinda bir deger alirsa hatali ceviriyor.
    val value1: Long = 2_147_483_647
    val value2: Int = value1.toInt()
    println(value2)
}