# 一. 昨日内容回顾

1. `Set`集合

   可变不可变

   无序不可重复

   `| & &~`  只用于`Set`

2. `Map`集合

   `Map`内存的是键值对, 键值对的本质在`scala`中使用`(k, v)`元组

   不可变和可变`getOrElse(k, defaultValue)`

   可变``getOrElseUpdate(k, defaultValue)``

3. 运算

   `head, tail`

   `foreach`, `map, filter, reduce, groupByKey, foldLeft`, `flatMap`

   

## 二. `scan`

```
scanLeft   // 是foldLeft的升级版. 得到的仍然是个集合,但是别原来集合长度 + 1
scanRight
```

# 三. `sort`

排序不涉及任何的具体排序算法!!!(冒泡, 选择, 插入, 希尔, 快速, 归并)

如何让`scala`给我们排序!!!

提供了3个算子来给我们排序:

1. `sorted`
2. `sortBy`(必须掌握)
3. `sortWith`

另外掌握一个: `Ordering`的使用

注意: 不管是对可变还是不可变, 都不会修改原集合, 都是返回一个新的排好序.



> `java`中的排序, 涉及到元素的比较大小
>
> 1. 元素自己可以和其他的兄弟比较   1 < 2
>
>    让类实现`Comparable接口`
>
> 2. 找一个比较器进行比较两个元素大小  `c.compare(a. b)`  优先级高
>
>    `Comparator`
>
>    - `compare(a, b)`
>
>      如果返回值小于零   a < b
>
>      返回值等于 a == b
>
>      返回值大于零  a > b



在`scala`中, 如果要排序, 那么集合应该满足以下两点之一:

1. 让你的集合中的元素有比较的能力(知道)

   ```scala
   class User1(val age: Int, val name: String) extends Ordered[User1] {
       
       override def toString: String = s"[age = $age, name = $name]"
       
       override def compare(that: User1): Int = this.age - that.age
   }
   ```

2. 使用比较器.(必须要会写)

   方式1不够灵活, 如果想更改比较的逻辑, 需要去更改自定义类型的定义, 不够灵活.

   比较器就比较灵活!!!

   ```scala
   // 在java中使用的Comparator
   // 在scala中, 有一个更加牛逼的Comparator的子类: Ordering
   ```

   内置一些常见类型的`Ordering`, 但是对自定含义没有内置!!!

## `sortBy`

就用这个`sortBy`, 他可以解决`99.99%`的排序

## `sortWith`

```scala
val list2 = list1.sortWith(_ > _)
```

```
队列:
    FIFO 先进先出
    入队  enqueue
    出队  dequeue
栈:
    FILO  先进后出
    push 入栈
    pop 出栈
```

# 四. 集合总结

## 常用的集合

`Array, List, Set, Map` `Option`   必须掌握

## 集合的基本操作

遍历, 取值,` head, tail`....

## 高级操作

```
foreach
map     进行数据结构调整
flatMap   匿名函数的返回值必须是集合
filter	  过滤. ETL
reduce    聚合(原理)
foldLeft  左折叠(聚合), 多了一个零值, 决定了最终的结果类型
groupBy   分组. 之后, 一般需要map进行调整
sortBy	  排序. 传排序的指标. 
		   知道如何定义  Ordering(比较元素大小的)
```

# 五 模式匹配

是对`java`中的`switch`的升级, 功能远远大于`switch`

1. 模式匹配的时候, 如果匹配不到, 则会抛异常

2. 匹配所有

   ```scala
   case aa =>
   	// 可以使用匹配到值
   
   case _ => 
   	// 匹配到的值用不了
   
   本质一样(所有)!!!
   ```

3. 关于匹配常量还是变量

   ```scala
   case Baaaa =>  // Baaaa是常量
   case baaaa => // baaaa新定义的变量
   
   ```

   注意: 

   - `case`后面首字母是大写,表示常量, 首字母是小写表示变量

4. 任何的语法结构有值

   模拟匹配也有值. 值就是匹配成功的那个`case`的最后一行代码的值

5. 匹配类型(简单)

   ```scala
   //        val a: Any = 100
   val a: Any = 99
   a match {
       // 只匹配大于等于100的整数. 守卫
       case a: Int if a >= 100 && a <= 110 =>
       println(a to 110)
       case b: Boolean =>
       println("是一个boolean: " + b)
   }
   ```

   6. 匹配类型(复杂)

      ```scala
      如果是带泛型的类型, 泛型匹配不出来.
      
      泛型擦除? 
      	泛型出现的目的, 是为了在写代码的时候类型更安全!!!
      	但是泛型只是出现在编译时, 编译成字节码之后, 泛型就不存在!!!
      	
          // 如果是带泛型的类型, 泛型匹配不出来
          case a: List[_] =>
          	println("List[_]....")
      
      数组中的类型可以匹配!!! 为啥?
      	scala的数组, 本质就是java的数组!!!  new int[] new double[]
      ```

   7. 匹配内容

      本质是匹配对象!!!

      - 匹配数组的内容
      - 匹配List的内容
      - 匹配元组的内容

      

