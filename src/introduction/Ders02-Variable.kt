package introduction


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 20.07.2018 - 22:56          │
//└─────────────────────────────┘

fun main(args: Array<String>) {

    var awesomeLang = "Kotlin"
    val awesomeLangBOD = 2011

    var elderLang: String = "Java"
    val elderLangBOD: Int = 1995

    var betaFramework: String
    betaFramework = "Flutter"

    val betaFrameworkBOD: Int
    betaFrameworkBOD = 2018

    awesomeLang = "Awesome Kotlin"
    //awesomeLangBOD = 2012 // hata verir.

    var broLang: String
    // broLang = 5 // hata verir.

    /**
     *
     *     ? isareti null (nullable) deger girilebilir anlamina geliyor.
     *     !! null olmayacagini (not null) garanti ediyorum anlamina geliyor.
     *     ?. null degil ise (if not null) ilgili methodu kullan anlamina geliyor.
     *
     */

    print("Adınızı giriniz : ")

    val name: String? = readLine()
    name?.plus(" ÖZTÜRK")

    println(name)

    print("Yaşınızı giriniz : ")

    var age: Int? = null?.toInt()

    print(name)

    print(age?.plus(2))
}