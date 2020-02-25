package com.rapjoee.day10.demo01;

/**
 * ClassName:MyInterfaceAbstract
 *
 * @Author:baba
 * @Date:2020/1/26 9:20
 * Description:
 * 在任何的接口中，都可以定义抽象方法
 * 抽象方法格式：
 * public abstract 返回值类型 方法名(参数);
 *
 * 注意！！
 * 1.接口当中的抽象方法，修饰符固定两个，为：public abstract    【public不可以写成private等】
 * 2.这两个修饰符，可以选择性省略
 * 3.方法三要素可以随意定义
 *
 *接口中也可以定义“成员变量”，但是必须使用public static final三个关键字进行修饰。从效果上看，这就是接口中的【常量】
 *
 * 格式：public static final 数据类型 常量名 = 数据值;           【一旦使用final关键字，则数据永不可变】
 *
 * 注意：
 * 1.接口中的常量，可以省略三个修饰关键字   不写也照样是这样。
 * 2.接口中的常量，必须进行赋值，否则报错。
 * 3.接口中的常量，命名使用完全大写的字母，并且用下划线分隔【类似NUM_OF_CLASS】     【推荐】
 * 4.使用时，直接使用   接口名称.常量名即可
 */
public interface MyInterfaceAbstract {

    public static final int NUM_OF_CLASS = 3;           //public static final三个关键字都可以省略，但效果都是一样的，定义完永不可变

    //这是一个抽象方法
    public abstract void methodAbstract1 (int num);

    //这也是一个抽象方法
    abstract void methodAbstract2 (int num);

    //这也是一个抽象方法
    public void methodAbstract3 (int num);

    //这也是一个抽象方法
    void methodAbstract4 (int num);

}
