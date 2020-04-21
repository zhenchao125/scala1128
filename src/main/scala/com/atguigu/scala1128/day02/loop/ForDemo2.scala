package com.atguigu.scala1128.day02.loop

/**
 * Author atguigu
 * Date 2020/4/21 10:26
 */
object ForDemo2 {
    def main(args: Array[String]): Unit = {
        // 如何用for去输出1-100所有的值
        // 1. 本质是遍历, 遍历一个集合
        // 2. 想办法得到一个存储1-100所有的值的集合
        /*val a = 0.to(99)  // [1, 100]
        for(i <- a){
            println(i)
        }*/
        
        /*for(i <- 0.to(100)){
            println(i)
        }*/
        
        /*for(i <- 0 to 100){
            println(i)
        }*/
        
        // for(int i = 0; i <= 100; i += 2){   }
        // 0.to(100).by(2)
        /*for(i <- 0 to 100 by 2){
            println(i)
        }*/
        /*for(i <- 0 to (100, 2)){ // for(i <- 0 to 100 by 2)
            println(i)
        }*/
        
        // for(int i = 100; i >= 0; i--){}
        
        for(i <- 100 to 0 by -2){
            println(i)
        }
    }
}
