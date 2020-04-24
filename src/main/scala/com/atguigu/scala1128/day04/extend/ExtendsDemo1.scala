package com.atguigu.scala1128.day04.extend


/**
 * Author atguigu
 * Date 2020/4/24 13:40
 */
object ExtendsDemo1 {
    def main(args: Array[String]): Unit = {
        /*val b = new B
        b.foo()
        */
        
        val b: B = new B
        val a: A = b
        println(b.a) // 20  表明是访问的属性, 本质是方法
        println(a.a) // 20
        
    }
}

class A {
    val a: Int = 10
    
    def b = {
        println("abc")
        100
        
    }
    
    def foo() = {
        println("A  foo...")
    }
}

class B extends A {
    override val a = 20
    
    // 正常的方法覆写方法的
    //    override def b = 1000
    override val b: Int = 1000
    
    override def foo(): Unit = {
        println("B foo...")
    }
    
    def eat(): Unit = {
    
    }
}