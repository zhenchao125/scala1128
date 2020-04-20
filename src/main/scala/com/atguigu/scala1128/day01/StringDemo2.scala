package com.atguigu.scala1128.day01

/**
 * Author atguigu
 * Date 2020/4/20 14:19
 */
object StringDemo2 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        //        println("a = " + a + ", b = " + b)
        // 字符串插值, 可以非常方便的解决问题
        // s插值
        //        val r = s"a = $a, b= $b"
//        val r = s" $$ a = ${a * 10}, b= ${b * 100}"
        
        // raw 插值
        //val r = "\\r \\n \\t"
        val r = raw"\r \n \t ${a} $$"
        
        println(r)
    }
}
