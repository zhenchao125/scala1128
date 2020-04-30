package com.atguigu.scala1128.day09.pattern

/**
 * Author atguigu
 * Date 2020/4/30 10:37
 */
object Match8 {
    def main(args: Array[String]): Unit = {
        val list = List(10, "a", false, 20, 30)
        
        /*val list2 = list.collect({
            case a: Int => a * 2
        })*/
        val list2 = list.collect {
            case a: Int => a * 2
        }
        println(list2)
    }
}

/*
偏函数:
    偏好
    支持偏函数只有一个算子 collect
 */