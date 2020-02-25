package com.rapjoee.day09.demo07super;

/**
 * ClassName:Fu
 *
 * @Author:baba
 * @Date:2020/1/25 15:19
 * Description:
 * super关键字有三个用法：
 * 1.在子类成员方法中，访问父类成员变量
 * 2.在子类成员方法中，访问父类成员方法
 * 3.在子类构造方法中，访问父类构造方法
 */
public class Fu {
    int num = 10;

    public Fu(){
    }
    public void method(){
        System.out.println("父类成员方法！！");
    }
}
