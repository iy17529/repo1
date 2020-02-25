package com.rapjoee.day11.demo07;

/**
 * ClassName:Hero
 *
 * @Author:baba
 * @Date:2020/2/1 18:55
 * Description:
 */
public class Hero {

    private String name;
    private int age;
    private Skill skill;            //Skill接口作为成员变量

    public Hero() {
    }

    public Hero(String name, int age, Skill skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void attack(){
        System.out.println(name + "正在施放技能攻击敌人");
        skill.use();                //调用接口中的抽象方法
        System.out.println("技能施放完毕！！");
    }

}
