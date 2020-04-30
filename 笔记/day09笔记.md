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

     

   

