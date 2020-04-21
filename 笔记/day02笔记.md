# day02笔记

## 昨日内容复习

1. 理解scala和java的关系

2. 如何定义变量和常量

3. 数据类型

   - Any

     - AnyVal

       - 对应java的八大基本类型(Int, ...)
         - 编译成字节码之后, 使用的就是java的基本类型
       - Unit   (void)
       - StringOps  (是对java的String的增强)

     - AnyRef

       - 去掉 AnyVal剩下的都是 AnyRef
       - java中所有的类
       - scala中所有集合...
       - String. 而且scala中String, 就是使用的java的String

       - Null   只有一个值 null

     - Nothing  用于辅助类型推导.  代码非正常结束(抛一个异常的时候)

4. 运算符

   在scala中, 没有真正的运算符, 所有的运算符其实都是对象的方法.

   当调用方法的时候, 省略了 . 和 圆括号的时候, 方法就成了运算符了.

   1. 方法没有优先级
   2. 运算符有优先级
   3. 运算符还有结合性(左结合和右结合)

## 1. 运算符的补充

- 没有 ++ -- 运算符. 使用复合赋值运算符来替换

  ```scala
  a += 1  a -= 10
  ```

- 没有3元运算符. 使用if语句来替换

## 2. 流程控制

- 顺序

- 分支(选择)

  - java

    - `if else`

    - `switch`

      1. 限制太多. 

         ```java
         switch(值){
             case 常量: 
                 break;
             case 常量: 
                 
         }
         ```

         `值`的类型是有限制: `byte, char, int, short, enum, String(1.7新增)`

         `case`后面必须是常量

      2. `case`穿透问题

         忘记添加`break`, 则会导致`case`穿透

  - scala

    - if else

      用法和java完全一样!

      但是多了一个功能! ?

    - 不弱于if, 模式匹配. 专门的章节进行讲解

- 循环

## 3. 分支结构

在scala中, 任何的语法结构都有值!!!
1. 针对 if语句来说, if语句值, 是执行的分支中的最后一行代码的值
2. 赋值语句( = , +=, ...)作为一个语法结构, 他也有值. 但是他的值是 Unit类型.  ()

##4.  循环结构

1. java的循环结构

   - for
   - while
   - do ... while

2. scala的循环结构

   - `while`

     `while`的使用方式和java完全一样!!!

     循环语句的值是 Unit 类型, 所以, 他的值没有任何的用处

   - `do ... while`

     `do ... while`的使用方式和java完全一样!!!

   - 其实在scala中, `for`不是一种循环, 而是一种遍历!

### 4.1 for

for本质是遍历"集合". 如果要用for, 得先构建一个集合

`1 to 100`   `[1, 100]`

`1 until 100 `  `[1, 100)`

步长:

```
1 to (100, 2)
1 to 100 by 2

100 to 1 by -1
```

可以完全替换java中的`for`

### 新的花样

1. 退出循环(本质是抛异常和捕捉异常)

   ```scala
   import scala.util.control.Breaks._
   breakable {  // 也是个方法, 内部其实try了抛出的异常
       for (i <- 2 until n) {
           if (n % i == 0) {
               isPrime = false
               break // 抛出异常. 其实是一个方法, 内部在抛异常
           }
       }
   }
   ```

2.  引入变量

   - 在很多情情况, 定义的变量, 如果没有指定var, 那么都是val的

3. 循环嵌套(所有的代码都在内循环)

   ```scala
   for(i <- 1 to 9; j <- 1 to i){
       print(s"$j * $i = ${i * j}\t")
       println()
   }
   ```

   知道怎么用, 实际用的比较少