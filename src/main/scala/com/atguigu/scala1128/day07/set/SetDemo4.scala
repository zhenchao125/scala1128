package com.atguigu.scala1128.day07.set

/**
 * Author atguigu
 * Date 2020/4/28 8:16
 */
object SetDemo4 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20, 30, 10, 30, 60)
        val list2: List[Int] = list1.toSet.toList
        println(list2)
        println(list1.toArray)
        
        
    }
}
