package com.rapjoee.day14.demo02;

import java.util.Objects;

/**
 * ClassName:Demo02Throw
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 10:39
 * Description:
 *
 * 学习异常的处理
 *      方式一：throw关键字抛出异常
 *      1. throw关键字必须写在方法的内部
 *      2. throw关键字后边new 的对象必须是Exception或者Exception的子类对象
 *      3. throw抛出指定的异常，我们必须处理这个异常对象
 *              3.1 如果创建的是RuntimeException或者它的子类对象，我们可以不处理，默认交给jvm处理【红色字体打印异常并中断程序】
 *              3.2 如果throw关键字后边创建的是编译异常（写代码时报错）。则我们必须处理这个异常，要么throws，要么try...catch
 *
 *      Objects类中一个方法requireNonNull()可以对传递的对象进行null判断
 *                      public static <T> T requireNonNull(T obj) {
 *                              if (obj == null)
 *                                  throw new NullPointerException();
 *                            return obj;}
 */
public class Demo02Throw {
    public static void main(String[] args) {
        int [] array1 = null;
        //int ele = getEle(array1, 9);                //接收返回值
        getEle2(array1);
    }

    private static void getEle2(int []arr) {
        //直接调用即可
        Objects.requireNonNull(arr);
        //重载形式，可以输出警示信息
        Objects.requireNonNull(arr,"传递参数数组为空！！");
    }

    /*
    定义一个方法，计算指定数组索引位置的值并返回
    参数：
        数组arr
        索引值in
    返回值：
        指定索引位置的值
    需要对传递进来的参数进行合法性校验
            数组不能为null，否则使用抛出异常的方式，告知方法调用者传递的参数有问题
            索引必须在数组的【长度-1】范围内，否则抛出异常告知调用者
     */
    private static int getEle(int [] arr,int in) {
        if(arr == null) {               //对传递的参数数组进行校验，不能为null
            //NullPointerException是RuntimeException，jvm处理
            throw new NullPointerException("传递的数组参数为null！！");
        }
        if(in < 0 || in > arr.length - 1) {         //对传递的参数索引进行校验，不能越界
            //ArrayIndexOutOfBoundsException也是一个 RuntimeException，jvm处理
            throw new ArrayIndexOutOfBoundsException("参数索引越界！！");       //java.lang.ArrayIndexOutOfBoundsException: 参数索引越界！！
        }
        int i = arr[in];
        return  i;
    }
}
