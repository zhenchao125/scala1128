package com.atguigu.scala1128.day06.arr

/**
 * Author atguigu
 * Date 2020/4/27 16:03
 */
object DimArray {
    def main(args: Array[String]): Unit = {
        val arr: Array[Array[Int]] = Array.ofDim[Int](3, 4)
        arr(0)(3) = 100
        // 遍历二维数组
        /*for (a <- arr) {
            for (elem <- a) {
                println(elem)
            }
        }*/
        
        for(a <- arr; e <- a){
            println(e)
        }
    }
}
