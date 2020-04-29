package com.atguigu.scala1128.day08.high

/**
 * Author atguigu
 * Date 2020/4/29 11:17
 */
object Sort4 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        // 问: x是否小于y. 如果返回true, 表示x < y x在前y在后
       /*val list2 =  list1.sortWith((x, y) => {
           x > y
        })*/
        val list2 = list1.sortWith(_ < _)
        println(list2)
    }
}
