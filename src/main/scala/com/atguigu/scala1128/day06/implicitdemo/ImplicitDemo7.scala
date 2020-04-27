package com.atguigu.scala1128.day06.implicitdemo

class A {
}
class B {
    def foo() = println("B foo...")
}

object A {

}

object B{
    implicit def a2B(a: A) = new B

}

object ImplicitDemo7 {
    
    def main(args: Array[String]): Unit = {
//                new A().foo()
        val b: B = new A
        
    }
}
