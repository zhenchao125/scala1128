package com.atguigu.scala1128.day06.implicitdemo

import java.io.{File, FileReader}

import scala.io.Source

/**
 * Author atguigu
 * Date 2020/4/27 9:08
 */
object ImplicitDemo2 {
    def main(args: Array[String]): Unit = {
        // 读取文本文件中的内容  java: IO
        implicit def file2RichFile(file: File) = new RichFile(file)
        
        val content = new File("C:\\Users\\lzc\\Desktop\\class_code\\2019_11_28\\01_scala\\scala1128\\src\\main\\scala\\com\\atguigu\\scala1128\\day06\\implicitdemo\\ImplicitDemo2.scala").readContent
        println(content)
    }
}

class RichFile(file: File) {
    
    // 这个方法要真正的去封装读 文件 内容的代码
    def readContent: String = {
        // Array(1,2,3,4)  => arr.mkString   "1234"
        // Array(1,2,3,4)  => arr.mkString(",")   "1,2,3,4"
        Source.fromFile(file, "utf-8").mkString
    }
}
