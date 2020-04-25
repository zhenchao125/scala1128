package com.atguigu.scala1128.day05


/**
 * Author atguigu
 * Date 2020/4/25 8:37
 */
object Test1 {
    def main(args: Array[String]): Unit = {
        //        val f = add(10, _)
        //        foo(x => println(x + 100))
//        foo(10, x => println(x))
    
    }
    
    def foo(a:Int, f: Int => Unit) = {
        f(a)
    }
    
    def add(a: Int, b: Int) = {
        a + b
    }
}
