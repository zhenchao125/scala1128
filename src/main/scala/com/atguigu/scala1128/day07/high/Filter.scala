package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 14:17
 */
object Filter {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 7, 60, 1, 20)
//        val list2: List[Int] = list1.filter(x => x > 20)
//        val list2: List[Int] = list1.filter(_ > 20)
//        val list2 = list1.filter(x => x % 2 == 0)
        val list2 = list1.filter(_ % 2 == 0)
        println(list2)
    }
}
