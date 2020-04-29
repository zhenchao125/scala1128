package com.atguigu.scala1128.day08.othercollection

import scala.collection.mutable

/**
 * Author atguigu
 * Date 2020/4/29 11:48
 */
object StackDemo {
    def main(args: Array[String]): Unit = {
        val stack: mutable.Stack[Int] = mutable.Stack(10, 20, 30)
        stack.push(40)
        println(stack)
        stack.pop()
        stack.pop()
        println(stack)
        
    }
}
/*
栈:
    FILO  先进后出
    push 入栈
    pop 出栈
 */