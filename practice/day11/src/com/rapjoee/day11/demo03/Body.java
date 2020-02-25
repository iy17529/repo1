package com.rapjoee.day11.demo03;

/**
 * ClassName:Body
 *
 * @Author:baba
 * @Date:2020/1/31 20:04
 * Description:
 */
public class Body {         //外部类

     public class Heart{     //内部类
        public void methodInner(){      //内部类的方法
            System.out.println("内部类方法执行啦！！");
        }
    }

    public void methodOuter(){          ////外部类的方法
        System.out.println("外部类方法执行啦！！");
        Heart he = new Heart();         //外用内方法B,通过外部类的方法使用，main方法只是调用外部类的方法即可
        he.methodInner();
    }
}
