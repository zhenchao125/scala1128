package com.atguigu.scala1128.day09.generic

import a.b

/**
 * Author atguigu
 * Date 2020/4/30 14:01
 */
case class User(age: Int,name: String) extends Ordered[User]{
    override def compare(that: User): Int = this.age - that.age
}
object GenericDemo2 {
    def main(args: Array[String]): Unit = {
        println(max(User(20, "a"), User(15, "b")))
    }
    
    // 定义一个函数, 接受两个参数数, 返回他们的最大值
    def max[T <: Ordered[T]](a: T, b: T): T = {
        // 如果是T是Ordered的子类型, 就一定可以使用 > < >= ...
        if(a > b) a
        else b
    }
}
