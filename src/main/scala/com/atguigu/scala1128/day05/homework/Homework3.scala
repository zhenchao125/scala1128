package com.atguigu.scala1128.day05.homework

object Homework3 {
    def main(args: Array[String]): Unit = {
        val shape: Shape = new Rectangle(new Point(0, 0), new Point(10, 10))
        println(shape.centerPoint)
        println(shape.area)
        
        val circle1 = new Circle(new Point(0, 0), 10)
        val circle2 = new Circle(new Point(15, 0), 6)
        println(circle1.relative(circle2))
    }
}

abstract class Shape {
    def centerPoint: Point
    
    def area: Double
}

class Rectangle(val leftTop: Point, val rightBottom: Point) extends Shape {
    override def centerPoint: Point =
        new Point((leftTop.x + rightBottom.x) / 2, (leftTop.y + rightBottom.y) / 2)
    
    override def area: Double = (rightBottom.x - leftTop.x) * (rightBottom.y - leftTop.y).abs
}

class Circle(val center: Point, val r: Double) extends Shape {
    override def centerPoint: Point = center
    
    override def area: Double = math.Pi * r * r
    
    // 返回当前圆与其他的圆的关系   相离 相切 相交 内切  内含  同心圆
    def relative(other: Circle) = {
        val distance = this.center.distance(other.center)
        if (distance > (this.r + other.r)) "相离"
    }
}

/*
7. 定义一个抽象类 Shape，一个抽象方法 centerPoint，
以及该抽象类的子类 Rectangle 和 Circle。
为子类提供合适的构造器，
并重写centerPoint方法, 并提供计算面积的方法 (根据需要添加相应的属性)
 
 */
