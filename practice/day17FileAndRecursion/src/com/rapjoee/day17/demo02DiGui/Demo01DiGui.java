package com.rapjoee.day17.demo02DiGui;

/**
 * ClassName:Demo01DiGui
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 15:16
 * Description:
 *
 *递归：Recursion
 *      在当前的方法中调用自己的现象
 *  递归的分类：
 *          1. 直接递归 【自己调用自己】
 *          2. 间接递归 【A方法调用B方法，B方法调用A方法】
 *   注意事项：
 *          1. 递归一定要有限定条件，能够让他停下来，否则发生栈内存溢出【StackOverflowError】
 *                      栈内存溢出：此方法在栈中，调用自己没有限定条件时，此方法会重复进栈执行，有无数个方法进栈，导致StackOverflowError
 *          2. 虽然有限定条件，但是递归次数不能太多，否则发生栈内存溢出【StackOverflowError】
 *          3. 构造方法，禁止递归！！
 */
public class Demo01DiGui {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        a();        //没有限定条件
    }
}
