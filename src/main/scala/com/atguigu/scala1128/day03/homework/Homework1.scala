package com.atguigu.scala1128.day03.homework

/**
 * Author atguigu
 * Date 2020/4/22 8:29
 */
object Homework1 {
    def main(args: Array[String]): Unit = {
                work1()
                work1(10)
        //        println(work2(-100))
        //        println(work3("abc你好"))
//        println("abc" * 3)  // aaa
    }
    
    // 打印三角形图形. 默认5行
    def work1(lines: Int = 5) = {
        for (line <- 0 until lines) {
            // 打印空格
//            for (i <- 0 until lines - 1 - line) print(" ")
            print(" " * (lines - 1 - line))
            // 打印 *
//            for (i <- 0 until 2 * line + 1) print("*")
            print("*" * (2 * line + 1))
            println()
        }
    }
    
    // 传入一个数字, 返回这个数字的符号
    def work2(n: Double) = {
        if (n > 0) 1
        else if (n == 0) 0
        else -1
    }
    
    def work3(s: String): Long = {
        var r: Long = 1
        for (c <- s) {
            r *= c
        }
        r
    }
}

/*
5. 使用函数和循环打印如下图形(图形的行数通过参数控制)
    *
   ***
  *****
 *******
*********
6. 如果一个数字为正数，则它的signum为1；
如果是负数，则signum为-1；如果是0，则signum是0，
编写一个函数来计算这个值
7. 定义函数, 计算传入的字符串中每个字符的 unicode 值的乘积
 */