package com.atguigu.scala1128.day03.high.Controlabstract

/**
 * Author atguigu
 * Date 2020/4/22 15:14
 */
object NameValueCall {
    def f() = {
        println("f...")
        10
    }
    
    def main(args: Array[String]): Unit = {
        /*foo(3 + 4)
        foo1(3 + 4)*/
        
//        foo1(f())
        /*foo({
            println("one")
            println("two")
            10
        })*/
        foo {
            println("one")
            println("two")
            10
        }
        println("----")
        foo2{
            println("f.....")
        }
        
        
        
    }
    
    def  foo2(f: => Unit) = {
        f
        f
    }
    
    def foo1(a: Int) = {
        a
        a
        a
    }
    
    def foo(a: => Int) = {
        a
        a
        a
    }
}

/*
控制抽象:
    在scala中可以定义一个类似于while if 这种结构, 就是控制抽象
    
    名调用和值调用?
        名调用:
        
    
        值调用:
            传递参数的是, 把计算后的值, 传递过去
            默认情况, 几乎所有的语言都是这种调用方式
        
 */