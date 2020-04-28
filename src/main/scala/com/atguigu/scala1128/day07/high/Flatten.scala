package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 14:32
 */
object Flatten {
    def main(args: Array[String]): Unit = {
        /*val list = List(Array(10, 20), Array(1, 2), Array(5, 6, 7))
        // List(10,20,1,2,5,6,7)
        // 拍平
        val list2: List[Int] = list.flatten
        
        println(list2)*/
        
        val list1 = List("aab", "aaaa", "cccc", "dddd")
        val list2: List[Char] = list1.flatten
        println(list2)
        
    }
}
