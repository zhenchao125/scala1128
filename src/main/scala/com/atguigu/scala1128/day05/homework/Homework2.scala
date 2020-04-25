package com.atguigu.scala1128.day05.homework

/**
 * Author atguigu
 * Date 2020/4/25 9:24
 */
object Homework2 {
    def main(args: Array[String]): Unit = {
        val lp = new LabeledPoint("Black Thursday", 1929, 230.07)
        println(lp)
    }
}

class Point(val x: Double, val y: Double) {
    val square = math.pow(_: Double, 2)
    
    override def toString: String = s"($x, $y)"
    
    // 计算两个点的距离
    def distance(other: Point) = math.sqrt(square((this.x - other.x)) + square((this.y - other.y)))
}

class LabeledPoint(val label: String, override val x: Double, y: Double) extends Point(x, y) {
    override def toString: String = s"$label, ${this.x}, ${this.y}"
}

/*
6. 设计一个Point类，其x和y坐标可以通过构造器提供。
     提供一个子类 LabeledPoint，
     其构造器接受一个标签值和x,y坐标,
     比如:new LabeledPoint(“Black Thursday”,1929,230.07)

 */