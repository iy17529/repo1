package com.rapjoee.day09.demo07super;

/**
 * ClassName:Zi
 *
 * @Author:baba
 * @Date:2020/1/25 15:19
 * Description:
 */
public class Zi extends Fu{
    int num = 20;

    public Zi(){
        super();        //这个构造方法访问的是父类的构造方法
    }

    public void methodZi(){
        System.out.println(num);        //这里输出的是20的这个子类定义的成员变量num
        System.out.println(super.num);      //这里访问的是父类定义的成员变量num10
    }

    public void method(){
        System.out.println("子类成员方法！！");     //这里访问的是子类的方法
        super.method();     //这里访问的是父类的方法
    }


}
