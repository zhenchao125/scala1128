package com.atguigu.scala1128.day01

/**
 * Author atguigu
 * Date 2020/4/20 14:14
 */
object StringPrint {
    def main(args: Array[String]): Unit = {
        // 1. 使用java的输出
        System.out.println("abc");
        // 2. scala的输出
        println("ahc")
        // 3. 格式化输出
        val a = 20
//        println("a = " + a)
        // 参考的传统的c语言
        printf("a = %d %s %.2f", a, "1128班", math.Pi)
    }
}
/*
scala 里面也有String

 */