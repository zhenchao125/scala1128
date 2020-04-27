package com.atguigu.scala1128.day06.arr

/**
 * Author atguigu
 * Date 2020/4/27 14:21
 */
object Array2 {
    def main(args: Array[String]): Unit = {
        // 添加元素
        val arr1 = Array(30, 50, 70, 60, 10, 20)
        //        val arr2 = arr1 :+ 100  // arr1.:+(100)
        val arr2 = 100 +: arr1 // arr1.+:(100)
        myPrint(arr1)
        myPrint(arr2)
        
        
    }
    
    def myPrint(arr: Array[_]) =
        println(arr.mkString(", "))
}
