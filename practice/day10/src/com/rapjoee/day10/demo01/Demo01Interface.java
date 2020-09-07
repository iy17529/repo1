package com.rapjoee.day10.demo01;

/**
 * ClassName:Demo01Interface
 *
 * @Author:baba
 * @Date:2020/1/26 9:12
 * Description:
 * 学习接口
 *
 * 接口就是多个类的公共规范。        接口是引用类型，最重要的内容是其中的【抽象方法】
 * 接口格式：
 * public interface 接口名{
 * //接口内容}
 *
 * 备注：换成了关键字interface后，编译产生的字节码文件依旧是.class文件
 *
 * 如果是Java7,接口中包含的内容有
 * 1.常量
 * 2.抽象方法
 *
 * Java8，可以包含：
 * 3.默认方法
 * 4.静态方法
 *
 * Java9，可以包含：
 * 5.私有方法
 *
 * 接口的使用步骤：
 * 1.接口类不可以直接使用，不能创建new对象。必须由一个“实现类”来进行实现该接口【继承】
 *      格式：public class 实现类名 implements 接口名{
 *          //...
 *      }
 * 2.接口的实现类必须覆盖重写（实现）接口类中所有的抽象方法
 *          实现：去除abstract关键字，添加大括号方法体
 * 3.创建实现类的对象，进行使用
 *
 * 注意：如果实现类中并没有覆盖重写所有的抽象方法，则此类必须是一个抽象类，为接口的子类
 */
public class Demo01Interface {
    public static void main(String[] args) {
        //MyInterfaceAbstract mifa = new MyInterfaceAbstract();         错误写法，不能直接new接口类对象

        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodAbstract1(5);
        impl.methodAbstract4(7);
        System.out.println("接口中定义的常量为：" + MyInterfaceAbstract.NUM_OF_CLASS);

    }
}
