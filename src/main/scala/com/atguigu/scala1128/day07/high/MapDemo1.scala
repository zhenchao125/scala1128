package com.atguigu.scala1128.day07.high

/**
 * Author atguigu
 * Date 2020/4/28 14:03
 */
object MapDemo1 {
    def main(args: Array[String]): Unit = {
//        val list1 = List(300, 5, 70, 60, 10000, 20)
        /*val list2: List[Int] = list1.map(x => x * x)
        println(list2)*/
        // (数字本身, 数字的位数)
//        val list2: List[(Int, Int)] = list1.map(x => (x, x.toString.length))
//        println(list2)
        
        
        val map = Map("a"-> 97, "b"-> 98, "c"-> 99)
//        val map1 = map.map(kv => kv._2)
        val it = map.map(_._1)   // kv => kv._1
        println(it)
    }
}
