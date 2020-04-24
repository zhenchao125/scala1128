package com.atguigu.scala1128.day04.abs


/**
 * Author atguigu
 * Date 2020/4/24 16:30
 */
object AbsDemo1 {
    def main(args: Array[String]): Unit = {
        val b: A = new B
        b.eat()
        
    }
}

abstract class A(val name: String) {
    // 抽象字段, 或抽象属性
    var age: Int
    val sex: String
    
    def foo() = {
        println("foo...")
    }
    
    // 只有签名, 没有实现
    def eat(): Unit
}

class B extends A("lisi") {
    override def eat(): Unit = {
        println("eat....")
    }
    
    override var age: Int = _
    override val sex: String = "male"
}
