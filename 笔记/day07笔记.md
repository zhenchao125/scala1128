# 一. 昨日内容回顾

1. 隐式转换

   - 隐式转换函数

     ```scala
     implicit def d2i(d: Double) = d.toInt
     
     val a:Int = 10.1
     // RichFile  RichInt
     
     implicit def d2i(d: File) = new RichFile(file)
     class RichFile(file: File){
     	def readContent = {
             // 读取文件操作
         }
     }
     ```

   - 隐式类

     不能是顶级的

     ```scala
     implicit class RichFile(file: File){
     	def readContent = {
             // 读取文件操作
         }
     }
     ```

   - 隐式参数和隐式值

     和柯里化配合使用

     ```scala
     def foo(c: Int)(implicit a: Int, b: Int) = {
         
     }
     implicit val aa = 10
     foo(10)
     foo(10)()
     ```

     要求: 能看懂别人写的隐式的代码

2. 集合

   可变集合和不可变集合.

   以后使用的时候,有限选择不可变集合.

   - 数组

     - 定长数组

       ```scala
       Array(10, 20)
       new Array[Int](10)
       Array.ofDim(10)
       
       :+ +:  ++:  :++
       ```

     - 可变数组

       ```scala
       ArrayBuffer(10, 20, 30)
       new ArrayBuffer[Int]()
       
       :+= ...
       ```

     - 注意:

       ```scala
       1. 在使用运算符的是, 带 = 的运算符如果用在可变集合,则是更新的原集合
       2. 如果用在不可变集合上, 则是会创建一个更改后的新的集合, 然后把新的集合赋值给原来变量
       	var  a = Array(10, 20)
       	a :+= 30  // ====>    a = a :+ 30
       ```

3. `List`

   - 不可变

     ```scala
     List  // 链表
     val list = List(10,20,30)
     1 :: list   // List(1, 10,20,30)
     val list1 = List(1,2,3)
     list ::: list1   // list1.:::(list) 
     Nil  // 空集合
     ```

   - 可变

     ```scala
     ListBuffer 
     listbuffer :+= 10
     ```

4. 元组

   非常重要

   非常简单

   用来封装类型不同的数据

   ```scala
   val t = (1, 2, false)
   t._1
   t._2
   ```

# 二. `Set`集合

1. 无序不重复

   >  有序: 
   >
   > 取出顺序和放入顺序一致 叫做有序

   >  无序: 
   >
   > 遍历顺序和存入顺序不一致.

   `TreeSet`

   叫自动排序

2. 去重

数学运算

```scala
val set1 = Set(10,20,30,50)
val set2 = Set(1,20,30,5)
// 并
println(set1 ++ set2)  // ++ 所有集合通用
println(set1 | set2)
println(set1.union(set2))
// 交集
println(set1.intersect(set2))  // java
println(set1 & set2)
// 差集
println(set1 &~ set2)
println(set1 -- set2)
println(set1.diff(set2))
        
```

多学一点:

在`scala`中, 几乎所有的集合之间可以互相转换!!!

```scala
val list = 
list.toSet
val set = 
set.toList
set.toArray
set.toBuffer
```

# 三. `Map`集合

`Map` 分可变和不可变.

存储的是键值对.  键值对中的**键不能重复**

1. 在`scala`中, 是使用元组来表示键值对!!!
2. 遍历出来的就是元组
3. 获取元素最好使用`map.getOrElse(key, defaultVlaue)`
4. 可变`Map`多了一个``map.getOrElseUpdate(key, defaultVlaue)``















