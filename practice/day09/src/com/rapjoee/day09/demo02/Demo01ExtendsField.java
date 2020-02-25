package com.rapjoee.day09.demo02;

/**
 * ClassName:Demo01ExtendsField
 *
 * @Author:baba
 * @Date:2020/1/19 19:44
 * Description:
 * 在父子类的继承关系中，如果成员变量重名，则创建子类对象时，访问有两种方式
 *
 * 直接通过子类对象访问成员变量：
 *      等号左边是谁，则优先访问谁,没有则向上找
 * 间接通过成员方法访问成员变量：
 *      该方法属于谁，则优先用谁，咩有则向上找
 *
 */
public class Demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu = new Fu();
        String strResult = fu.strFu;        //只能使用父类的变量，没有任何子类的内容
        System.out.println(strResult);


        Zi zi = new Zi();
        System.out.println(zi.strFu);           // 没有则向上找到父类
        System.out.println(zi.strZi);       //既有父类内容，又有子类内容
        // 等号左边是谁，则优先访问谁
        System.out.println(zi.str1);        // 等号左边是谁，则优先访问谁    此处优先子类为【同名字符串子】

        //这个方法是子类
        zi.methodZi();
        //这个方法是属于父类的【在父类中定义的】，被zi对象调用
        zi.methodFu();
    }
}
