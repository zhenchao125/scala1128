package com.atguigu.scala1128.day06.implicitdemo

import java.io.File

import scala.io.Source

object ImplicitDemo4 {
    def main(args: Array[String]): Unit = {
        
        // File => RichFile
        val content = new File("""C:\Users\lzc\Desktop\class_code\2019_11_28\01_scala\scala1128\src\main\scala\com\atguigu\scala1128\day06\implicitdemo\ImplicitDemo4.scala""").readContent
        println(content)
        
    }
    implicit class RichFile(file: File) {
        
        def readContent: String = {
            Source.fromFile(file, "utf-8").mkString
        }
    }
    
}

