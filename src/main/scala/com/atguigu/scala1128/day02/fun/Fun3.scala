package com.atguigu.scala1128.day02.fun

/**
 * Author atguigu
 * Date 2020/4/21 14:51
 */
object Fun3 {
    def main(args: Array[String]): Unit = {
        // 使用函数计算1-1000内所有质数的和
        val sum = sumPrimes(1, 2000)
        println(sum)
    }
    
    def sumPrimes(from: Int, to: Int) = {
        var sum = 0
        for (n <- from to to if isPrime(n)) {
            sum += n
        }
        sum
    }
    
    def isPrime(n: Int): Boolean = {
        if (n < 2) return false
        else {
            for (i <- 2 until n if n % i == 0) {
                return false
            }
        }
        true
    }
}
