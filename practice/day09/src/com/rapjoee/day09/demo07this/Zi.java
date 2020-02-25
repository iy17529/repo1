package com.rapjoee.day09.demo07this;

/**
 * ClassName:Zi
 *
 * @Author:baba
 * @Date:2020/1/25 15:30
 * Description:
 * super关键字用来访问父类内容，而this关键字用来访问本类的内容，用法三种：
 * 1.在本类的成员方法中，访问本类中的成员变量（注意与局部变量区分）
 * 2.在本类的成员方法中，访问本类中的另一个成员方法
 * 3.在本类的构造方法中，访问本类中的另一个构造方法【构造方法的重载调用】
 */
public class Zi extends Fu{

    String str = "子类成员字符串变量";

    public Zi(){
        //this();           不加参数是自己调用自己
        //super();          【这个也得写在最前边，调用父类的构造方法，不能和this调用同时调用】
        this(5);        //加参数调用有参构造【注意这个写在最前边】
        System.out.println("无参构造执行！");
    }
    public Zi(int n){
        System.out.println("有参构造执行");
    }


    public void showString(){
        String str = "子类局部字符串变量";

        System.out.println(str);        //访问本方法的布局变量str
        System.out.println(this.str);           //this关键字访问本类成员变量str
        System.out.println(super.str);           //super关键字访问父类成员变量str
    }

    public void methodA(){
        System.out.println("a方法执行啦！");
    }
    public void methodB(){
        this.methodA();                              //b方法this关键字调用a方法
        methodA();
        System.out.println("b方法执行啦！");          //b方法执行
    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodB();
    }
}
