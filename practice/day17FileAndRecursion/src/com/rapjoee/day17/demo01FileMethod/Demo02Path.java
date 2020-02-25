package com.rapjoee.day17.demo01FileMethod;

import java.io.File;

/**
 * ClassName:Demo02Path
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/12 10:53
 * Description:
 *
 * 路径：
 *      绝对路径：是一个完整的路径，一盘符【C:  D:】开始
 *              如  D:\\Programs\\CentBrowser
 *      相对路径：是一个简化的路径【相对指的是相对于当前项目的根目录（D:\project\project_IDEA\pro_java\practice）】
 *              如  D:\\Programs\\CentBrowser -->  CentBrowser
 *
 *     注意：
 *          1. java中反斜杠【 \ 】是转义字符,所以windows的路径分隔符反斜杠在Java中写作两个，java两个\\表示一个正常\
 *          2. 路径不区分大小写
 *
 *   File类的构造方法：
 *          File(File parent, String child)
 *                      根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
 *          File(String pathname)
 *                      通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
 *          File(String parent, String child)
 *           根          据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
 *
 *    注意：以上的参数String pathname，传递参数只是把字符串封装为对象，不考虑路径真实情况
 *      路径：可以以文件结尾，也可以以文件夹结尾
 *           可以是绝对路径，也可以是相对路径
 *           可以存在，也可以不存在
 *           可以以文件结尾，也可以以文件夹结尾
 */
public class Demo02Path {
    public static void main(String[] args) {
        //File(String pathname),直接传递一个字符串封装到对象file1中
        File file1 = new File("C:\\a.txt");
        System.out.println("file: " + file1);               //file: C:\a.txt

        //File(String parent, String child)
        //把父路径与子路径分隔开，单独书写，比较灵活
        File file2 = new File("C:\\","b.txt");
        System.out.println("file2: " + file2);              //file2: C:\b.txt

        //File(File parent, String child)
        File temp = new File("C:\\parent\\");
        File file3 = new File(temp, "c.txt");   //temp是File类型，在这里temp可以调用方法先操作一波
        System.out.println("file3: " + file3);
    }
}
