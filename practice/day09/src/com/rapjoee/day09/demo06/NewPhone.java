package com.rapjoee.day09.demo06;

/**
 * ClassName:NewPhone
 *
 * @Author:baba
 * @Date:2020/1/21 15:11
 * Description:
 */
public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();           //使用父类的show方法
        System.out.println("显示头像！！");   //子类自己的方法
        System.out.println("显示姓名！！");
    }
}
