package com.atguigu.scala1128.day02

/**
 * Author atguigu
 * Date 2020/4/21 8:59
 */
object Operator1 {
    def main(args: Array[String]): Unit = {
        // 如何最高效的计算2^3
        println(2 * 2 * 2 )  // 2B程序员写法
        println(Math.pow(2, 3))  // 普通程序员写法
        //黑客: 左移1位相当于乘以2
        // 1: 0000 0001  2: 0000 0010
        println(1 << 3)
        // 如果最快速判断一个数是否为奇数和偶数
        val n = 3
        println(n % 2 == 1)
        // 使用位运算:    xxxxxx1   xxxxx0
        //     按位与     0000001   000001
        //               0000001    000000
        println((n & 1) == 1)
        
        
        
    }
}
