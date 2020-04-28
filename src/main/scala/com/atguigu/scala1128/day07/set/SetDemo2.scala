package com.atguigu.scala1128.day07.set

import scala.collection.mutable

/**
 * Author atguigu
 * Date 2020/4/28 8:16
 */
object SetDemo2 {
    def main(args: Array[String]): Unit = {
        val set1: mutable.Set[Int] = mutable.Set(10, 20, 30, 20)
        set1 += 100
        set1 -= 20
        println(set1)
        
        /*val set2 = set1 + 100
        println(set1)
        println(set2)*/
        
        
    }
}
