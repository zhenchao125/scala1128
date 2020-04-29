package com.atguigu.scala1128.day08.pattern

/**
 * Author atguigu
 * Date 2020/4/29 16:04
 */
object ListMatch {
    def main(args: Array[String]): Unit = {
        //List匹配 内容
        val list1 = List(30, 50, 70)
        list1 match {
            /*case List(a, b, c) =>
                println(a)*/
            /*case List(a, rest@_*) =>
                println(rest)*/
            // 中置运算符
            /*case head :: rest =>
                println(head)
                println(rest)*/
            /*case _ :: two :: three :: Nil =>
                println(three)
                */
            case a :: b :: c =>
                println(c)
                
            
        }
    }
}
