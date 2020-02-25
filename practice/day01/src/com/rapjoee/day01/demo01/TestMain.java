package com.rapjoee.day01.demo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;

/**
 * ClassName:TestMain
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/16 19:40
 * Description:
 *
 * 递归打印多级目录【D:\JavaSETestDirectory01】
 *
 *      File[] listFiles(FileFilter filter)
 *              返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *         用来过滤文件【File对象】的
 *           一个方法：boolean accept(File pathname)   测试指定【抽象路径名】是否应该包含在某个路径名列表中。
 *                  参数：File pathname  本题中也就是每一个遍历到的File对象
 *
 *      File[] listFiles(FilenameFilter filter)
 *              返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中满足指定过滤器的文件和目录。
 *          用来过滤文件名称的
 *           一个方法：boolean accept(File dir, String name) 测试指定【文件】是否应该包含在某一文件列表中。
 *                          当且仅当该名称应该包含在文件列表中时返回 true；否则返回 false。
 *                  参数：
 *                      File dir：构造方法中传递的被遍历的目录
 *                      String name：使用listFiles方法遍历获取的文件/文件夹
 *
 *  注意：两个接口都是没有实现类，需要我们自己去写实现类
 *
 *          过滤器的原理：listFiles()方法会遍历传递的File对象，遍历得到当前File对象里的子File对象，调用过滤器accept规则判断
 *          满足规则的返回true，则可以把此对象保存在数组里，不满足的不放入直到判断完所有的子File对象，返回数组
 */
public class TestMain {
    public static void main(String[] args) throws FileNotFoundException {
        //一个真实的目录
        File dirTrue = new File("D:\\JavaSETestDirectory01");
        File dirFalse = new File("D:\\JavaSETestDirectory04");//不存在的目录

        //对传递的目录进行判断，如果不存在就没有打印的必要了
        if (dirTrue.exists()) {
            printDir(dirTrue);
        } else {
                throw new FileNotFoundException("文件夹不存在！！");
        }
    }

    /**
     * 递归打印多级目录，
     * @param fileParam：File对象
     *  无返回值
     */
    private static void printDir(File fileParam) {

        FilenameFilter ff2 = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //dir是父File，name是子File对象。需要封装一下


                return new File(dir, name).isDirectory()||name.toLowerCase().endsWith(".java");
            }
        };
        //带过滤器取出每一个子File对象  lambda表达式写法
        File[] fileList = fileParam.listFiles((dir, name) ->
                new File(dir, name).isDirectory()||name.toLowerCase().endsWith(".txt"));
        //System.out.println("过滤后的File集合：" + Arrays.toString(fileList));

        //先打印一遍父目录
        //System.out.println(fileParam.getAbsolutePath());
        for (File file : fileList) {
            //判断是目录就进去
            if (file.isDirectory()) {
                printDir(file);
            } else if (file.getName().toLowerCase().endsWith(".txt")) {//不是就是文件了，判断是不是.txt结尾的，是打印
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
