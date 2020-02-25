package com.rapjoee.day10.demo01;

/**
 * ClassName:MyInterfaceStatic
 *
 * @Author:baba
 * @Date:2020/1/26 16:18
 * Description:
 *
 * Java8 开始，接口中可以定义静态方法
 * 格式：public static 返回值类型 方法名(参数){
 *     //方法体
 * }
 *
 * 从Java9开始，接口当中允许定义私有方法，抽取一个共有方法，用来解决两个默认/静态方法之间重复代码的问题。但是这个共有方法不该让实现类使用，应该是私有化的
 *
 * 格式：
 * 1.普通私有方法------private 返回值类型 方法名(参数){方法体}
 * 2.静态私有方法------private static 返回值类型 方法名(参数){方法体}
 *
 */
public interface MyInterfaceStatic {
    public static void methodStatic(){          //public灰色，说明可省略
        System.out.println("这是接口的静态方法！！");
    }
    /*private void methodA(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }*/
}
