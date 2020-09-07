package com.rapjoee.day16.demo03Lambda;

/**
 * ClassName:Demo02Lamda
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 19:52
 * Description:
 *
 * Lambda初体验【Jdk8新特性】
 */
public class Demo02Lambda {
    public static void main(String[] args) {

        //使用匿名对象+匿名内部类创建一条新线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名对象匿名内部类创建了[" + Thread.currentThread().getName() +"]");
            }
        }).start();

        //使用Lambda表达式创建
        new Thread(() ->
                System.out.println("Lambda表达式创建了[" + Thread.currentThread().getName() +"]")
          ).start();

        //Lambda表达式省略写法：
        new Thread(()-> System.out.println("Lambda省略式创建了[" + Thread.currentThread().getName() +"]")).start();
    }
}
