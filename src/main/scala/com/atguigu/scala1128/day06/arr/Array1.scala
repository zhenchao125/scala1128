package com.atguigu.scala1128.day06.arr

/**
 * Author atguigu
 * Date 2020/4/27 14:21
 */
object Array1 {
    def main(args: Array[String]): Unit = {
        val arr: Array[Int] = Array(10, 20, 30)
        arr(0) = 100
        println(arr(0))  // arr(0)
        
        /*for (elem <- arr) {
            println(elem)
        }
        // 10表示数组的长度
        val arr1 = new Array[Int](10)
        myPrint(arr1)*/
        
        
    }
    
    def myPrint(arr: Array[_]) =
        println(arr.mkString(", "))
}
