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
2. `sortBy`
3. `sortWith`

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