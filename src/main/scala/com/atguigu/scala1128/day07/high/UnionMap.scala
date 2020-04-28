package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 16:53
 */
object UnionMap {
    def main(args: Array[String]): Unit = {
        // 合并两个Map集合
        
        // Map("a" -> 97, b-> 980+98, c-> 99)
        // 1. 并集(达不到目的, 后面的会覆盖前面的)
        //        val map3 = map1 ++ map2
        // 2. 一个集合保持不变, 遍历另外一个集合, 然后进行合并遍历到的key的值  (比较java思想)
        /*var map3 = map1
        for ((k, v) <- map2) {
            val v1: Int = map3.getOrElse(k, 0)
            map3 += k -> (v1 + v)
        }*/
        
        val map1 = Map("a" -> 97, "b" -> 98)
        val map2 = Map("b" -> 980, "c" -> 99)
        // 3. scala的思想  用foldLeft
        // 最终结果是Map, 所以可以让foldLeft的zero是Map
        val map3 = map1.foldLeft(map2)((map, kv) => {
            // 假设第一次碰到 a->97
            val key = kv._1 // "a"
            val value = kv._2 // 97
            val v = map.getOrElse(key, 0) // 0
            
            map + (key -> (value + v)) // Map("b" -> 980, "c" -> 99, "a" -> 86)
            
            // 第二次 Map("b" -> 980, "c" -> 99, "a" -> 86)
            // key b
            // value 98
            // v  980
            // 最终 Map("b" -> 1078, "c" -> 99, "a" -> 86)
        })
        
        // 4. ...  key如何允许重复?  ...
        
        println(map3)
    }
}
