package com.rapjoee.day23.demo07constructormethodreference;

/**
 * ClassName:PersoBuilder
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 18:05
 * Description:
 *
 * 定义一个创建Person对象的函数式接口
 */
@FunctionalInterface
public interface PersonBuilder {
    //定义一个方法，根据传递的姓名，创建Person并返回
    public abstract Person builderPerson(String name);
}
