package com.atguigu.scala1128.day03.high.Controlabstract

object ControlAbs {
    def main(args: Array[String]): Unit = {
        
        println(Thread.currentThread().getName)
        runInThread {
            println(Thread.currentThread().getName)
        }
        runInThread {
            println(Thread.currentThread().getName)
        }
    }
    
    // 传递一段代码, 让后让这段代码, 在一个子线程中执行
    
    def runInThread(code: => Unit) = {
        new Thread() {
            override def run(): Unit = code
        }.start()
    }
}
