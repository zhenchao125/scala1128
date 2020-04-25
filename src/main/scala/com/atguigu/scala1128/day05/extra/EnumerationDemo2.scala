package com.atguigu.scala1128.day05.extra

import com.atguigu.scala1128.day05.extra.WeekDay.WeekDay

object EnumerationDemo2 {
    def main(args: Array[String]): Unit = {
    
    }
}

object WeekDay extends Enumeration {
    type WeekDay = Value
    val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}