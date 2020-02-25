package com.rapjoee.day14.demo03MyException;

/**
 * ClassName:Demo01MyException
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 13:58
 * Description:
 *
 * Java提供的异常类是不顾用的，我们也可以自定义一些异常类
 *
 * 格式：
 *      public class RegisterException extends RuntimeException  |  Exception{
 *          //添加一个空参构造
 *          //添加一个带异常信息参数构造
 *          //...
 *      }
 *
 *  注意：1. 自定义异常类必须以Exception结尾，以表明它是一个异常类
 *       2. 自定义异常类必须继承Exception或者RuntimeException
 *              2.1 继承了Exception类，则是自定义的类是编译异常，如果方法内部抛出编译期异常，则必须处理这个异常，要么throws，要么try catch
 *              2.2继承了RuntimeException，则自定义异常类是一个运行期异常，无需处理交给jvm处理
 */
public class RegisterException extends Exception{

    //添加一个空参构造,调用父类空参构造
    public RegisterException() {
        super();
    }

    //添加一个带异常信息参构造，【查看源码 发现】调用父类的构造方法，然父类处理这个异常
    public RegisterException(String message) {
        super(message);
    }
}
