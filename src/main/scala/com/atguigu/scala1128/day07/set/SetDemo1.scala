package com.atguigu.scala1128.day07.set

/**
 * Author atguigu
 * Date 2020/4/28 8:16
 */
object SetDemo1 {
    def main(args: Array[String]): Unit = {
        // 默认是不变的set
        val set = Set(10, 50, 30, 10, 40, 10)
        val set1 = set + 1
        val set2 = set - 10
        println(set)
        println(set1)
        println(set2)
        
    }
}
