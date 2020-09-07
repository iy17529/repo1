package com.rapjoee.day23.demo05supermethodreference;

/**
 * ClassName:Greetable
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 17:42
 * Description:
 *
 * 定义打招呼的函数式接口
 */
@FunctionalInterface
public interface Greetable {
    //打招呼的方法
    public abstract void greet();
}
