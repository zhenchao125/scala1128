package com.atguigu.scala1128.day09.pattern

/**
 * Author atguigu
 * Date 2020/4/30 11:08
 */
object Match10 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20, "aaa", false)
        val list2 = list1.map {
            case a: Int => a * 2
            case a => a
        }
        println(list2)
    }
}
