package com.rapjoee.day13.day13_1.demo04Set;

/**
 * ClassName:Demo02HashCode
 *
 * @Author:baba
 * @Date:2020/2/8 13:36
 * Description:
 *
 * 哈希码值：是一个【十进制】的整数，由系统随机给出（就是对象的逻辑地址值 是模拟出来的，不是数据在计算机中实际的物理地址）
 *
 * HashSet集合不能存储重复元素的原理：
 *      存储数据时：先计算元素的哈希值，然后再集合中查找是否有此哈希值
 *                      没有则存储进去
 *                      如果有相同哈希值【哈希冲突】，则equals方法比较内容是否一致
 *                          一致则元素相同，不存储
 *                          不一致则没有元素不重复，存储进去
 *
 */
public class Demo02HashCode {
    public static void main(String[] args) {

        //创建一个对象
        Person dp = new Person("Hello",18);

        //System.out.println("person1.hashCode():" + (person1.hashCode()+ "\ndp.hashCode():" +dp.hashCode()));
        //获取其十进制哈希码值
        int hash1 = dp.hashCode();
        System.out.println("其哈希码值为： " + hash1);         //24324022
        System.out.println("其十六进制地址值为：" + dp);        //17327b6   24324022的十六进制形式

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println("比较s1与s2的哈希码值：" + (s1.hashCode()==s2.hashCode()));   //指向了同一个对象

        //特殊的的  字符串【重地】与【通话】的哈希码值相同
        String s3 = "重地";
        String s4 = "通话";
        System.out.println("字符串【重地】与【通话】的哈希码值相同吗？" + (s3.hashCode()==s4.hashCode()));
    }
}
