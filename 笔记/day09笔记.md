# 一. 昨日内容回顾

1. 排序

   - `sorted`

     借助于`Ordering`或`Ordered`

   - `sortBy`

     根据指标进行排序

     `sortBy(x => (,,))(Ordering.Tuple3(Ordering.Int, ...))`

   - `sortWith`

     ```scala
     sortWith((x, y) => {
         // 返回值是true  x =< y
         // false x > y
     })
     ```

2. `Stack, Queue, Stream`

3. 模式匹配

   - 匹配变量和常量

     `case  a => `

     `case A => `

   - 匹配类型

     ```scala
     case a:Int => 
     case arr: Array[Int] =>
     case list:List[_] => 
     ```

   - 守卫

     ```scala
     case a:Int if a > 3 => 
     case arr: Array[Int] =>
     case list:List[_] => 
     ```

   - 匹配内容

     ```scala
     Array
     List
     元组  // 模式匹配中的用的特别的多   
     ```

   - 匹配对象

     ```scala
     case A(a) => 
     
     unapply(...): Option[Int] = ...
     ```

# 二 样例类

   对象匹配, 必须要手动在伴生对象中去实现一个`def unapply`方法.

   样例他主要就是为模式匹配而生.

   `case class`

   其实就是`scala`, 替我们实现很多方法, 这些方法大部分可以直接使用.

   ```scala
   apply
   unapply
   hashCode
   equals
   ...
   ```

   ```scala
   case class User(age: Int, name:String)
   
   1. 写在主构造中的属性默认都是val. 如果有需要可以改成var的
   2. 默认实现了很多方法
   	apply
       unapply
       hashCode
       equals
   3. 使用场景
   	- 模式匹配
   	- 替代 java bean
       - 作为进程间通信的通讯协议
   ```

   ## 在变量声明的时候使用模式匹配

   ## 偏函数

  ```scala
val list = List(10, "a", false, 20, 30)
// List(20, 40, 60)
// filter + map
val f: PartialFunction[Any, Double] =  new PartialFunction[Any, Double] {
    // 如果这个函数返回true, 则会对这个x进行处理(交给apply进行处理)
    override def isDefinedAt(x: Any): Boolean = x match {
        case _: Int => true
        case _ => false
    }

    override def apply(v1: Any): Double = v1 match {
        case a:Int => a * 2
    }
}
val list2 =  list.collect(f)  // 等价于了 filter + map
println(list2)
  ```

定义方式2:

用一对大括号括起来的`case`语句, 就是一个偏函数

   

