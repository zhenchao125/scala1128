package com.atguigu.scala1128.day05.extra

/**
 * Author atguigu
 * Date 2020/4/25 16:09
 */
object Extra1 {
    def main(args: Array[String]): Unit = {
        /*val a:A = new B
        // java中判断类型:   a instanceof B
        if (a.isInstanceOf[B]) {  // 判断a是否为B的对象
            val b = a.asInstanceOf[B] // a转换B的类型
            b.foo()
        }*/
        
        /*val a: Int = 10
        println(a.isInstanceOf[Double])
        println(a.asInstanceOf[Double])*/
    
        println(10.1.asInstanceOf[Int])
    }
}

class A
class B extends A{
    def foo() = println("foo...")
}
