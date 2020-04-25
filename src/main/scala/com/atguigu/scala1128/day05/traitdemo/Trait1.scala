package com.atguigu.scala1128.day05.traitdemo

/**
 * Author atguigu
 * Date 2020/4/25 14:09
 */
object Trait1 {
    def main(args: Array[String]): Unit = {
        val usb: Usb = new HuaweiUSB
        usb.insert()
        usb.work()
        usb.pop()
    }
}

trait Usb {
    println("Usb  的构造器")
    //抽象字段(属性)
    val name: String
    
    val id = "1234567"
    var cid = "abcdef"
    def init() = {
        println(s"$name 开始初始化")
    }
    
    // 抽象方法
    def insert(): String
    
    def work(): Unit
    
    def pop(): Unit
}

class HuaweiUSB extends Usb {
    
    override val name: String = "华为 USB"
    init()
    override def insert(): String = {
        println(s"$name 开始插入设备")
        "ok"
    }
    
    override def work(): Unit = {
        println(s"$name 开始工作")
    }
    
    override def pop(): Unit = {
        println(s"$name 退出成功")
        
    }
}