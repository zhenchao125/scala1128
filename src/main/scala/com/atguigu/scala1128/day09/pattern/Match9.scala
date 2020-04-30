package com.atguigu.scala1128.day09.pattern

/**
 * Author atguigu
 * Date 2020/4/30 11:08
 */
object Match9 {
    def main(args: Array[String]): Unit = {
//        val list = List((1, 2), (10, 20), (100, 200))
        /*val list2 = list.map(ele => {
            (ele._1 + 100, ele._2)
        })*/
        /*val list2 = list.map{
//            case ele => (ele._1 + 100, ele._2)
            case (age, name) => (age + 100, name)
        }
        println(list2)*/
    
    
        val list = List((1, (2, 100)), (10, (20, 300)), (100, (200, 400)))
        val list2 = list.filter{
            case (a, (b, c)) => c == 300
        }
        println(list2)
    }
}
