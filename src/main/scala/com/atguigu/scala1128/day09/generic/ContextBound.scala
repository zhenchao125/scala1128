package com.atguigu.scala1128.day09.generic

/**
 * Author atguigu
 * Date 2020/4/30 14:52
 */
case class AA(age: Int)
object AA{
    implicit val ord: Ordering[AA] = new Ordering[AA] {
        override def compare(x: AA, y: AA): Int = x.age - y.age
    }
}

object ContextBound {
    
    
    def main(args: Array[String]): Unit = {
        //        println(max(10, 20))
        //        println(max("abc", "aaa"))
        println(max(AA(10), AA(20)))
    }
    
    def max[T: Ordering](x: T, y: T) = {
        // Ordering[T]这个隐式值, 需要从冥界召唤
        val ord = implicitly[Ordering[T]]
        if (ord.gt(x, y)) x
        else y
    }
    
    /*def max[T](x: T,y:T)(implicit ord: Ordering[T]) = {
        if(ord.gt(x, y)) x
        else y
    }*/
}
