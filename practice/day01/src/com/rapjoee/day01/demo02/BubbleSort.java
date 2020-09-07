package com.rapjoee.day01.demo02;

import java.util.Arrays;

/**
 * ClassName:BubbleSort
 *
 * @Author:baba
 * @Date:2020/1/29 12:15
 * Description:
 * 冒泡排序算法：
 * 冒泡排序的特点是，每一轮循环后，最大的一个数被交换到末尾，因此，下一轮循环就可以“刨除”最后的数，每一轮循环都比上一轮循环的结束位置靠前一位。
 * <p>
 * 即：
 * 1. 从第一位开始，把相邻两位进行比较如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
 * 2. 再来一次，只不过不用比较最后一位
 * 3. 以此类推
 * <p>
 * 另外，注意到交换两个变量的值必须借助一个临时变量
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array1 = new int[16];
        for (int i = 0; i < array1.length; i++) {
            //Math.random()获取0~1之间的随机浮点数，乘100是0~100之间的随机数，强转为int型
            array1[i] = (int)(Math.random() * 100);
        }

        //int[] array1 = {1, 23, 6, 45, 19, 32, 98, 54, 20};
        System.out.println("原始数组为：" + Arrays.toString(array1));
        int[] result = bubSort(array1);
        System.out.println("排序后数组为：" + Arrays.toString(result));
    }

    /*冒泡排序算法
     * 方法名：sort
     * 参数：数组  int[]
     * 返回值：数组   int[]
     * */
    public static int[] bubSort(int[] arrayParam) {

/*        for (int i = 0; i < arrayParam.length; i++) {           //从第一位开始，相邻比较，大的放后面，循环次数为数组长度-1
            if(arrayParam[i] > arrayParam[i + 1]){
                int temp = arrayParam[i+1];
                arrayParam[i+1] = arrayParam[i];
                arrayParam[i] = temp;
            }
        }
        for (int i = 1; i < arrayParam.length - 1; i++) {       //从第一位开始，相邻比较，大的放后面，循环次数为数组长度-2，即循环次数少一次,最后一位不用循环
            if(arrayParam[i] > arrayParam[i+1]){
                int temp = arrayParam[i+1];
                arrayParam[i+1] = arrayParam[i];
                arrayParam[i] = temp;
            }
        }*/
        //则在外层添加一个计数器j作为循环次数的计数


        for (int i = 0; i < arrayParam.length; i++) {                   //i控制轮数
            for (int j = 0;j <arrayParam.length - i - 1;j++) {          //j控制进行比较的相邻两个元素的前一个元素
                if (arrayParam[j] > arrayParam[j + 1]) {
                    int temp = arrayParam[j + 1];
                    arrayParam[j + 1] = arrayParam[j];
                    arrayParam[j] = temp;
                }
            }
        }
        return arrayParam;
    }
}
