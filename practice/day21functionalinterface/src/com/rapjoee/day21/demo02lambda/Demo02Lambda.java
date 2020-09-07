package com.rapjoee.day21.demo02lambda;

/**
 * ClassName:Demo02Lambda
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 15:53
 * Description:
 *
 * 使用Lambda优化上一个日志案例
 *      Lambda表达式特点：隐式加载 【必须存在函数式接口】
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        String msg = "Hello!";
        String msg1 = "Java!";
        String msg2 = "World!!";

        //这个展示的就是Lambda的延迟执行
        showLog(1, () -> {//重写builder方法，进行字符串拼接

            //不满足条件的不会进入到接口的builder方法，也就不会进行拼接了
            System.out.println("不满足等级要求则不输出这句话");
            return msg + msg1 + msg2;
        });

        System.out.println("============================");
        showLog(2, new MsgBuilder() {
            @Override
            public String builder() {
                System.out.println("不满足要求不输出");
                return msg + msg1 + msg2;
            }
        });
    }

    /**
     * 定义一个打印日志的方法，根据日志的等级进行判断，传递等级与一个接口
     */
    private static void showLog(int level, MsgBuilder mb) {
        if (level == 1) {//日志达到一级，则会进行拼接
            System.out.println(mb.builder());
        }
    }
}
