package com.rapjoee.day21.demo05consumer;

import java.util.function.Consumer;

/**
 * ClassName:ConsunerPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 19:57
 * Description:
 *
 * 练习：
 *      下面的字符串数组当中有多条信息，请按照格式："姓名：xx。性别:xx。"的格式将信息打印出来
 *      要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，将打印性别的动作作为第二个Consumer 接口的Lambda实例，
 *      将连个Consumer接口按照顺序 "拼接" 在一起
 *
 *      public static void main(String[] args) {String[] array = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男"}; }
 *
 *
 * 思路：对传递进来的字符串参数进行分隔【以 , 作为分隔符】，分隔得到前面的为单独的姓名，后者为单独的性别
 */
public class ConsumerPractice {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男"};

        for (int i = 0; i < array.length; i++) {

            //用两个Lambda表达式作为接口实现
            printInfo(array[i],
                    (t) -> {
                //分隔字符型取姓名部分打印
                        String[] info = t.split(",");
                        System.out.print("姓名：" + info[0]);
                    },
                    (t) -> {
                //分隔字符型取性别部分打印
                        String[] info = t.split(",");
                        System.out.println("  性别：" + info[1]);
                    });
        }
    }

    private static void printInfo(String s, Consumer<String> con1, Consumer<String> con2) {

        con1.andThen(con2).accept(s);
    }
}
