package com.rapjoee.day08.demo03;

/**
 * ClassName:Demo02StaticMethod
 *
 * @Author:baba
 * @Date:2020/1/19 16:08
 * Description:
 * 学习成员方法被static关键字修饰的情况
 * 一旦成员方法被static关键字修饰，则其成为静态方法  不属于对象，而属于类
 *
 * 如果没有static关键字，则需要创建对象，才能通过对象使用它
 * 如果有static关键字，不需要创建对象，通过类名称就可以使用它
 *
 * 总结：无论是成员变量还是成员方法。如果有了static，都推荐使用类名称进行调用、
 * 静态变量：类名.静态变量
 * 静态方法:类名.静态方法()
 *
 * 注意：
 * 1.静态直接不能访问非静态   【】原因：内存中先有的静态内容，后有的非静态
 * 2.静态方法中不能用this关键字    【】原因：静态方法越过了对象【静态与对象无关】，而this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass mc = new MyClass();//首先创建对象
        mc.method();//普通方法属于对象，创建对象才可以被对象调用

        mc.methodStatic();//静态方法也能被对象调用【不推荐 因为用对象名称调用，会误认为是普通成员方法】，也可以通过类名称调用
        MyClass.methodStatic();//静态方法直接由类调用【推荐】

        //本类下的静态方法可以直接写方法名调用，无需写类名
        methodOwn();
        //完全等效如下：
        Demo02StaticMethod.methodOwn();
    }

    public static  void methodOwn(){
        System.out.println("自己的方法！");
    }
}
