package com.rapjoee.day23.demo03methodreference;

/**
 * ClassName:Demo01Main
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 14:10
 * Description:
 *
 *              对于方法的函数式接口参数，对比如下两种写法，完全等效
 *          1. Lambda表达式：  useMethod(string, str -> System.out.println(str));
 *          2. 放噶引用写法： useMethod(string, System.out::println);
 *
 *        函数式接口是Lambda的基础，而方法引用则是Lambda的孪生兄弟
 *
 *    第一种语义是指：拿到参数后经Lambda表达式，继而传递给System.out.println()方法进行打印处理
 *    第二种语义是，直接让System.out中的println()方法取代Lambda表达式，两种写法的执行效果一样，但比较简洁
 *
 *    注意！！Lambda表达式中传递的参数一定是方法引用的那个方法【如本例中println()】可以接受的类型，否则抛出异常
 */
public class Demo01Main {
    public static void main(String[] args) {
        String string = "Hello";

        //使用Lambda表达式的方式实现接口，覆盖重写其抽象方法
        useMethod(string, str -> System.out.println(str));

        //Lambda表达式的作用：打印参数传递的字符串
        //把参数传递给System.out对象，调用out对象的println方法对字符串进行输出
                //1. System.out对象已经存在
                //2. println()方法也已经存在
        //所以我们可以使用方法引用来优化Lambda表达式
        useMethod(string, System.out::println);
    }

    /**定义一个方法，传递字符串与自定义函数式接口，打印字符串
     *
     * @param mfi
     */
    private static void useMethod(String str, MyFunctionalInterface mfi) {
        mfi.printString(str);
    }
}
