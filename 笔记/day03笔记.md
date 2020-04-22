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

   

