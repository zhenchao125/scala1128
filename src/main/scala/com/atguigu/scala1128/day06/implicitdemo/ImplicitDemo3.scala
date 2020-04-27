package com.atguigu.scala1128.day06.implicitdemo

import java.time.LocalDate
import java.util.Date

/**
 * Author atguigu
 * Date 2020/4/27 9:08
 */
object ImplicitDemo3 {
    def main(args: Array[String]): Unit = {
        implicit def int2RichInt(day: Int) = new RichInt(day)
        
        //  3 days ago  // 2020-04-24
        val ago = "ago"
        println(3 days ago)
        
        //2 days later  // 2020-04-29
        val later = "later"
        println(80 days later)
    }
}

class RichInt(day: Int) {
    def days(when: String) = {
        if("ago" == when){
            LocalDate.now().minusDays(day).toString
        }else{
            LocalDate.now().plusDays(day).toString
        }
    }
}

