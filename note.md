
# <font color='gold' size=6px>这里是记录java的学习笔记</font>

---

### 1.有关进制问题

![](.note_images/eaddc408.png)

---

### 2.对long数据类型进行定义的时候，需要在数字末尾加一个*L*
### float类型需要在后面加*F*
~~~
    long b = 999999999999L;
    float f = 20.2F
~~~

---

### 3.命名规范
![](.note_images/9136b70f.png)

---

### 4.JAVA项目的Structure:
### <font color='pink'>project(项目)->module(模块)->package(包)->class(类)</font>
![](.note_images/a466c293.png)

（src不是）

---

### 5.运算的隐式转换规则
 - byte->short->int->long->float->double  
取值范围是反过来的
 - byte short char这三种在运算时（不管有没有其他的类型）会先转换成int，再进行运算

---

### 6.逻辑运算符
![](.note_images/832258bd.png)

---

### 7.短路运算符（相比普通的会更加常用）
![](.note_images/b520100e.png)

---

### 8.数组的地址值含义
例如：[I@723279cf  
其中[表示是数组，I表示int类型，后面是16进制的地址,<font color=gold>其实这个地址就是该数据存放在堆中的地址，被赋值给了在栈中定义的变量</font>

---

### 9.堆内存中存放的是所有用new字段创建的对象信息




