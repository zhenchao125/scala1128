package com.atguigu.scala1128.day07.high

import scala.io.{BufferedSource, Source}

/**
 * Author atguigu
 * Date 2020/4/28 15:47
 */
object WordCount3 {
    def main(args: Array[String]): Unit = {
        // 读取文件的内容, 统计文件中每个单词出现的次数
        // 1. 读取文件
        val buffer: BufferedSource = Source.fromFile("c:/1128.txt", "utf-8")
        // 2. 得到每行字符串
        val lines: Iterator[String] = buffer.getLines()
        
        // 3. 把每行字符串切割成一个个的单词
        val words = lines
            .flatMap(_.split(" "))
            .filter(_.trim.length > 0)  // 过滤掉一些脏数据
        
        // 4. 统计
        //        words.toList.groupBy(word => word)
        val wordCount = words.toList
            .groupBy(_.toString)
            .mapValues(_.size)
        println(wordCount)
        
        
    }
}
