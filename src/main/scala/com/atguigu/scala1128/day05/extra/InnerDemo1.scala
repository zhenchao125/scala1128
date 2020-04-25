package com.atguigu.scala1128.day05.extra

/**
 * Author atguigu
 * Date 2020/4/25 16:42
 */
object InnerDemo1 {
    def main(args: Array[String]): Unit = {
        val outer1 = new Outer
        val inner1 = new outer1.Inner
        
        val outer2 = new Outer
        val inner2 = new outer2.Inner
        
        inner1.foo(inner1)
        
        inner1.foo(inner2)
    }
}
class Outer {
    // 自身类型
    that =>
    val a = 20
    class Inner {
        val a = 10
        
        def foo(obj: Outer#Inner) = {
            println("Inner ... foo")
            println("inner = " + a)
            println("inner = " + this.a)
            // 外部类的对象:  Outer.this
            println("outer = " + Outer.this.a)
            println("outer = " + that.a)
        }
    }
    
}
