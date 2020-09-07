package com.rapjoee.day12.demo04Integer;

/**
 * ClassName:Demo01Integer
 *
 * @Author:baba
 * @Date:2020/2/6 16:26
 * Description:
 * 学习包装类
 * 包装类：
 * 基本数据类型使用起来非常方便但是没有对应的方法来操作这些基本类型的数据
 * 可以使用一个类把基本类型的数据装起来   在类中定义一些方法
 *                  这个类叫做包装类    我们可以使用类中的方法来操作这些基本类型的数据
 *
 * 装箱：把基本类型的数据转换为包装类类型的数据 以int型数据举例  【int -->  Integer】
 *      怎么装箱：
 *          1. 构造方法  Integer(int value)  构造一个新分配的 Integer 对象，它表示指定的 int 值。
 *                      Integer(String s)   构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值
 *                              【此处参String数只能是基本类型的，否则抛出异常】
 *
 *          2. 静态方法  static Integer valueOf(int i)  返回一个表示指定的 int 值的 Integer 实例。
 *                      static Integer valueOf(String s)  返回保存指定的 String 的值的 Integer 对象。
 *                              【此处参String数只能是基本类型的，否则抛出异常】
 *
 * 拆箱：把包装类类型的数据转换为基本数据类型的数据 以int数据举例   【Integer --> int】
 *       怎么拆箱：
 *          两个成员方法：1. int intValue()  以 int 类型返回该 Integer 的值
 *
 */
public class Demo01Integer {
    public static void main(String[] args) {

        //构造方法装箱
        Integer integer1 = new Integer(123);            //int型参数的构造方法，分配给 integer1
        System.out.println("int数据构造装箱后： " + integer1);

        Double double2 = new Double("349");            //String型参数的构造方法，分配给 integer1  【参数只能是基本类型】
        System.out.println("String数据构造装箱后： " + double2);
        //Integer integer3 = new Integer("Hello");            //NumberFormatException  参数不是基本类型则抛出异常

        //静态方法装箱
        Float float1 = Float.valueOf(23.5F);                        //float型参数，分配给对象
        System.out.println("float数据静态装箱后： " + float1);

        Character character1 = Character.valueOf('中');
        System.out.println("char数据静态装箱后： " + character1);
        System.out.println("============================================");

        //拆箱
        int i1 = integer1.intValue();                           //成员方法intValue()拆箱
        System.out.println("拆箱后为： " + i1);
    }
}
