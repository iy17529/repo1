package com.rapjoee.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

/**
 * ClassName:Demo01ArrayListRandom
 *
 * @Author:baba
 * @Date:2020/1/17 17:26
 * Description:
 * 需求：生成6个1~33之间的随机整数，添加到集合，并遍历
 *
 * 思路：
 * 1、生成随机数，需要使用Random
 * 2、生成6个，需要循环，用for
 * 3、1~33之间的数，则循环内调用.nextInt()方法，具体为.nextInt(32) + 1
 * 4、添加到集合，需要ArrayList,类型为<Integer>
 * 5、添加：add()
 * 6、遍历：for、size、get
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {

        Random ra = new Random();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            al.add(ra.nextInt(32) + 1);
        }
        System.out.println("遍历集合为：");
        for (int j = 0; j < al.size(); j++) {               //这里用for each循环也可以
            System.out.println(al.get(j));
        }
    }
}
