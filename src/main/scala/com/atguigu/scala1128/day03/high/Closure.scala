package com.atguigu.scala1128.day03.high

/**
 * Author atguigu
 * Date 2020/4/22 14:10
 */
object Closure {
    def main(args: Array[String]): Unit = {
        /*val f = foo()
        val r = f(10, 20)
        println(r)*/
    
        /*val f: Int => Int = foo1(10)
        println(f(20))
        println(f(30))*/
    
        /*val ff: () => Int = foo2()
        println(ff())*/
    
        val ff1: () => Int = foo3()
        println(ff1())  // 11
        println(ff1())  // 12
        val ff2 = foo3()
        println(ff2())  //
        println(ff2())  //
    }
    
    def foo3() = {
        var a = 10
        () => {
            a += 1
            a
        }
    }
    
    def foo2() = {
        var a = 10
        val f = () => a
        a += 1
        f
    }
    
    /*
    对局部变量来说, 他的声明周期是, 整个函数的执行时间
    在scala中, 有闭包
    什么是闭包:
        一个匿名函数和这个匿名函数所处的环境就叫闭包!!!
        
        闭包可以延长外部局部变量的声明周期
     */
    def foo1(a: Int) = {
        (b: Int) => a + b
    }
    
    
    
    def foo() = {
        (a: Int, b: Int) => a + b
    }
}

/*
高阶函数: 参数是函数 或 返回值是函数

*/
