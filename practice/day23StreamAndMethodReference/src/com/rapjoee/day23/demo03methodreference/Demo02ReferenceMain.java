package com.rapjoee.day23.demo03methodreference;

/**
 * ClassName:Demo02ReferenceMain
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 14:39
 * Description:
 *
 * 通过对象名引用成员方法
 *
 *      使用前提：
 *          1. 对象名已经存在
 *          2. 对象的成员方法也存在
 *        这样就可以使用对名来引用成员方法
 */
public class Demo02ReferenceMain {
    public static void main(String[] args) {
        useMethod("HelloWorld!", (String s) -> {
            //创建这个对象，并调用其方法对字符串进行大写打印
            ReferenceObject rfo = new ReferenceObject();
            rfo.printUpperCaseToString(s);
        });
        System.out.println("============================");

        //上面的代码可以使用方法引用来进行优化
                //对象时存在的，对象的方法也是存在的
        ReferenceObject rfo2 = new ReferenceObject();
        useMethod("How do you do", rfo2::printUpperCaseToString);
    }

    private static void useMethod(String str, MyFunctionalInterface mfi) {
        mfi.printString(str);
    }
}
