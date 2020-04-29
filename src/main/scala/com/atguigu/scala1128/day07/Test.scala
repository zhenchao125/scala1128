package com.atguigu.scala1128.day07

import java.util

import com.alibaba.fastjson.{JSON, JSONObject}

/**
 * Author atguigu
 * Date 2020/4/28 17:28
 */
object Test {
    def main(args: Array[String]): Unit = {
        val s =
            """
              |{
              | "age": 20,
              | "name": "lisi",
              | "girls": [
              |     {"name": "zhiling"},
              |     {"name": "ff"}
              |  ]
              |}
              |""".stripMargin
    
        val obj: JSONObject = JSON.parseObject(s)
        val map: util.Map[String, AnyRef] = obj.getInnerMap
        println(map)
    }
}
