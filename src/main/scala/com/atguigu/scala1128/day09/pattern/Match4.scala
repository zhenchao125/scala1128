package com.atguigu.scala1128.day09.pattern

case class MyCollection(eles: Int*)

object Match4 {
    def main(args: Array[String]): Unit = {
        val collection: MyCollection = MyCollection(10, 20, 30, 40)
        collection match {
            case MyCollection(a, b, rest@_*) =>
                println(a)
                println(rest)
        }
    }
}
