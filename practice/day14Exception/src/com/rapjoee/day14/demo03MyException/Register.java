package com.rapjoee.day14.demo03MyException;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ClassName:Register
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/10 14:13
 * Description:
 *
 * 注册类：实现注册功能
 *
 * 需求分析：
 *      1. 使用Map集合存储用户名和密码
 *      2. scanner获取新注册用户的用户名
 *      3. 新注册用户名与集合中元素进行比较判断
 *              存在则抛出RegisterException提示"该呢称已经被使用"【此时应该在catch中写一个return终止程序】
     *      没有重复的则提示"注册成功"，并把用户名与密码存入集合
 */
public class Register {
    public static void main(String[] args) {
        //创建保存用户信息的集合，键保存用户名，值保存密码
        HashMap<String,String> userMap1 = new HashMap<>();
        userMap1.put("qqqq","123");userMap1.put("yyyy","123");
        userMap1.put("eeee","123");userMap1.put("aaaa","123");
        userMap1.put("rrrr","123");
        //System.out.println(userMap1);

        String[] userInfo = initUI();
        HashMap<String, String> userMap2 = checkUser(userMap1, userInfo[0],userInfo[1]);
        //System.out.println(userMap2);
    }

    //用户名校验方法
    private static HashMap<String,String> checkUser(HashMap<String,
            String> map,String userNameParam,String userPasswordParam) {
        //校验用户名是否已经注册，重复则抛出异常
        boolean b1 = map.containsKey(userNameParam);
        if(b1) {
            try {
                throw new RegisterException("昵称重复！！");
            } catch (RegisterException e) {
                //e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println("注册失败");
                return map;             //终止程序
            }
        }
        map.put(userNameParam,userPasswordParam);
        System.out.println("注册成功！！");
        return map;
    }

    //初始化界面
    private static String[] initUI() {
        String [] info = new String[2];
        System.out.println("      欢迎注册！！");
        System.out.println("========================");
        System.out.print("请输入您的用户名与密码(回车结束)\n");
        //键盘获取用户名与密码,存入数组
        System.out.print("用户名：");
        String userName = new Scanner(System.in).next();
        info[0] = userName;
        System.out.print("密  码：");
        String userPassword = new Scanner(System.in).next();
        info[1] = userPassword;

        return info;
    }
}
