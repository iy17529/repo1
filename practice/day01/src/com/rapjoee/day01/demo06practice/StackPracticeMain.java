package com.rapjoee.day01.demo06practice;

import java.util.ArrayList;

/**
 * ClassName:StarkPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/17 15:47
 * Description:
 * <p>
 * 使用数组实现栈
 *      自己实现一个栈，要求这个栈具有以下基本方法
 *          push()          【将元素推入此列表所表示的堆栈】
 *          pop()           【从此列表所表示的堆栈处弹出一个元素】
 *          peek()          【 返回栈顶元素不出栈（即获取元素）】
 *          isEmpty()       【判断是否为空】
 *          size()          【获取元素个数】
 *
 * 提示：每次入栈之前先判断栈的容量是否够用，如果不够用就用Arrays.copyOf()方法扩容
 */
public class StackPracticeMain<E> {

    public static void main(String[] args) {

        MyStack<Double> st = new MyStack<>(2);
        System.out.println("添加元素前：元素个数：" + st.size() + "个");
        System.out.print("栈中有元素吗？");
        System.out.println((st.isEmpty()) ? "没有！！" : "有元素");

        //push()          【将元素推入此列表所表示的堆栈】
        st.push(11.0);
        st.push(22.3);
        st.push(33.3);
        st.push(44.3);
        st.push(55.3);
        st.push(66.3);
        System.out.println("=========================================================");
        System.out.println("push()方法元素进栈，元素个数:" + st.size());
        System.out.println("打印栈：" + st);
        System.out.println("=========================================================");
        //pop()           【从此列表所表示的堆栈处弹出一个元素】
        Double popElement = st.pop();
        System.out.println("pop()方法元素出栈：" + popElement);
        System.out.println("打印栈：" + st);
        System.out.println("=========================================================");
        //peek()          【 返回栈顶元素不出栈（即获取元素）】
        Double peekElement = st.peek();
        System.out.println("peek()获取栈顶元素：" + peekElement);
        System.out.println("打印栈：" + st);
        System.out.println("栈中元素个数为：" + st.size() + "个");

        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println("栈为空？" + st.isEmpty() + "栈中元素：" + st);
        st.pop();//再弹栈就  Stack is Empty!!


        //System.out.println("添加元素后：" + st);
        ArrayList<Integer> al = new ArrayList<>();
    }
}
