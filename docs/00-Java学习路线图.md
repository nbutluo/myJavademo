# Java 零基础学习路线图

> 适用人群：有 PHP 开发经验，从零学习 Java

---

## 阶段一：Java 基础语法

### 1. 基本数据类型 ✅
- [x] 8种基本类型（int、long、float、double、char、boolean、byte、short）
- [x] 变量定义语法
- [x] 类型后缀（F、L）
- [x] 整数溢出
- [x] float/double 精度问题

### 2. 包装类型 ✅
- [x] 基本类型 vs 引用类型
- [x] 8种包装类（Integer、Long、Float、Double...）
- [x] 自动装箱 / 拆箱
- [x] 包装类常用方法（parseInt、MAX_VALUE 等）

### 3. 运算符 ⬜
- [ ] 算术运算符（`+` `-` `*` `/` `%`）
- [ ] 赋值运算符（`=` `+=` `-=` `*=` `/=`）
- [ ] 比较运算符（`==` `!=` `>` `<` `>=` `<=`）
- [ ] 逻辑运算符（`&&` `||` `!`）
- [ ] 自增自减（`++` `--`）
- [ ] 三元运算符（`? :`）

### 4. 类型转换 ✅
- [x] 自动类型转换（小范围 → 大范围）
- [x] 强制类型转换（`(int) 3.14`）
- [x] 字符串与数字互转（`Integer.parseInt`、`String.valueOf`）

### 5. 字符串 String ✅
- [x] 字符串定义与拼接
- [x] 常用方法（`length`、`substring`、`indexOf`、`replace`、`split`）
- [x] 字符串比较（`==` vs `equals`，与 PHP 的区别）
- [ ] StringBuilder（高效字符串拼接）

### 6. 流程控制 ✅（与 PHP 一致）
- [x] `if / else if / else`
- [x] `switch / case`
- [x] `for` 循环
- [x] `while` 循环
- [x] `do...while` 循环
- [x] `break` / `continue`

### 7. 数组 ✅
- [x] 数组定义与初始化（静态 / 动态）
- [x] 数组遍历（普通 for、增强 for-each）
- [x] 数组打印与工具类（`Arrays.toString`、`Arrays.deepToString`、`Arrays.sort`）
- [ ] 常用操作（二分查找等深入操作）

### 8. 方法（函数） ⬜
- [ ] 方法定义语法
- [ ] 参数与返回值
- [ ] 方法重载（Overload）
- [ ] 递归

---

## 阶段二：面向对象（OOP）

### 9. 类与对象 ⬜
- [ ] 类的定义（class）
- [ ] 创建对象（new）
- [ ] 成员变量与成员方法
- [ ] 构造方法（Constructor）
- [ ] `this` 关键字

### 10. 封装 ⬜
- [ ] 访问修饰符（`public`、`private`、`protected`）
- [ ] getter / setter 方法

### 11. 继承 ⬜
- [ ] `extends` 关键字
- [ ] 方法重写（Override）
- [ ] `super` 关键字
- [ ] 单继承规则

### 12. 多态 ⬜
- [ ] 向上转型 / 向下转型
- [ ] 接口（`interface`）
- [ ] 抽象类（`abstract`）

---

## 阶段三：常用核心类库

### 13. 集合框架 ⬜
- [ ] `ArrayList`（动态数组，类似 PHP 数组）
- [ ] `HashMap`（键值对，类似 PHP 关联数组）
- [ ] `List`、`Map`、`Set` 接口
- [ ] 遍历集合（for-each、迭代器）

### 14. 异常处理 ⬜
- [ ] `try / catch / finally`
- [ ] 常见异常类型
- [ ] 自定义异常
- [ ] `throws` 关键字

### 15. 输入输出（IO） ⬜
- [ ] `Scanner` 读取控制台输入
- [ ] 文件读写基础

---

## 阶段四：进阶（了解即可）

### 16. 泛型 ⬜
- [ ] 什么是泛型（`<T>`）
- [ ] 泛型类、泛型方法

### 17. Lambda 与函数式编程 ⬜
- [ ] Lambda 表达式
- [ ] Stream API

### 18. 多线程基础 ⬜
- [ ] 线程创建（Thread、Runnable）
- [ ] 同步与锁

---

## 学习进度追踪

| 阶段 | 完成数 | 总计 |
|------|--------|------|
| 阶段一：基础语法 | 2 | 8 |
| 阶段二：面向对象 | 0 | 4 |
| 阶段三：常用类库 | 0 | 3 |
| 阶段四：进阶 | 0 | 3 |

---

> 💡 **学习建议**：每学完一个知识点，就在对应的 `[ ]` 改为 `[x]`，追踪自己的进度！
