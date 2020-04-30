package com.atguigu.scala1128.day09.generic

/**
 * Author atguigu
 * Date 2020/4/30 13:55
 */
object GenericDemo1 {
    def main(args: Array[String]): Unit = {
        //        new Pair[Int](10, 20)
        val p = new Pair(10, 20)
    }
}

class Pair[T](val x: T, val y: T){
    
    def foo(f: T) = {
    
    }
    
    def foo1[K](f: K) = {
    
    }
}
