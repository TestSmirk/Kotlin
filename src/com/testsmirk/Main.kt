package com.t

import com.testsmirk.Outer
import com.testsmirk.Smirk
import com.testsmirk.Smirk1
import com.testsmirk.User
import java.util.*


import com.testsmirk.`class`.Student
import java.text.DecimalFormat
import java.util.*
import java.util.regex.Pattern
import kotlin.math.max
import kotlin.properties.Delegates

/**
 * Created by testsmirk on 2017/8/18.
 */




fun main(args: Array<String>) {
    val  nums = intArrayOf(3,2,4)

    //leetcode 1
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            var result:IntArray= intArrayOf()
            for (i in nums.indices){
                for (j in i until nums.size){
                    if (nums[i]+nums[j]==target){
                        result= intArrayOf(i,j)
                        return result
                    }
                }
            }
            return result

        }
    }

    var twoSum = Solution().twoSum(nums, 6)
    print( "${twoSum[0]}  ${twoSum[1]}")
//    val baseImpl = BaseImpl(1)
//    Derived(baseImpl).print()

//    {
//        "dog",
//        "google",
//        "facebook",r
//        "internationalization",
//        "blabla"
//    }

//    val theList = listOf<String>("dog", "google", "facebook", "internationalization", "blabla")
//    val largestWords = arrayListOf<String>()
//    var maxLength = 0
//    for (i in theList) {
//        if (i.length >= maxLength) {
//            println("iii $i")
//            largestWords.add(i)
//            maxLength = i.length
//        } else {
//            largestWords.removeAt(0)
//        }
//    }
//    println("largestWords ${getIntList().forEach(::println)}")

}

class Test {
    var v = "成员属性"
    fun setInterface(test: TestInterface) {
        test.test()

    }
}

interface TestInterface {
    fun test()
}


//委托
interface Base {
    fun print()
}

//实现此接口的被委托的类

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b


class AClass {
    fun aFun() {
        print("123")
    }
}

open class Foo2() {
    open fun f() {

    }
}

class Bar4 : Foo2() {
    override fun f() {
        super.f()
        print("override fun ")
    }

    object Baz {
        fun g() {

        }
    }
}


private val dayArr = intArrayOf(20, 19, 21, 20, 21, 22, 23, 23, 23, 24, 23, 22)
private val constellationArr = arrayOf("摩羯座", "水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座")


fun getConstellation(month: Int, day: Int): String {
    return if (day < dayArr[month - 1]) constellationArr[month - 1] else constellationArr[month]
}


class User0(val map: Map<String, Any?>) {
    val username: String by map
    val userage: Int by map
    var name: String by Delegates.observable("TextSmirk") { d, old, new ->
        println("$old - $new - $d")
    }
    var name1: String by Delegates.notNull<String>()
    fun init(name1: String) {
        this.name1 = name1

    }
}

class MyTextCase {
}

fun length(s: String) = s.length
fun isOdd(x: Int) = x % 2 != 0
fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun testTakeUnless(string: String) {
    val result = string.takeUnless(String::isEmpty)
    println("string = $string result $result")
}

lateinit var isNode: String
fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) {
}

fun String.getUrl(): String? {
    val matcher = "^((https|http|ftp|rtsp|mms)?://)[^\\s]+".toRegex().toPattern().matcher(this)
    if (matcher.find()) {
        return matcher.group()
    }
    return ""
}

fun Click() {
    print("click")
}

class User {
    fun setonClick(unit: Unit) {


    }
}

private val portRange = 8888..8899

val MaxListSize = 9999;
fun getIntList(): IntArray {
    val temList = IntArray(MaxListSize)
    for (index in temList.indices) {
        temList[index] = (Math.random() * MaxListSize).toInt()
    }
    return temList
}

fun test9() {
    for (i in portRange) {

        if (i == 8890) {
            println("333")
            break
        }
        println("---")
    }
}

