package com.atguigu.scala1128.day09.generic

/**
 * Author atguigu
 * Date 2020/4/30 15:15
 */
case class CC(age:Int)
object ViewBound {
    implicit def f(cc: CC): Ordered[CC] = new Ordered[CC]{
        override def compare(that: CC): Int = cc.age - that.age
    }
    def main(args: Array[String]): Unit = {
//        println(max(1, 10))  // Int => Ordered[Int] 内部已经定义好了
//        println(max("aa", "bbb")) // String => Ordered[String] 内部已经定义好了
        println(max(CC(20), CC(15)))
    }
    // 表示一定存在一个隐式转换函数:  T => Ordered[T]
    def max[T <% Ordered[T]](x: T, y: T) :T = {
        if(x > y) x
        else y
    }
    
    
    /*def max[T](x: T, y: T)(implicit f:  T => Ordered[T]) :T = {
        if(x > y) x
        else y
    }*/
}
