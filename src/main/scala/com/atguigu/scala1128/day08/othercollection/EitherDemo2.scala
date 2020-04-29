package com.atguigu.scala1128.day08.othercollection

/**
 * Author atguigu
 * Date 2020/4/29 14:25
 */
object EitherDemo2 {
    def main(args: Array[String]): Unit = {
        val e: Either[Int, String] = Right("对")
        if (e.isLeft) {
            println(e.left.get)
        }else{
            println(e.right.get)
        }
    }
}
/*
Either
结果有两种可能, 错误或者正确
 */