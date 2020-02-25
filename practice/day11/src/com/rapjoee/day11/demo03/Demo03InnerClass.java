package com.rapjoee.day11.demo03;

/**
 * ClassName:Demo03InnerClass
 *
 * @Author:baba
 * @Date:2020/2/1 14:22
 * Description:学习局部内部类
 * 只能定义在方法中的类称局部内部类，只能作用于方法【大括号内】，出了方法不可使用
 *
 * 格式：修饰符 class 外部类名{
 *     修饰符 返回值类型 方法名(参数){
 *         class 内部类名{
 *
 *         }
 *     }
 * }
 *
 * 备注：：权限修饰符：
 * public > protected > (default) > private
 * 定义一个类时，权限修饰符规则：
 * 1. 外部类：只能是【 public / (default) 】
 * 2. 成员内部类：四种皆可【 public / protected / (default) / private】
 * 3. 局部内部类：什么都不能写   因为只能作用于本方法中
 */
public class Demo03InnerClass {

    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();
        outer2.methodOuter();
    }
}
