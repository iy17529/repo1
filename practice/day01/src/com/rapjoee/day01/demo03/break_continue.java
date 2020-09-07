package com.rapjoee.day01.demo03;

/**
 * ClassName:break_continue
 *
 * @Author:baba
 * @Date:2020/1/9 12:24
 * Description:
 * 学习break与continue关键字使用
 * 1.break关键字从满足条件开始，立刻打断整个循环
 * 2.continue关键字一旦执行，立刻跳出当前循环剩余内容，马上开始下一次循环
 */
public class break_continue {
    public static void main(String[] args) {
        /*
        * break关键字从满足条件开始，立刻打断整个循环
        *
        * */
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i + "层到了");      //1、2、3 结束
        }
        System.out.println("====================");
        /*
        * continue关键字一旦执行
        * 立刻跳出当前循环剩余内容，马上开始下一次循环
        * */
        for (int j = 1; j <= 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j + "层到了");      //1、2、3、5、6、7、8、9、10
        }
    }
}
