package com.atguigu.scala1128.day01

import java.io.{BufferedReader, InputStreamReader}
import java.util.Scanner

import scala.io.StdIn

object Input {
    def main(args: Array[String]): Unit = {
        // 从键盘读数据
        // 1. java: 使用System.in直接读, 做一些封装
        val reader = new BufferedReader(new InputStreamReader(System.in))
        val line: String = reader.readLine()
        println(line)
        // 2. java: jdk 1.5之后, Scanner
        val scanner = new Scanner(System.in)
        val line2: String = scanner.nextLine()
        println(line2)
        // 3. scala
        //        println("请输入你的银行卡密码: ")
        val line3: String = StdIn.readLine("请输入你的银行卡密码: ")
        println(line3)
        
        
    }
}
