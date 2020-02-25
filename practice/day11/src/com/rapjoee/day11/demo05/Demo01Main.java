package com.rapjoee.day11.demo05;

/**
 * ClassName:Demo01Main
 *
 * @Author:baba
 * @Date:2020/2/1 17:04
 * Description:
 * 学习局部内部类中的匿名内部类
 * 如果接口中的实现类 / 类的子类只需要使用唯一的一次，则这种情况下可以省略该实现类/子类，而改为使用【匿名内部类】
 *
 * 匿名内部类的格式为：接口名 对象名 = new 接口名{
 *     //覆盖重写接口所有的抽象方法
 * };
 */
public class Demo01Main {
    public static void main(String[] args) {

    //传统使用接口需要再创建一个实现类，创建对象。太麻烦
    //来试试匿名内部类
    //    MyInterface obj1 = new MyInterface();     错误写法！！
    MyInterface objA = new MyInterface(){                //匿名内部类，对象有名称objA
        @Override
        public void methodAbs1() {          ////覆盖重写其中所有的抽象方法，小括号前面为谁，就覆盖重写谁的抽象方法
            System.out.println("匿名内部类方法A执行");
        }
        @Override
        public void methodAbs2() {
            System.out.println("匿名内部类方法B执行");
        }        //大括号中的就是一个局部内部类，只不过没有名字，即匿名内部类

    };
    objA.methodAbs1();
    objA.methodAbs2();
        System.out.println("=========================================");

    new MyInterface() {                                 //匿名内部类匿名对象，没有对象名，只能调用一次方法
        @Override
        public void methodAbs1() {
            System.out.println("匿名内部类匿名对象方法A");
        }
        @Override
        public void methodAbs2() {
            System.out.println("匿名内部类匿名对象方法B");
        }
    }.methodAbs1();
    }
}
