package com.rapjoee.day12.demo04Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:Demo04IntegerAndCollection
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/14 18:39
 * Description:
 *
 * 集合与数组之间的转换
 *      集合 --> 数组：
 *              使用集合类的toArray方法
 *      数组 --> 集合：
 *              使用Arrays工具类的asList方法
 *                  【注意：集合中只能放引用类型，所以要想转成功，数组类型基本类型的使用其包装类
 *
 */
public class Demo04IntegerAndCollection {
    public static void main(String[] args) {
        // 1. 数组转集合
        int [] array1 = {12, 45, 2, 78, 4, 23};
        //基本类型转集合，转成的是数组类型，而不是数组里的数据的类型
        List<int[]> intList = Arrays.asList(array1);
        System.out.println("数组基本类型转集合打印为：" + intList);      //[[I@17327b6]

        //要想转换成功必须使用其包装类
        Integer[] array2 = {12, 9, 67, 43 ,23, 15};
        System.out.println("包装类数组打印为：" + Arrays.toString(array2));

        //数组转集合
        List<Integer> list1 = Arrays.asList(array2);
        System.out.println("数组包装类类型转集合打印为：" + list1);      //  [12, 9, 67, 43, 23, 15]
        //集合被固定长度不能往其中添加或者删除数据，但是可以进行比较等等操作
        //list1.add(123);
        //System.out.println("转换后的集合添加珊数据打印为：" + list1);  //UnsupportedOperationException
        boolean b1 = list1.contains(15);
        System.out.println("是否存在 15 这个数据？" + b1);


        //2. 集合转数组  toArray()
        ArrayList<Double> al2 = new ArrayList<>();
        al2.add(12.4); al2.add(12.4);
        al2.add(9.2); al2.add(30.0);
        al2.add(2.6);
        System.out.println("遍历初始化集合为：" + al2);
        Object[] array3 = al2.toArray();

        System.out.println("转数组遍历数组为：" + Arrays.toString(array3));

    }
}
