package com.atguigu.scala1128.day09.generic

import com.atguigu.scala1128.day06.implicitdemo.B

/**
 * Author atguigu
 * Date 2020/4/30 14:35
 */
object GenericDemo5 {
    def main(args: Array[String]): Unit = {
//        val as:Array[A] = new Array[B](10)
//        val as: List[A] = List[B]()
//        val as: Set[A] = Set[B]()
        val map: Map[A, A] = Map[A, B]()
    }
}
class A
class B extends A