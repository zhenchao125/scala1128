package com.atguigu.scala1128.day04.mode

/**
 * Author atguigu
 * Date 2020/4/24 17:02
 */
object Modefier1 {
    def main(args: Array[String]): Unit = {
        val aa = new AA
        aa.speak()
    }
}

class AA{
    protected def foo() = println("foo...")
    
    private[com] def speak() = println("speak...")
    
}
