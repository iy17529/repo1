package com.rapjoee.day10.demo04Multi;

/**
 * ClassName:Zi
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/17 11:48
 * Description:
 */
public class Zi extends Fu {
    String str = "子类同名成员变量";
    String stringZi = "子类特有成员变量";

    public void method() {
        System.out.println("子类覆盖重写的方法执行！");
    }

    public void methodZi() {
        System.out.println("子类特有成员方法子子子子子子");
    }
}
