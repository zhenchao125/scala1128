package com.atguigu.scala1128.day05.traitdemo

/**
 * Author atguigu
 * Date 2020/4/25 14:58
 */
object Trait3 {
    def main(args: Array[String]): Unit = {
        val c: T1 = new C12
        c.foo()
        
        
    }
}

class C12 extends T1 with T2 {
    println("c12....")
    
    override def foo(): Unit = {
        super.foo()
        println("C12 foo....")
    }
}


trait T12 {
    println("t12.....")
    
    def foo() = println("t12  foo....")
}

trait T1 extends T12 {
    println("t1.....")
    
    override def foo() = {
        super.foo()
        println("t1  foo....")
    }
}

trait T2 extends T12 {
    println("t2.....")
    
    override def foo() = {
        super[T12].foo()
        println("t2 foo....")
    }
}