package com.testsmirk

/**
 * Created by testsmirk on 2017/8/18.
 */
fun main(args: Array<String>) {
    var lambia: (Int, Int) -> Int = { a, b -> a + b }
    print(lambia(2, 2))
    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"



    println(s2)
    print(sumAnd())
    val name = "abcd"
    for (c in name) {
        print(c)
    }

    val im = 0
    when (im) {
        0 -> print("0")
        1 -> print("1")

    }
    println(getStringLength(1))


    println("")
    for (x in 1..4) println(x)
    println("")

    println("")

    val q: Int = 1000;
    println(q === q)
    val boxedQ: Int? = q;
    val atherBoxedQ: Int = q;
    println(boxedQ===atherBoxedQ)
    println(boxedQ==atherBoxedQ)

    println("")
    val b:Byte =1
    val i :Int =b.toInt()
    println("---")

    val texta = """
        this is mutil text
        """.trim()

    print(texta)

    println("")

}

fun getStringLength(any: Any): Int? {
    if (any is String) {
        return any.length;
    }
    return null

}

fun sumAnd(a: Int, b: Int): String {
    if (a != 0 && b != 0)
        return (a + b).toString()
    return ">_<"
}

fun sumAnd(): String {
    return sumAnd(0, 0)

}