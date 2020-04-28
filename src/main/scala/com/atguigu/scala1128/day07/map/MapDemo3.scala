package com.atguigu.scala1128.day07.map

import scala.collection.mutable

/**
 * Author atguigu
 * Date 2020/4/28 10:12
 */
object MapDemo3 {
    def main(args: Array[String]): Unit = {
        val map = mutable.Map("a" -> 97, "b" -> 98, "a" -> 99)
        //        println(map)
        println(map.getOrElse("d", 100))
        println(map)
        // 只能用户可变map
        val v = map.getOrElseUpdate("d", 100) // 如果d不存在, 则返回默认值, 然后再这这个键值对存储到map中
        println(v)
        println(map)
    }
}
