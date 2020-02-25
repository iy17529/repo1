package com.rapjoee.day05.demo01;

/**
 * ClassName:Demo01Array
 *
 * @Author:baba
 * @Date:2020/1/9 18:10
 * Description:
 *
 *  数组：
 *      1、是一种引用数据类型
 *      2、数组中的数据，类型必须统一
 *      3、数组一旦被创建，其长度不可改变
 *
 *   数组的初始化：在内存中创建数组，并向其中赋予一些默认值
 *
 *   两种初始化的方式：
 *          静态初始化：创建数组时指定其内容
 *              格式：数据类型 []数组名 = new 数据类型 [] {元素1，元素2};
 *              省略格式：数据类型 []数组名 =  {元素1，元素2};
 *          动态初始化：创建数组时指定其长度
 *              格式：数据类型 []数组名 = new 数据类型 [数组长度];
 *
 *       解析含义：左侧数据类型：保存的数据都是统一的类型
 *                左侧中括号：表示它是数组(不是变量)
 *                右侧new：创建数组的动作，在内存中开辟空间
 *                右侧数据类型：与左侧数据类型保持一致
 *
 */
public class Demo01Array {
    public static void main(String[] args) {
        //    动态的格式：数据类型 []数组名 = new 数据类型 [数组长度];
        int [] arrayA= new int [300];
        //    静态的格式：数据类型 []数组名 = new 数据类型 [] {元素1，元素2};
        double [] arrayB= new double[]{12,23,45.0,17.2};

        //可以拆分为：
        double [] arrayb;
        arrayb = new double[]{12,23,45.0,17.2};
        String [] arrayC= new String[5];
    }
}
