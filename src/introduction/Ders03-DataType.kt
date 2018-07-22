package introduction


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 20.07.2018 - 23:03          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    /**
     *      Imzali (Signed) degiskenler, pozitif ve negatif araliklarda sayilari temsil etmenizi saglar.
     *      Imzasiz (UnSigned) degiskenler, sadecce pozitif araliklarda sayilari temsil etmenizi saglar.
     */

    /**
     *
     *      Byte 8-bit signed integer
     *      https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html
     */
    val numberMaxByte: Byte = 127
    val numberMinByte: Byte = -128

    /**
     *
     *      Short 16-bit signed integer
     *      https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html
     *
     */
    val numberMaxShort: Short = 32_767
    val numberMinShort: Short = -32_768

    /**
     *
     *      Int 32-bit signed integer
     *      https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html
     *
     */
    val numberMaxInt: Int = 2_147_483_647
    val numberMinInt: Int = -2_147_483_648

    /**
     *
     *      Long 64-bit signed integer
     *      https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html
     *
     */
    val numberMaxLong: Long = 9_223_372_036_854_775_807
    val numberMinLong: Long = -9_223_372_036_854_775_807 // 808 ile bitince Long saymiyor.

    /**
     *
     *  Float tek hassasiyetli (single-precision)
     *  32-bit IEEE 754 floating point number
     *  IEEE Kayan Nokta Aritmetiği Standardı
     *  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html
     *
     */
    val numberMaxFloat: Float = 3.4028235E38F // Float.MAX_VALUE (noktadan sonrasi sonsuza gider.)
    val numberMinFloat: Float = 1.4E-45F     // Float.MIN_VALUE (noktadan sonrasi sifira gider.)

    /**
     *
     *      Double çift hassasiyetli (double-precision)
     *      64-bit IEEE 754 floating point number.
     *      IEEE Kayan Nokta Aritmetiği Standardı
     *      https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html
     *
     */
    val numberMaxDouble: Double = 1.7976931348623157E308 // (noktadan sonrasi sonsuza gider.)
    val numberMinDouble: Double = 4.9E-324 // (noktadan sonrasi sifira gider.)

    /**
     *
     *  true ya da false deger alabilir. 1 bit.
     *  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html
     *
     */
    val isMan = false
    val isWomen: Boolean = true

    /**
     *
     *  16 bit.
     *  https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html
     *
     */
    val charMax: Char = '\u0000'
    val charMin: Char = '\uffff'
    val firstCharOfMyName = 'G'


    /**
     *
     *     String
     *     https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html
     *
     */
    val helloKodluyoruz = "Hello Kodluyoruz"
    var item: Char

    // -1 ve 16 out of range hatasi dondurur.
    item = helloKodluyoruz[0] // 'H'
    println(item)
    item = helloKodluyoruz[15] // 'z'
    println(item)

    //Strings Kotlin'de degistirilemezler (Immutable)
    //helloKodluyoruz[0] = 's' // hata verir.

    println("------------------------------------------------------------")

    //String ifadenin elemanlarini gezebiliriz.
    for (oneChar in helloKodluyoruz) {
        println(oneChar)
    }

    println("------------------------------------------------------------")

    /**
     *
     * Stringlerin degismezleri (Strings Literals)
     *
     */

    //1- Escape Characters
    val helloWorld1 = "1 Hello\nWorld"
    val helloWorld2 = "2 Hello\tWorld"
    val helloWorld3 = "3 Hello\bWorld"
    val helloWorld4 = "4 Hello \r World"
    val helloWorld5 = "5 Hello \' World"
    val helloWorld6 = "6 Hello \" World"
    val helloWorld7 = "7 Hello \\ World"
    val helloWorld8 = "8 Hello \$ World"

    println(helloWorld1)
    println(helloWorld2)
    println(helloWorld3)
    println(helloWorld4)
    println(helloWorld5)
    println(helloWorld6)
    println(helloWorld7)
    println(helloWorld8)

    println("------------------------------------------------------------")

    // 2- Raw Strings
    println("Trim Margin Kullanilmadan Onceki Hali :")

    val rawString = """
                  |Kotlin is awesome.
    |Kotlin is sponsored and developed by JetBrains.
                *
               ***
              *****
    """


    println(rawString)

    println("Trim Margin Kullanildiktan Sonraki Hali :")
    println(rawString.trimMargin("!!"))

    println("Özel Karakter Trim Margin Kullanildiktan Sonraki Hali :")
    println(rawString.trimMargin("|Kotlin is sponsored"))

    // aradan bir kelime olmaz.
    //println(rawString.trimMargin("sponsored"))

    println("------------------------------------------------------------")

    // 3- String templates
    val a = 5
    val b = 6

    val lagerNumber = """ = ${if (a > b) a else b} """
    println("Larger number is: ${lagerNumber.trimMargin()}")
    println("Larger number is: ${lagerNumber.trimMargin("= ")}")

    println("------------------------------------------------------------")

    // 4- Ozel Methodlar
    val stringOne = "Hey there!"
    val stringTwo = "Hey there!"
    var result: String

    println("Length of stringOne string is ${stringOne.length}.")

    result = if (stringOne.compareTo(stringTwo) == 0) "equal" else "not equal"
    println("stringOne and stringTwo are $result.")

    // stringOne.get(2) ile stringOne[2] ayni sey
    println("Third character is ${stringOne[2]}.")

    result = stringOne.plus(" How are you?") // result = stringOne + " How are you?"
    println("result = $result")

    println("Substring is \"${stringOne.subSequence(4, 7)}\"")

    val amount = "3.14"

    if (amount.indexOf(".") != -1)
        amount.split(".")[1]

    val pi: Float = 3.14_15F
    val hexBytes: Long = 0xFF_EC_DE_5E
    val hexWords: Long = 0xCAFE_BABE
    val maxLong: Long = 0x7fff_ffff_ffff_ffffL
    val nybbles: Byte = 0b0010_0101
    val bytes: Long = 0b11010010_01101001_10010100_10010010
}