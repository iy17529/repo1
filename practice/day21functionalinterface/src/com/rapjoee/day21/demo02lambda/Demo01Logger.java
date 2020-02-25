package com.rapjoee.day21.demo02lambda;

/**
 * ClassName:Demo01Logger
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/23 15:41
 * Description:
 *
 * 日志案例
 *
 *      在这个案例中，传递进去1级别会打印信息，但是如果传递的是其他级别
 *          不会打印，但是也对字符串进行了拼接，这就是性能浪费
 */
public class Demo01Logger {
    public static void main(String[] args) {
        String msg = "Hello！";
        String msg1 = "Java！";
        String msg2 = "IDEA！";

        //调用方法，传递日志级别与信息
        showLog(1, msg + msg1 + msg2);
    }

    /**
     * 定义一个 根据日志的等级，显示日志信息的方法
     * @param level
     * @param msg
     */
    private static void showLog(int level, String msg) {
        //日志等级达到一级。就输出日志信息
        if (level == 1) {
            System.out.println(msg);
        }
    }
}
