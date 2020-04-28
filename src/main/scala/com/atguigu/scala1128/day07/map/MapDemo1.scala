package com.atguigu.scala1128.day07.map

/**
 * Author atguigu
 * Date 2020/4/28 9:45
 */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
        val map = Map(("a", 97), ("b", 98), ("c", 98))
        //println(map)
        /*for (kv <- map) {  // map中存储的是元组, 所以, 遍历出来的kv就是元组
            println(kv._1)
            println(kv._2)
        }*/
        /*for((k, v) <- map){
            println(k + "  " + v)
        }*/
        /*for((k, 98) <- map){
            println(k)
        }*/
    
        /*for((k, _) <- map){
            println(k)
        }*/
    
        for (k <- map.keySet) {
            println(k)
        }
    }
}
