package com.atguigu.scala1128.day08.othercollection

/**
 * Author atguigu
 * Date 2020/4/29 11:56
 */
object LazyDemo {
    def main(args: Array[String]): Unit = {
        //惰性数据结构
//        val list1 = List(30, 50, 70, 60, 10, 20)
//        val stream: Stream[Int] = list1.toStream
        /*println(stream)
        println(stream.head)
        println(stream.tail.head)
        println(stream.tail)
        println(stream)*/
//        println(stream.take(3).force)
    
        /*val s: Stream[Int] = getS
        
        println(s.take(20).force)*/
        
        // 斐波那契数列:  1 1 2 3 5 8 13 ...
        println(fibSeq(6))
    }
    // 计算前多少项
    def fibSeq(n:Int):List[Int] = {
        
        /*def go(a: Int, b:Int): Stream[Int] = {
            a #:: go(b, a + b)
        }*/
        
//        go(1, 1).take(n).force.toList
        
        def go: Stream[Int] = {
            1 #:: go.scanLeft(1)(_ + _)
        }
        go.take(n).force.toList
        
    }
    
    def getS : Stream[Int] = {
        1 #:: getS
    }
    
}
