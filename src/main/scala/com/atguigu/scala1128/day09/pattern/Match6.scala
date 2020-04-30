package com.atguigu.scala1128.day09.pattern

object Match6 {
    def main(args: Array[String]): Unit = {
        val map = Map("a" -> 97, "b" -> 98, "c" -> 99)
    
        for ((k, 98) <- map) {
            println(k)
        }
        
        
    }
    
   
}
