package com.atguigu.scala1128.day01

/**
 * Author atguigu
 * Date 2020/4/20 15:55
 */
object TypeConversion1 {
    def main(args: Array[String]): Unit = {
        // 自动转换
        val a: Long = 10
        // 强制类型转换  java:  byte b = (byte)128
        var b: Byte = 128.toByte
        val c: Int = 128.1.toInt
        println(b)
        println(c)
        
        // 转换String
        // 1. 使用字符串拼接
        val s1 = c + ""
        // 2. 任何类型都可以调用toString方法(函数)
        val s2: String = c.toString
        
        // 字符串转值类型
        val ss1 = "123"
        // java中完成:  Integer.parseInt(ss1)
        val i1: Int = Integer.parseInt(ss1)
        val i2: Int = ss1.toInt
        val d1: Double = ss1.toDouble
        println(i2)
        println(d1)
        val b1 = "abc"
        val bb1: Boolean = b1.toBoolean
        println(bb1)
        
    }
}
