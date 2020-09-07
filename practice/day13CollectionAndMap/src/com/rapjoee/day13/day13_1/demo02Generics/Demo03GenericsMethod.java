package com.rapjoee.day13.day13_1.demo02Generics;

/**
 * ClassName:Demo03GenericsMethod
 *
 * @Author:baba
 * @Date:2020/2/7 14:10
 * Description:
 * 定义与使用含有泛型的方法【泛型定义在方法的返回值与参数中】
 *
 *      方法被调用时，确定泛型的数据类型
 *      传递什么类型的参数，泛型就什么类型
 *
 * 格式：修饰符 (static) <泛型> 返回值类型 方法名(泛型参数){
 *     //...
 * }
 */
public class Demo03GenericsMethod {

    public static void main(String[] args) {
        Demo03GenericsMethod gm = new Demo03GenericsMethod();
        gm.genericsMethod1("普通方法");                      //方法传递String类型参数，泛型为字符串类型
        gm.genericsMethod1('哈');

        System.out.println("========================");
        genericsMethod2("静态方法");                        //静态方法传递String参数
        Demo03GenericsMethod.genericsMethod2(18.456F);      //通过类名调用静态方法
    }

    private static <W> void genericsMethod2(W w) {
        System.out.println(w);
    }

    private <Q> void genericsMethod1(Q q) {     //定义并使用一个含有泛型的方法
        System.out.println(q);
    }


}
