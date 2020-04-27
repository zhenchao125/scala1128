package com.atguigu.scala1128.day06.list

/**
 * Author atguigu
 * Date 2020/4/27 16:10
 */
object ListDemo1 {
    def main(args: Array[String]): Unit = {
        // 1. 得到List集合
        val list1 = List(10, 20, 30)
        //        val list2: List[Int] = list1 :+ 100
        //        val list2: List[Int] = 100 +: list1
        // 专门用于不可变List的头部增加元素的运算符
        val list2 = 100 :: list1
        println(list1)
        println(list2)
        
        
    }
}
