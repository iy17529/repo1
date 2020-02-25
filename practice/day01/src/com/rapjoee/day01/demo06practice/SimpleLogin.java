package com.rapjoee.day01.demo06practice;

import java.util.Scanner;

/**
 * ClassName:SimpleLogin
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/18 19:08
 * Description:
 *
 * 一个最简单的登录
 *
 */
public class SimpleLogin {
    public static void main(String[] args) {

        //初始化用户名与密码表
        String[] user = {"qqq", "www", "eee"};
        String[] password = {"111", "222", "333"};
        Scanner sc = new Scanner(System.in);

        //记录可输入次数
        int count = 3;

        for (int j = 0; j < user.length; j++) {
            System.out.println("请输入您的用户名：");
            String userName = sc.next();
            System.out.println("请输入您的密码：");
            String pwd = sc.next();

            //用户名与密码匹配登录成功，并跳出程序
            if (userName.equals(user[j]) & pwd.equals(password[j])) {
                System.out.println("登录成功！！");
                break;
            }
            count--;

            //不匹配则提示重新输入
            if (count != 0) {
                System.out.println("\n输入错误！！您还剩" + count + "次机会");
            } else {
                System.out.println("很遗憾~您没有次数了");
            }
        }

    }
}
