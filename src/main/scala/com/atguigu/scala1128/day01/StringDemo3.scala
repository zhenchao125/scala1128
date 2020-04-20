package com.atguigu.scala1128.day01

/**
 * Author atguigu
 * Date 2020/4/20 14:29
 */
object StringDemo3 {
    def main(args: Array[String]): Unit = {
//        val sql = "select \n    *\nfrom user\nwhere id > 10"
        // 字符串模板
        val id = 10
        val sql =
        s"""
          |select
          |    *
          |from user
          |where id > $id
          |""".stripMargin
        println(sql)
    }
}
