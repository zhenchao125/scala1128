package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 16:18
 */
object Reduce2 {
    def main(args: Array[String]): Unit = {
        val list = List("a", "b", "c", "d")
        // 通过reduce得到一个字符串: "a->b->c->d"
        val r = list.reduce(_ + "->" + _)
        println(r)
        
        
    }
}
