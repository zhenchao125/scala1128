package com.atguigu.scala1128.day08.pattern

object Match4 {
    def main(args: Array[String]): Unit = {
//        val a: Any = 100
        val a: Any = 99
        a match {
                // 只匹配大于等于100的整数. 守卫
            case a: Int if a >= 100 && a <= 110 =>
                println(a to 110)
            case b: Boolean =>
                println("是一个boolean: " + b)
        }
    }
}
