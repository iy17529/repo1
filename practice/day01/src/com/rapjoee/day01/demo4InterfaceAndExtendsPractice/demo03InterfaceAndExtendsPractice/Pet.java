package com.rapjoee.day01.demo4InterfaceAndExtendsPractice.demo03InterfaceAndExtendsPractice;

/**
 * ClassName:Pet
 *
 * @Author:baba
 * @Date:2020/2/3 17:06
 * Description:
 * 1. 提供getName() 返回该宠物的名字
 * 2. 提供setName(String name) 为该宠物命名
 * 3. 提供 play()方法
 */
public interface Pet {

    public abstract String getName();                 //返回宠物的名字
    public abstract void setName(String name);          //为宠物命名
    public abstract void play();                        //玩耍


}
