package com.atguigu.scala1128.day04

/**
 * Author atguigu
 * Date 2020/4/24 8:55
 */
object Test1 {
def main(args: Array[String]): Unit = {
    // 1. 调用时
    foo1{
        println(" => Int  .....")
        1
    }
  val f =   foo2(() => {
        println(" () => Int")
        1
    })
    f()
}

def foo1(f:  => Int) = {
   val i =  f  // 表示执行传过来的代码块
    println(i)
    f
}

def foo2(f:() => Int) = {
    f()
    val a = 10
    () => println(a)
}
}
