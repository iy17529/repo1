package com.rapjoee.day07.demo04;

import java.util.ArrayList;

/**
 * ClassName:Demo03ArrayListMethod
 *
 * @Author:baba
 * @Date:2020/1/17 16:22
 * Description:
 * ArrayList常用的方法如下：
 * public boolean add(E e):     向集合中插入一个元素，放在最后面，参数类型和泛型一致
 * public E get(int index)：     从集合中获取元素，参数为索引编号，返回值是对应位置的元素，索引从0开始
 * public E remove(int index):  从集合中删除元素，参数为索引编号，返回值为被删除的元素
 * public int size()：           获取集合的尺寸长度，返回值是集合元素的个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("张三");
        boolean success = al.add("张四");
        System.out.println("添加的动作是否成功," + success);
        al.add("张五");
        al.add("张六");
        al.add("张八");
        al.add("迪丽热巴");
        al.add("玛尔扎哈");
        al.add("古力娜扎");
        System.out.println(al);

        String name2=al.get(1);
        System.out.println("2号索引值为：" + name2);
        System.out.println(al.get(4));
        System.out.println(al.get(6));

        String whoRemoved2 = al.remove(1);
        System.out.println("被删除的人是：" + whoRemoved2);
        String whoRemoved1 = al.remove(4);
        System.out.println("被删除的人是：" + whoRemoved1);
        System.out.println(al);

        System.out.println("ArrayList集合的长度为：" + al.size());

        //集合的遍历
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
