package com.atguigu.scala1128.day02.hight

/**
 * Author atguigu
 * Date 2020/4/21 16:42
 */
object High1 {
    def main(args: Array[String]): Unit = {
        def abc(a: Int):Int = a + 100
    
        val r: Int = foo(abc)
        println(r)
    }
    
    // f是函数, 如果定义函数的类型呢?
    def foo(f: Int => Int) = {
        f(10)
    }
    
    
}

/*
函数式编程标配:
 1. 高阶函数
    如果一个函数A接受一个或多个函数作为参数, 或者返回值是函数, 这样的函数A就叫高阶函数
 2. 闭包
 3. 柯里化


高阶函数

 */