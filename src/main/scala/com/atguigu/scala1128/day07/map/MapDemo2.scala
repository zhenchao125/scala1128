package com.atguigu.scala1128.day07.map

/**
 * Author atguigu
 * Date 2020/4/28 9:45
 */
object MapDemo2 {
    def main(args: Array[String]): Unit = {
        //        val map = Map(("a", 97), ("b", 98), ("c", 98))
        val map = Map("a" -> 97, "b" -> 98, "c" -> 99)
        println(map("a")) // map.apply("a")
//        println(map("d")) // 如果key不存在, 会抛异常
        var v = map.getOrElse("d", 100)  // 可以避免抛异常
        println(v)
        
        /*val t1 = ("a", 97)
        val t2 = "a" -> 97
        
        val t3: (String, Int) = "a" → 99
        
       val t4 =  1 -> 10 -> 20 -> 30*/
       
    }
}
