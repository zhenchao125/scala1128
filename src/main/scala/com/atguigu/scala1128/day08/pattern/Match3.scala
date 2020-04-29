package com.atguigu.scala1128.day08.pattern

object Match3 {
    def main(args: Array[String]): Unit = {
        val s = 4 match {
            case 3 =>
                100
            case 4 =>
                200
            case 5 =>
                ""
                
        }
        println(s)
    }
}
