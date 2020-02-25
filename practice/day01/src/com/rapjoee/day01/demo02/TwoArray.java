package com.rapjoee.day01.demo02;

import java.util.Arrays;
import java.util.Random;

/**
 * ClassName:TwoArray
 *
 * @Author:baba
 * @Date:2020/2/2 19:48
 * Description:
 * 定义一个5*5的二维数组，然后使用随机数填充
 * 找出这个数组里的最大值，并打印其二维坐标
 */
public class TwoArray {
    public static void main(String[] args) {
        int max = 0, maxX = 0, maxY = 0;            //要求的最大值与其数组坐标值
        int[][] twoArray = new int[5][5];
        Random ra = new Random();                   //创建随机数对象

        System.out.println("打印二维数组为：");
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[0].length; j++) {
                twoArray[i][j] = ra.nextInt(90) + 10;       //for循环赋值，数据范围为：10~99
                if (max < twoArray[i][j]) {
                    max = twoArray[i][j];
                    maxX = i;
                    maxY = j;
                }
                System.out.print(twoArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("数组中的最大值为：" + max);
        System.out.println("其数组坐标为：(" + maxX + ", " + maxY + ")");
        //System.out.println("其位置坐标为：("+(maxX+1)+", "+(maxY+1)+")" );
        Arrays.sort(args);

        /*System.out.println("打印二维数组为：" );
        for (int q = 0; q < twoArray.length; q++) {
            System.out.println();
        }*/
    }
}
