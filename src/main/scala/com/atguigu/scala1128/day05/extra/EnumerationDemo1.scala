package com.atguigu.scala1128.day05.extra

/**
 * Author atguigu
 * Date 2020/4/25 16:16
 */
object EnumerationDemo1 {
    def main(args: Array[String]): Unit = {
        val a: Season = Spring
        
    }
}

// 模拟枚举类
// 密封类的意思: 他的子类将来只能出现在当前这个文件中
//sealed trait Season
sealed abstract class  Season
object Spring extends Season
object Summer extends Season
object autumn extends Season
object Winter extends Season