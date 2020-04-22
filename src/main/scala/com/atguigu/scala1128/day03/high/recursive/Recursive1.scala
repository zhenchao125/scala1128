package com.atguigu.scala1128.day03.high.recursive

import scala.annotation.tailrec

/**
 * Author atguigu
 * Date 2020/4/22 16:39
 */
object Recursive1 {
    def main(args: Array[String]): Unit = {
        /*val r: Long = factorial(5)
        println(r)*/
        // 1 1 2 3 5 8 13 ...
//        println(fibonacci(40))
        // 要有"累加器"
        // 5!
        // 1 * 5
        // 5 * 4
        // 20 * 3
        // 60 * 2
        // 120
        val r = factorialTail(20, 1)
        println(r)
    }
    
    @tailrec
    def factorialTail(n: Int, add:Long): Long = {
        if(n == 1) add
        else factorialTail(n - 1, add * n)
    }
    
    
    // 计算第n的 斐波那契 数列
    def fibonacci(n: Int):Int = {
        if(n == 1 || n == 2) 1
        else fibonacci(n - 1) + fibonacci(n - 2)
    }
    
    // 计算阶乘
    // n! = n * (n-1)!
    def factorial(n: Int): Long = {
        if(n == 1) 1
        else n * factorial(n - 1)
    }
    
}

/*
递归:
    在函数编程语言中, 递归非常的重要.  在很多算法, 都会用到递归
    
    但是, 递归用不好容易出问题!!!
    在函数内调用自己
    
    定义递归函数的时候, 一定要明确好, 这个函数干什么, 每个参数的作用是什么
    定义函数, 先写注释
    
    注意:
        递归函数的返回值不能退导
 */