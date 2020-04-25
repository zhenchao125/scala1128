package com.atguigu.scala1128.day05.traitdemo

/**
 * Author atguigu
 * Date 2020/4/25 14:32
 */
object Trait2 {
    def main(args: Array[String]): Unit = {
        val usb: Usb = new HuaweiTeleophone
//        usb.start()
        usb.foo()
        
        
    }
}

trait NFC {
    println("NFC 开始初始化...")
    
    // 如果返回的是Unit, 则返回值类型和: 都可以省略
    def start(): Unit
    
    def stop()
    
    def foo()
    
}

class HuaweiTeleophone extends NFC with Usb with Serializable {
    override val name: String = "华为手机..."
    
    override def insert(): String = {
        println(s"$name 的usb开始插入")
        "ok"
    }
    
    override def work(): Unit =
        println(s"$name 的usb开始work")
    
    override def pop(): Unit =
        println(s"$name 的usb 弹出")
    
    override def start(): Unit = {
        println(s"$name 的NFC 开启")
        
    }
    
    override def stop(): Unit =
        println(s"$name 的NFC 关闭")
    
    override def foo(): Unit = {
        println("usb 和 nfc 都存在的抽象方法")
    }
}