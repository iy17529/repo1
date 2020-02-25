package com.rapjoee.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/**
 * ClassName:Demo03RandomGame02
 *
 * @Author:baba
 * @Date:2020/1/17 15:39
 * Description:
 */
public class Demo03RandomGame02 {
    public static void main(String[] args) {
        Random ra = new Random();
        int answer = ra.nextInt(100) + 1; //正确答案
        int counter = 0;                         //计数器 有三次输错机会

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("请输入猜测的数：");
            int guessNum = sc.nextInt();
            if(guessNum < 0 || guessNum > 100 ){            //对输入的数进行简单验证
                counter++;
                /*if(counter >=3) {
                    System.out.println("输错三次！！退出程序");
                    break;
                }*/
                System.out.println("输入错误，请重试！！");
                continue;
            }

            if (guessNum < answer) {
                System.out.println("太小了，请重新输入！");
            } else if (guessNum > answer) {
                System.out.println("太大了，请重新输入！");
            } else {
                System.out.println("恭喜你！猜中了！！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
