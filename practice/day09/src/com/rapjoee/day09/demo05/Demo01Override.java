package com.rapjoee.day09.demo05;

/**
 * ClassName:Demo01Override
 *
 * @Author:baba
 * @Date:2020/1/20 13:50
 * Description:
 * 学习继承关系下的方法重写
 *
 * 重写（Override）
 * 概念：在继承关系中，方法的名称一样，参数列表也一样
 *
 * 重写(Override):方法的名称一样，参数列表【也一样】，也可叫做覆盖、覆写
 * 重载(Overload):方法的名称一样，参数列表【不一样】
 *
 * 方法覆盖的注意事项：
 * 1.子类覆盖方法与父类方法的名称一致，参数列表也一致
 *      注解：    @Override 写在子类覆盖方法前面，是用来检测方法的覆盖重写是否正确有效【不正确则报错】，可以不写【推荐写上】
 * 2.子类覆盖方法的返回值必须【小于等于】父类方法的返回值范围
 *      小扩展：java.lang.Object类是所有类的公共最高父类（祖宗类），java.lang.String 是 Object 类的子类
 *
 * 3.子类方法的权限必须【大于等于】父类方法的权限修饰符
 *      小扩展：权限:public >protected >(default) >private
 *   备注：(default)不是关键字default，而是什么也不写，留空
 *          
 */
public class Demo01Override {
}
