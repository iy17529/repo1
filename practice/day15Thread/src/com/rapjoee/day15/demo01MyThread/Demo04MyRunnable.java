package com.rapjoee.day15.demo01MyThread;

/**
 * ClassName:MyRunnable
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 16:45
 * Description:
 *
 * 创建多线程的另一种方式：实现Runnable接口
 * java.lang.Runnable   接口应该由那些打算通过某一线程执行其实例的类来实现，类必须定义一个run的无参方法
 *      其构造方法：
 *              1. Thread(Runnable target)   分配新的Thread对象
 *              1. Thread(Runnable target, String name)   分配新的Thread对象
 *
 *       实现步骤：
 *          1. 创建一个实现类实现Runnable接口
 *          2. 实现类中覆盖重写接口中的run 方法，设置线程任务
 *          3. 创建Thread类对象，构造方法中传递Runnable的实现类对象
 *          4. Thread类对象使用start方法，开启新线程
 *
 *     实现Runnable接口创建多线程的好处：
 *          1. 避免了单继承的局限性
 *                  一个类只能继承一个父类，但是却可以实现多个接口，如果继承了Thread类就不能继承其他的类，但是去可以实现其他接口
 *          2. 增强了程序的扩展性，降低了程序的耦合度【解耦合】
 *                  实现Runnable接口的方式，把设置线程任务【run】和开启新线程【start】进行了分离【解耦合】，可以通过不同的实现类来实现不能的线程任务，再传递进Thread类对象，调用start
 *                  方法开启新线程
 */
public class Demo04MyRunnable {
    public static void main(String[] args) {

        //1. 匿名内部类实现Runnable接口
        Runnable runnableImpl1 = new Runnable() {                        //可以实现打印数字的线程任务
            //2. 覆盖重写run方法,设置线程任务
            @Override
            public void run() {
                System.out.println("实现Runnable接口创建多线程成功！");
                for (int i = 1; i < 8; i++) {
                    System.out.println("Runnable:" + i);
                }
            }
        };

        //Runnable接口没有start方法
        //3. 创建Thread对象，调用start方法
        Thread thread1 = new Thread(runnableImpl1);
        thread1.start();

        /*Runnable runnableImpl2 = new Runnable() {                       //线程任务打印HelloWorld
            @Override
            public void run() {
                for (int i = 0; i < 8; i++) {
                    System.out.println("HelloWorld" + i);
                }
            }
        };
        Thread thread2 = new Thread(runnableImpl2);
        thread2.start();*/
        //简化如下-->  匿名内部类匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 8; i++) {
                    System.out.println("HelloWorld" + i);
                }
            }
        }).start();

        //再次Lambda表达式简化如下：
        /*new Thread(() -> { for (int i = 0; i < 8; i++) {
                    System.out.println("HelloWorld" + i);
                }
            }
        ).start();*/
    }
}
