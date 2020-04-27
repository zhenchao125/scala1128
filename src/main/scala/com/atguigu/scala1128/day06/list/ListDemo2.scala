package com.atguigu.scala1128.day06.list

/**
 * Author atguigu
 * Date 2020/4/27 16:10
 */
object ListDemo2 {
    def main(args: Array[String]): Unit = {
        /*val list1 = List(30, 50, 70, 60, 10, 20)
        val list2 = List(3, 5, 7, 6, 1, 2)
        //        val list3 = list1 ++ list2
//        val list3: List[Int] = list1 ::: list2  // list2.:::(lit1)
        val list3 = list1 :: list2  // list1当做一个整体
        println(list3)
        */
        /*val list = List[Int]()
        Nil*/
        // 10 20 30
        val list: List[Int] = 10 :: 20 :: 30 :: (Nil :+ 100) // List(10,20,30, 100)
        /*println(list)*/
        val seq = Seq(10, 20, 30)  // 默认对象 等价于 List(10, 20, 30)
        println(seq.isInstanceOf[List[Int]])
        println(seq)
        println(list)
        
    }
}
