# Day03笔记

## 1. 昨日内容回顾

### 分支

`if`

模式匹配

### 循环

`while,  do ...while`

`for`  本质是一种遍历, 迭代集合中的所有元素

1. 要用for, 首先得有一个集合  `a to b`  `a until b`

   `2 until 2`  是一个空集合

2. 守卫 

3. for 推导

   `for(i <- 1 to 10)  yield i * i`

4. for 增加新的变量

5. for的嵌套

6. 退出循环

   本质其实是抛异常和捉异常

   `Breaks.break` 抛  `Breaks.breakable{ // for在这里  }` 捉

### 函数式编程

1. 函数是一等公民: 可以作为参数传递, 可以作为返回值返回, 作为值存储到变量中...

2. 函数定义

3. 各种简化:  最后一行的值自动返回, 返回值类型可以推导, 当返回的是Unit时 `:Unit = ` 可以省....

4. 调用的时候:  如果参数的格式是0, 则圆括号可以省

   ```scala
   def foo() = {}
   foo()
   foo  // 省略圆括号
   ```

5. 如果声明的时候, 没有圆括号, 调用的时候必须也没有

   ```scala
   def foo = {}
   foo  // 省略圆括号
   ```

6. 默认值,

   ```scala
   def foo(a: Int = 10) = {}
   foo(10)
   foo()  // 使用默认值
   ```

7.  命名参数,

   ```scala
   def foo(a: Int = 10, b: Int) = {}
   foo(b = 100)
   ```

8.  可变参数

   ```scala
   def foo(a: Int*) = {
       // a当做数组来用, "集合"
   }
   foo()
   foo(1)
   foo(2, 3)
   
   val arr = Array(10,20,30)
   foo(arr:_*)
   ```

9. 在scala中, 所有的参数, 默认都是`val`的

   ```scala
   def foo(a: Int) = {
       println(a)
       a = 100  // 错误.  a是val的, 不能修改
       var b = a // 定义新的变量,去修改新定义的变量
       b = 100
   }
   ```


## 2. 高阶函数

参数有函数或者返回值是函数的函数就是高阶函数!!!

### 2.1 匿名函数

定义: 没有名字的函数, 就叫匿名函数

作用:  一般用于向高阶函数传递参数

返回值类型: 一般开推导出来.

重要: 用于不要在匿名函数中使用 `return`

用法:

1. 作为值存储在变量中

   ```scala
   val f = (a: Int) => a + 10
   val f1 = (a: Int, b:Int) => a + b
   val f2 = () => println(".....")
   ```

2. 给高阶函数传值

   ```scala
   // 定义高阶函数
   def foo(op: (Int, Int) => Int) = op(10, 20)
   
   val r = foo( (a: Int, b:Int) => a + b  )  // 30
   
   val r1 = foo( (a, b) => a + b )
   
   val r2 = foo( _ + _ )
   ```

   ## 2.2 高阶函数的具体使用

   1. foreach
   2. map
   3. reduce
   4. filter









