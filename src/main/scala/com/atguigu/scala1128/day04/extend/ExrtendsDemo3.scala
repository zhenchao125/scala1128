package com.atguigu.scala1128.day04.extend

/**
 * Author atguigu
 * Date 2020/4/24 16:19
 */
object ExrtendsDemo3 {
    def main(args: Array[String]): Unit = {
        new S(10).foo()
    }
}

class F(val age: Int) {
    // 可以执行, 创建对象的时候执行. 其实是定义在主构造函数内的代码
    println("F 主构造内的代码 1")
    println("F 主构造内的代码 2")
    
    def foo() = {
        
        println("F foo...")
        
    }
}

class S(override val age: Int) extends F(age) {
    println("S 主构造内的代码 1")
    println("S 主构造内的代码 2")
    
    override def foo(): Unit = {
        super.foo()
        println("S foo...")
        
    }
}

/*
java:
    静态代码块-> 构造代码块->构造器
scala:
    构造器:
        主 和 辅
 */