package com.rapjoee.day11.demo05;

/**
 * ClassName:Demo02Fu
 *
 * @Author:baba
 * @Date:2020/2/1 17:59
 * Description:这是父类的匿名内部类
 */
public class Demo02Fu {

    public static void main(String[] args) {
        Fu obj = new Fu() {             //使用匿名内部类
            @Override
            public void methodFu(){             //覆盖重写父类方法，可以不覆写
                System.out.println("子类匿名内部类方法执行");
            }
        };
        obj.methodFu();
    }

}
