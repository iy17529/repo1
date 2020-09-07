package com.rapjoee.day14.demo02;

import java.io.FileNotFoundException;

/**
 * ClassName:Demo06Zi
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 13:37
 * Description:
 */
public class Demo06Zi extends Demo06Fu{
    public static void main(String[] args) {
        Demo06Zi zi = new Demo06Zi();
        zi.show01();
        //zi.show04();
    }

    //子类抛出与父类相同的异常，或者不抛出
    @Override
    public void show01() throws NullPointerException, IndexOutOfBoundsException{}

    //子类抛出父类异常的子类
    @Override
    protected void show03() throws FileNotFoundException {}

    @Override
    protected void show04() throws NullPointerException{
        throw new NullPointerException();
    }

}
