package com.atguigu.scala1128.day06.implicitdemo

import scala.collection.immutable.StringOps

/**
 * Author atguigu
 * Date 2020/4/27 9:08
 */
object ImplicitDemo1 {
    
    def main(args: Array[String]): Unit = {
        // 需要一个动作把double转成int, 然后再把值赋值给a
        implicit def double2Int(d: Double): Int = d.toInt
        
        val a: Int = 10.1 // Double=> Int
        println(a)
    }
}