class Test6 {
    fun test6() {

        println("${System.currentTimeMillis()}-------------------------")
        val timer = java.util.Timer()
        val timerTask = object : TimerTask() {
            override fun run() {
                println("timer   ")
            }

        }
        timer.schedule(timerTask, 0, 1000)
        val toInt = 2882341273.toInt()
        println("2882341273  $toInt ")
        val sss = 121 * 1020
        var minutes = sss.div(1000 * 60)
        var sec = sss.div(1000) % (60)

        if (minutes == 0) {
            minutes = 1
        } else if (sec > 0) {
            minutes += 1
        }
        println("minutes ${minutes}")

        println(1 or 3)
        val arrayTemp = ArrayList<Int>()
        arrayTemp.add(9)
        arrayTemp.add(2)
        arrayTemp.add(5)
        arrayTemp.add(8)
        arrayTemp.sortBy { it < 0 }
        arrayTemp.forEach {
            println("arrayTemp" + it)
        }



        println("\"http://url.cn\".getUrl():    ${"http://tool.chinaz.com/regex".getUrl()}")
        foo {}
        if (::isNode.isInitialized) {

        }
        for (i in '0'..'9') {
            println(i)
        }
        val squares = List(10) { index -> index * index }
        val mutable = MutableList(10) { 0 }
        println("squares $squares mutable $mutable" +
                "")

        val list1 = listOf("a", "b")
        val list2 = listOf("x", "y", "z")
        val minSize = minOf(list1.size, list2.size)
        val maxSize = maxOf(list1, list2, compareBy { it.size })
        println("minsize $minSize maxSize $maxSize")
        val map = mapOf("key" to 22)
        val emptyMap = map - "key"
        println("map $map")
        println("emptyMap $emptyMap")
        testTakeUnless("")
        testTakeUnless("123")

        val compose = compose(::isOdd, ::length)
        val numbers = listOf<Int>(1, 2, 3, 4, 5)
        println("numbers.filter(::isOdd)  " + numbers.filter(::isOdd))
        val user0 = User0(mapOf(
                "username" to "myname",
                "userage" to 12.0f
        ))
        println("user ${user0.username} ${user0.userage}")
        user0.name = "Curl"

        user0.init("")
        println(user0.name1)
        val url3 = "http://music.163.com/m/video?id=DBEA49CAA5CFCB2F3F3E13CA8043AABA&userid=1342344235%C2%A0(%E6%9D%A5%E8%87%AA@%E7%BD%91%E6%98%93%E4%BA%91%E9%9F%B3%E4%B9%90)"
        val reg = "^((?!vmind\\.qqvideo|btrace\\.video|www\\.facebook\\.com|data\\.video\\.qiyi\\.com|tadpoles\\.xyz).)*(\\.mp4|\\.3gp|\\.swf|\\.flv)(?!\\?vframe|%3F|%22%2C|v=).*\$"
        val matcher1 = "^((?!vmind\\.qqvideo|btrace\\.video|www\\.facebook\\.com|data\\.video\\.qiyi\\.com|tadpoles\\.xyz).)*(\\.mp4|\\.3gp|\\.swf|\\.flv)(?!\\?vframe|%3F|%22%2C|v=).*\$".toRegex().toPattern().matcher(url3)
        val matcher2 = ""
        val matchesResult = Pattern.matches(reg, url3)
        println("matchesResult ${matchesResult}")
        println("matcher1.matches() ${matcher1}")

        val url1 = "http://vm-media-test.b0.upaiyun.com/images/000/10/01/75/0001515585436574.jpeg!300px"
        val url = "http://vm-media-test.b0.upaiyun.com/chatting/gift/1515056631981677.zip"
        val toRegex = "\\w*\\.jpeg".toRegex()
        val matcher = toRegex.toPattern().matcher(url1)
        //    println("toRegex.pattern ${matcher.find()}")
        if (matcher.find()) {
            println("matcher.group() ${matcher.group()}")
        }


        print("getConstellation() ${getConstellation(9, 21)}")

        println(10000.formatStr())

        println("200.5.doubleTrans() ${200.4.doubleTrans()}")
        println("200.5.doubleTrans() ${200.5.doubleTrans()}")
        println("200.5.doubleTrans() ${200.6.doubleTrans()}")
        println("200.5.doubleTrans() ${200.7.doubleTrans()}")
        println("200.5.doubleTrans() ${200.8.doubleTrans()}")
        println("200.5.doubleTrans() ${200.9.doubleTrans()}")

    }
}

fun Double.doubleTrans(): String {
    return if (Math.round(this) - this == 0.0) {
        this.toLong().toString()
    } else this.toString()
}


fun generatePage(withEmphasis: Boolean) {
    val result =
            ""
    println(result)
}

inline fun foo(inlined: () -> String, noinline notInlined: () -> Unit): Unit {

    //thisMethodCanThroughTopFun()

}

fun Double.toStr(): String {
    val fmt = DecimalFormat("#.00")
    return fmt.format(this)
}

fun Double.toStr1(): String {
    val fmt = DecimalFormat("#.0")
    return fmt.format(this)
}

fun Int.formatStr(): String {
    if (this >= 10000) {
        return "${(this / 10000.0).toStr1()}W"
    } else {
        return this.toString()
    }
}


fun match(url: String, regex: String): Boolean {
    val regex1 = Pattern.compile(regex)
    val matcher = regex1.matcher(url)

    return matcher.matches()

}

fun test7() {

    val fruits = listOf("ather", "apple", "banner", "kiwi")
    fruits.filter { it.contains("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach {
                println(it)
            }
}

fun test6() {
    val list = listOf("1", "2", 3)
    if (1 !in list) {
        println("not in")
    }
    for (i in 9 downTo 0 step 1) {
        println(i)
    }
}

fun test5() {

    //    委托
    val baseImpl = BaseImpl(10)
    Derived(baseImpl).print()
}

fun test4() {
    test1()
    test2()
    test3();
    val d = D()
    d.d()
    println("D = ${D.foo()}")
    println("no:${D.no}")
    val v = null
    println(v.toString())

    val text = """
|asd
|啊盛大盛大
        """.trimMargin()
    print(text)
    val i = 10
    val s = "i = $i" // 求值结果为 "i = 10"
    println(s)


}


class D {
    companion object {

    }

    fun d() {
        println("123")
    }
}

fun D.Companion.foo() {
    println("D的扩展函数")
}

val D.Companion.no: Int
    get() = 10

fun D.d() {
    println("456")
}

fun test3() {


    var student = Student("001", "Student1", 20)
    student.study()

    println("  ")

    var c = C()
    c.f()

    println("  ")
    var user = User("TestSmirk")

    user.Print()
}

fun User.Print() {
    println("user name is $name")
}

open class A {
    open fun f() {
        println("A")
    }

    fun a() {
        println("a")
    }
}

interface B {
    fun f() {
        println("B")
    }

    fun b() {
        println("b")
    }
}

class C : A(), B {
    override fun f() {

    }
}


fun test2() {
    println("++++++++++++++++++")
    var smirk = Smirk()
    smirk.lastname = "smirk1"
    smirk.num = 9
    println(smirk)

    println("++++++++++++++++++")
    var smirk1 = Smirk1("name1", 29)
    println("--------------------")

    Outer().Inner().foo()

    println("--------------------")

    var test = Test()
    test.setInterface(object : TestInterface {
        override fun test() {
            println("对象表达式创建匿名内部类的实例.")
        }

    })
}

fun test1() {
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
    println(boxedQ === atherBoxedQ)
    println(boxedQ == atherBoxedQ)

    println("")
    val b: Byte = 1
    val i: Int = b.toInt()
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