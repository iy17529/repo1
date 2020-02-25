package com.rapjoee.day23.demo01collectionstream;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName:Demo01TStream
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/24 15:45
 * Description:
 *
 * JDK8引入了集合流的功能，关注的是做什么，而不是怎么做
 *      学习使用集合流的方式，对集合元素进行过滤与打印
 *
 *   流：元素是特定类型的对象，形成一个队列，Java中的Stream并不会存储元素，而是按需计算
 *      数据源   流的来源，可以是集合、数组等
 *
 *   Stream有两个基础的特征：
 *          1. Pipelining:中间操作会返回流对象本身，这样可以对操作进行优化比如延迟执行与短路
 *          2. 内部迭代：以前都是通过for循环与迭代器，显式地在集合外进行迭代遍历【外部迭代】，Stream提供了内部迭代，可以直接调用遍历方法
 *
 *    当使用流的时候通常包含三个基本步骤：
 *          获取一个数据源 ——> 数据转换 ——> 执行操作获取想要的结果
 *              每次转换原有Stream对象不改变，返回新的Stream对象，这就允许对其操作可以向一条链条一样，编程一个管道
 */
public class Demo01Stream {
    public static void main(String[] args) {
        //创建一个集合并添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "晴儿", "李秋爽", "张无忌", "吐槽星人");

        /****************1.使用传统方式对集合进行元素筛选与遍历，存在新集合中****************************/
        ArrayList<String> tempList = new ArrayList<>();
        for (String s : list) {
            //如果元素以 张打头且长度为3 则存入新集合中
            if (s.startsWith("张") && (s.length() == 3)) {
                tempList.add(s);
            }
        }
        System.out.println("源集合为：" + list);
        System.out.println("筛选过后为：" + tempList);
        System.out.println("=====================================================");
        /*****************************************************************************************/
        
        /*****************2. 使用Stream流的方式，筛选元素并打印**************************************/
            //jdk8之后，添加了stream方法，可以把集合转换为流，可以直接对流进行操作
                //流中有个方法filter，参数为Predicate接口【主要用于判断】，可以使用Lambda表达式
        list.stream()
                .filter( name -> name.startsWith("张"))//省略前：filter((String name) -> {return name.startsWith("张");})
                .filter( name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
                //上面一行的 forEach 方法也是流里的，传递一个Consumer接口【主要用于数据的消费】
                        // 我们传递Lambda表达式，消费方式为打印输出
        /*****************************************************************************************/
    }
}
