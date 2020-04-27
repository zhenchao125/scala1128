package com.atguigu.scala1128.day06.tuple

/**
 * Author atguigu
 * Date 2020/4/27 16:48
 */
object TuppleDemo3 {
    def main(args: Array[String]): Unit = {
        val (a, _) = /%(10, 3)
        println(a)
    }
    
    
    def /%(m: Int, n: Int): (Int, Int) = {
        (m / n, m % n)
    }
}
