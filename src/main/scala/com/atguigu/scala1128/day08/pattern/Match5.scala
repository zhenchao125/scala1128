package com.atguigu.scala1128.day08.pattern

object Match5 {
    def main(args: Array[String]): Unit = {
        // 匹配数组  匹配带泛型
        //        val a: Any = Array[Double](1.1, 2, 3)
//        val a: Any = List[Double](10.1, 20, 30)
        val a: Any = Map(1->2)
        a match {
            case a: Array[Int] =>
                println("Array[Int]...")
            
            // 如果是带泛型的类型, 泛型匹配不出来
            case a: List[_] =>
                println("List[_]....")
            case m: Map[_, _] =>
                println("Map[_, _]...")
                
        }
    }
}
