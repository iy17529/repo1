package com.rapjoee.day06.demo03;

/**
 * ClassName:Demo01PrivateAndSetter
 *
 * @Author:baba
 * @Date:2020/1/16 14:23
 * Description:
 */
public class Demo01Person {
    public static void main(String[] args) {
        Person ps1 = new Person();
        ps1.name="Rapjoee";
        //ps1.age=-18;//可以看到出现了不正确的数据，这里我们利用private成员变量的Setter/Getter间接访问age。
        ps1.setAge(-19);

        ps1.show();
    }
}
