package com.rapjoee.day01.demo02;

import java.util.Arrays;
import java.util.Random;

import static com.rapjoee.day01.demo02.BubbleSort.bubSort;
import static com.rapjoee.day01.demo02.SelectSort.selectSort;

/**
 * ClassName:SortPractice
 *
 * @Author:baba
 * @Date:2020/2/2 18:57
 * Description:
 * 练习：创建一个长度是5的数组，并填充随机数
 * 首先用选择法正排序【由小到大】，然后对其使用冒泡法到排序【由大到小】
 */
public class SortPractice {
    public static void main(String[] args) {
        int[] initArray = new int[5];          //  创建一个指定长度的数组
        Random ra = new Random();       //随机数对象

        for (int i = 0; i < initArray.length; i++) {        //遍历数组并给其赋值
            initArray[i] = ra.nextInt(39);
        }
        System.out.println("获取的随机数组为：" + Arrays.toString(initArray));        //  打印数组
        int[] arraySel = selectSort(initArray);         //重复代码直接导包调用
        //int[] arraySel = sortSel(initArray);
        System.out.println("选择排序给数组由小到大排序为：" + Arrays.toString(arraySel));

        int[] arrayBub = bubSort(initArray);              //重复代码直接导包调用
        //int[] arrayBub = sortBub(initArray);
        System.out.println("冒泡排序给数组由大到小排序：" + Arrays.toString(arrayBub));
    }

/*    public static int[] sortSel(int[] arrayParam1) {         //选择排序给数组由小到大排序

        for (int j = 0;j < arrayParam1.length - 1;j++) {
            for (int i = j + 1; i < arrayParam1.length; i++) {
                if (arrayParam1[j] > arrayParam1[i]) {
                    int temp = arrayParam1[i];
                    arrayParam1[i] = arrayParam1[j];
                    arrayParam1[j] = temp;
                }
            }
        }

        return arrayParam1;
    }

    public static int[] sortBub(int[] arrayParam2) {         //冒泡排序给数组由大到小排序

        for(int i = 0;i < arrayParam2.length ;i++) {
            for (int j = 0; j < arrayParam2.length - i - 1; j++) {
                if (arrayParam2[j] < arrayParam2[j + 1]) {
                    int temp = arrayParam2[j];
                    arrayParam2[j] = arrayParam2[j + 1];
                    arrayParam2[j + 1] = temp;
                }
            }
        }
        return arrayParam2;
    }*/
}
