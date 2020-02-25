package com.rapjoee.day01.demo02;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName:SelectSort
 *
 * @Author:baba
 * @Date:2020/2/2 16:48
 * Description:
 * 选择排序思路：
 * 1. 把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来，比较完，第一位就是最小的
 * 2. 从第二位和剩余的其他所有进行比较，只要比第二位小的，换到第二个位置来，比较完，第二位是第二小的
 * 3. 以此类推
 */
public class SelectSort {

    public static void main(String[] args) {
        Random ra = new Random();
        int [] array1 = new int[18];

        //循环给数组赋值随机数，范围为10~99
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ra.nextInt(90) + 10;
        }

        //int[] array1 = {1, 23, 6, 45, 19, 32, 98, 54, 20};
        System.out.println("原始数组为：" + Arrays.toString(array1));
        int[] result = selectSort(array1);          //赋值调用
        System.out.println("排序后数组为：" + Arrays.toString(result));

    }

    public static int[] selectSort(int[] arrayParam) {          //选择排序方法

        /*//第一步、第一位与其他所有进行比较，比第一小则交换，完成则第一位最小
        for (int i = 1; i < arrayParam.length; i++) {
            if (arrayParam[0] > arrayParam[i]) {
                int temp = arrayParam[i];
                arrayParam[i] = arrayParam[0];
                arrayParam[0] = temp;
            }
        }

        //第二步、第二位与其他所有进行比较，比第二位小则交换，完成，第二位是第二小的。第一位不用循环
        for (int i = 2; i < arrayParam.length; i++) {
            if (arrayParam[1] > arrayParam[i]) {
                int temp = arrayParam[i];
                arrayParam[i] = arrayParam[1];
                arrayParam[1] = temp;
            }
        }*/

        //在外层添加一个计数器，一直到倒数第二个，索引为：arrayParam.length - 2
        for (int j = 0; j < arrayParam.length - 1;j++) {            //j控制轮数，同时也是每一轮的“第一个元素”
            for (int i = j+1; i < arrayParam.length; i++) {     //i是其他位，第一位分别与二三四...位分别比较，第二位分别与三四五...位比较
                if (arrayParam[j] > arrayParam[i]) {        //只要比当前循环最小索引的一位小的，就互换
                    int temp = arrayParam[j];
                    arrayParam[j] = arrayParam[i];
                    arrayParam[i] = temp;
                }
            }
        }
        return arrayParam;
    }
}
