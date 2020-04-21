package com.atguigu.scala1128.day02.loop

/**
 * Author atguigu
 * Date 2020/4/21 11:42
 */
object ForDemo6 {
    def main(args: Array[String]): Unit = {
        // 引入变量 java:  for(int i = 0, j = 2; i < 100; i++)
        /*for(i <- 1 to 100; j = 10; k = 30){
            /*println(j)*/
            println(System.identityHashCode(i))
//            println(System.identityHashCode(j))
        }*/
        
        // 循环嵌套(打印99乘法表)
       /* for(i <- 1 to 9){
            for(j <- 1 to i){
                print(s"$j * $i = ${i * j}\t")
            }
            println()
        }*/
        for(i <- 1 to 9 ; j <- 1 to i){
            print(s"$j * $i = ${i * j}\t")
            if(i == j) println()
        }
        
    }
}
