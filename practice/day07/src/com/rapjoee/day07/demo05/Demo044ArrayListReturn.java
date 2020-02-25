package com.rapjoee.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * ClassName:Demo044ArrayListReturn
 *
 * @Author:baba
 * @Date:2020/1/17 20:18
 * Description:
 *
 * 需求：
 * 用一个大集合存入20个随机数，然后筛选其中的偶数元素，放到小集合中
 * 要求使用自定义的方法来实现
 *
 * 思路：
 * 1、一大一小俩集合ArrayList
 * 2、获取随机数Random()通过循环放入大集合   for    add
 * 3、筛选  自定义方法 循环 判断偶数用 %   a % 2 == 0
 * 4、筛选出来的放入小集合中   for
 */
public class Demo044ArrayListReturn {


    public static void main(String[] args) {
        Random ra = new Random();
        ArrayList<Integer> alA = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            alA.add(ra.nextInt(101));    //随机数范围为：0~100
        }
        System.out.println("大集合元素为：");
        System.out.println(alA);

        ArrayList<Integer> alResult = ArrayListReturn(alA);
        System.out.println("大集合里偶数为：");
        System.out.println(alResult);

    }
    /*三要素
    方法名称：筛选emmmm，就ArrayListReturn吧
    返回值：返回一个小集合，是ArrayList类型
    参数列表：大集合作为参数，类型同上
    * */

    public static ArrayList<Integer> ArrayListReturn(ArrayList<Integer> alA){

        //方法接收大集合参数，返回小集合(偶数)
        ArrayList<Integer> alB = new ArrayList<>();
        for (int i = 0; i < alA.size(); i++) {       //筛选
            if(alA.get(i) % 2 == 0){
                alB.add(alA.get(i));
            }
        }
        return alB;
    }
}
