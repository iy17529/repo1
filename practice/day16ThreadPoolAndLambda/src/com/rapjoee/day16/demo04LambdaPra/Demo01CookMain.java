package com.rapjoee.day16.demo04LambdaPra;

/**
 * ClassName:Demo03LambdaPractice
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 20:12
 * Description:
 *
 * 练习Lambda表达式标准格式
 *
 * 给定一个厨子cook接口，内含有唯一抽象方法makeFood,无参无返回值
 *      用Lambda表达式标准格式调用invokeCook方法，打印输出“吃饭啦”
 *
 *
 *  标准格式有三部分组成：A.一些参数  B. 一个箭头 C. 一段代码
 *          - 格式：(参数列表) -> {一些覆盖重写的方法体}
 *   - 解释：
 *          - ()：接口中抽象方法的参数，无参就空着；有参数写参数，多个参数逗号分隔
 *          - ->：传递的意思，把参数传递给方法体{}
 *          - {}：覆盖重写接口的抽象方法体
 *
 *  Lambda表达式省略格式：
 *          1. (参数列表)：参数的数据类型可以省略
 *          2. (参数列表)：如果只有一个参数，则小括号 () 可以省略
 *          3. { }：如果大括号内只有一行语句【不论有没有返回值】，那么大括号{} return关键字与分号 ;都可以省略
 *     注意：以上省略语句。如果省略，一起省略，否则报错
 *     Lambda使用前提：
 *          1. 使用Lambda表达式必须具有接口，且要求接口有且仅有一个抽象方法【Runnable、Comparator、自定义接口】
 *          2. 使用Lambda必须具有上下文推断
 *                  也就是方法的参数或者局部变量类型必须为Lambda对应的接口类型
 *
 *      有且仅有一个抽象方法的接口称之为”函数式接口“
 *
 */
public class Demo01CookMain {
    public static void main(String[] args) {

        /*
        //传递Cook接口的匿名内部类实现类对象
        new cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭啦！！");
            }
        };*/

        //在下面使用Lambda表达式【标准格式】调用invokeCook方法
        //参数？   接口中覆盖重写方法没有参数
        // ->
        //方法体？  System.out.println("吃饭啦！！");
        invokeCook(()->{
            System.out.println("吃饭啦！！");
        });

        //Lambda表达式省略格式：无参无返回值，拿掉了 ; {}
        invokeCook(()->System.out.println("吃饭啦！"));
    }

    //定义方法，参数为Cook接口，方法调用接口的方法makeFood
    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
