package com.rapjoee.day23.demo04staticmethodreference;

/**
 * ClassName:Calculable
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 14:54
 * Description:
 */
@FunctionalInterface
public interface Calculable {
    //定义一个函数式接口，抽象方法对int参数进行绝对值的计算
    public abstract int calAbs(int number);
}
