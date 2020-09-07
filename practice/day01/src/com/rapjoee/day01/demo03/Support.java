package com.rapjoee.day01.demo03;

/**
 * ClassName:Support
 *
 * @Author:baba
 * @Date:2020/2/3 13:47
 * Description:
 */
public class Support extends Hero implements Healer{

    public Support() {
    }

    public Support(String name, float hp, float armor, int moveSpeed) {
        super(name, hp, armor, moveSpeed);
    }

    @Override
    public  void heal(){            //重写治疗方法
        System.out.println("进行治疗");
    }
    public  void heal(Hero hero){            //为指定英雄治疗
        System.out.println("为"+hero.getName()+"治疗！");
    }
    public  void heal(Hero hero,int hp){            //为指定英雄加了hp的血
        System.out.println("为" + hero.getName() + "加了" + hp+ "的血");
    }

}
