package com.rapjoee.day11.demo06;

/**
 * ClassName:Weapon
 *
 * @Author:baba
 * @Date:2020/2/1 18:35
 * Description:
 */
public class Weapon {           //武器类

    private String code;        //武器的代号

    public Weapon() {
    }

    public Weapon(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
