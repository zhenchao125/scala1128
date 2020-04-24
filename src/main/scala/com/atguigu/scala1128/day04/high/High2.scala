package com.atguigu.scala1128.day04.high

/**
 * Author atguigu
 * Date 2020/4/24 10:04
 */
object High2 {
    def main(args: Array[String]): Unit = {
        // 部分应用函数
        // 3^2, 4^2,5^2, ....
        /*println(Math.pow(2, 2))
        println(Math.pow(3, 2))
        println(Math.pow(4, 2))*/
        // 能不能有一个函数直接计算平方,
        
        /*val square: Double => Double = Math.pow(_, 2)
        println(square(3))
        println(square(4))*/
        
        /*val pow: (Double, Double) => Double = Math.pow(_, _)
        println(pow(2, 2))*/
        
        println(10)
        val p = println((_: Int))
        p(1000)
        
    }
}
