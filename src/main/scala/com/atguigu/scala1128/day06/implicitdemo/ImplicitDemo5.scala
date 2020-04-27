package com.atguigu.scala1128.day06.implicitdemo

object ImplicitDemo5 {
    implicit val aaa: Int = 100
    implicit val bbb: String = "abc"
    
    
    
    def main(args: Array[String]): Unit = {
        foo("利好")
    }
    
    // a是隐式参数, 将来调用的时候根据需要,可以不传
    // 让scala自动帮助我们传递, 找一个隐式值
    def foo(s: String)(implicit a: Int, b:String) = {
        println("s")
        println(a)
        println(b)
    }
}
