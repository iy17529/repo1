package com.rapjoee.day09.demo06;

/**
 * ClassName:Demo01ExtendsPhone
 *
 * @Author:baba
 * @Date:2020/1/21 15:16
 * Description:
 */
public class Demo01ExtendsPhone {
    public static void main(String[] args) {

        Phone ph = new Phone();
        ph.phone();         //父类对象调用父类的方法
        ph.sendMessage();
        ph.show();
        System.out.println("===============");

        NewPhone np = new NewPhone();
        np.show();      //  子类对象调用子类的方法与父类的方法
        np.phone();
        np.sendMessage();
    }
}
