package com.atguigu.scala1128.day06.implicitdemo

object ImplicitDemo6 {
    implicit val aaa: Int = 100
    
    def main(args: Array[String]): Unit = {
        foo  // 省略括号, 表示在使用 隐式值
        foo()  // 省略括号, 表示在使用 隐式值
        
        foo1() // 加上括号, 表示使用默认值
    }
    
    def foo(implicit a: Int = 200) = println(a)
    def foo1(a: Int = 200) = println(a)
    
}
