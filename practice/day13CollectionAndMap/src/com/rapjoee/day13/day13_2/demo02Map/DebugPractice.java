package com.rapjoee.day13.day13_2.demo02Map;

/**
 * ClassName:DebugPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/9 15:02
 * Description:
 *
 * 学习debug调试
 *          1. 单击行号右边一点设置断点（哪里出错点哪里）
 *          2. debug模式运行程序
 *
 *     Step Over[F8] :逐行执行程序
 *     Step Into[F7] :进入到方法中
 *     Step Out[Shift+F8] :跳出方法
 *     Resume Program[F9] ：跳到下一个断点，没有下一个则结束程序
 *     Stop[Ctrl+F2] :结束debug
 *
 */
public class DebugPractice {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloJava" + i);
        }
    }
}
