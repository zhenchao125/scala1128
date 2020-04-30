package com.atguigu.scala1128.day09.extra

/**
 * Author atguigu
 * Date 2020/4/30 16:37
 */
object OptionDemo1 {
    def main(args: Array[String]): Unit = {
        //        println(sqrt(-1))
        
        
    }
    
    def sqrt(d: Double) =
        if (d >= 0)
            Some(math.sqrt(d))
        else None
}
