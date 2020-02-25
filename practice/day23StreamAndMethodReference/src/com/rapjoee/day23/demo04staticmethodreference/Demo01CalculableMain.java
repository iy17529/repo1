package com.rapjoee.day23.demo04staticmethodreference;

/**
 * ClassName:Demo01CalculableMain
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/25 14:56
 * Description:
 */
public class Demo01CalculableMain {
    public static void main(String[] args) {
        //调用下面那个静态方法
        int result = userStaticMethod(-87, num -> {
            //对传递的整数进行绝对值计算
            return Math.abs(num);
        });
        System.out.println("使用Lambda表达式调用覆盖重写的方法为：" + result);

        //Math工具类是存在的，其计算绝对值的方法abs也是存在的，可以直接使用方法引用
        int result1Abs = userStaticMethod(-23, Math::abs);
        System.out.println("通过类名直接引用静态成员方法：" +result1Abs);
    }

    /**定义一个方法，参数传递要计算的整数与函数式接口
     *
     * @param calculable
     */
    private static int userStaticMethod(int number, Calculable calculable) {
        return calculable.calAbs(number);

    }
}
