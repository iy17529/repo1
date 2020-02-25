package com.rapjoee.day09.demo03;

/**
 * ClassName:Zi
 *
 * @Author:baba
 * @Date:2020/1/20 13:23
 * Description:
 */
public class Zi extends Fu {
    String str ="子类成员变量字符串";
    public void method(){
        String str = "子类局部变量字符串";

        System.out.println("输出父类成员变量："+super.str);     //父类成员变量字符串
        System.out.println("输出子类成员变量："+this.str);       //子类成员变量字符串
        System.out.println("输出子类局部变量："+str);            //子类局部变量
    }
}
