package com.atguigu.scala1128.day03.high

/**
 * Author atguigu
 * Date 2020/4/22 9:20
 */
object High1 {
    def main(args: Array[String]): Unit = {
        def add(x: Int, y: Int) = x + y
        def product(x: Int, y: Int) = x * y
        def foo(x: Int, y: Int) = 10000
        
        val r1 = calc(10, 20, foo)
        val r2 = calc(10, 20, add)
        println(r1)
        println(r2)
    }
    // 定义一个计算器, 给他两个值, 让后再给他一个运算规则,
    // 让这个计算器使用运算规则去对这两个数进行运算
    def calc(a: Int, b: Int, op: (Int, Int) => Int) = {
        op(a, b)
    }
}
