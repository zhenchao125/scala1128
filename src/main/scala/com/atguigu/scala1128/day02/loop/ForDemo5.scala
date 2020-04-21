package com.atguigu.scala1128.day02.loop


import scala.util.control.Breaks._

/**
 * Author atguigu
 * Date 2020/4/21 11:00
 */
object ForDemo5 {
    def main(args: Array[String]): Unit = {
        // 使用for来判断一个数是否为质数!
        
        val n = 9
        var isPrime = true
        /*try {
            for (i <- 2 until n) {
                if (n % i == 0) {
                    isPrime = false
                    throw new ....
                }
            }
        } catch {
            case e =>
        }*/
        
        breakable {  // 也是个方法, 内部其实try了抛出的异常
            for (i <- 2 until n) {
                if (n % i == 0) {
                    isPrime = false
                    break // 抛出异常. 其实是一个方法, 内部在抛异常
                }
            }
        }
        
        if (isPrime) {
            println(s"$n 是质数")
        } else {
            println(s"$n 不是质数")
            
        }
    }
}
