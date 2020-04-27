package com.atguigu.scala1128.day06.tuple

/**
 * Author atguigu
 * Date 2020/4/27 16:48
 */
object TuppleDemo2 {
    def main(args: Array[String]): Unit = {
        /*val m = 10
        val n = 3
        // 同时计算出来 m / n 和m % n取余
        // (a, b) 对偶  (k, v) kv形式的
        val r = /%(m, n)
        println(r._1)
        println(r._2)*/
        
        val t = (1, (10, (20, (30, 40))))
        println(t._2._2._2._2)
    }
    
    
    def /%(m: Int, n: Int): (Int, Int) = {
        (m / n, m % n)
    }
}
