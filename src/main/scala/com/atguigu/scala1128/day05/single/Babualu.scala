package com.atguigu.scala1128.day05.single

import scala.collection.mutable

/**
 * Author atguigu
 * Date 2020/4/25 10:10
 */
object Human {
    def main(args: Array[String]): Unit = {
        /*println(makeHuman("黄"))
        println(makeHuman("棕"))
        println(makeHuman("棕"))*/
        
    }
    
    val humans: mutable.Map[String, Human] = mutable.Map[String, Human](
        "黄" -> new Human("黄"),
        "黑" -> new Human("黑"),
        "白" -> new Human("白"))
    
    def makeHuman(color: String) = humans.getOrElseUpdate(color, new Human(color))
    
}

// 主构造私有
class Human private (val color: String) {
   
    println(s"创造 $color 种人")
    override def toString: String = s"$color 种人"
    def eat = println("eat...")
}
/*
静态工厂, 使用工厂类去创建对象, 屏蔽了创建对象的方法

把构造器私有, 就可以避免外界创建对象
 */