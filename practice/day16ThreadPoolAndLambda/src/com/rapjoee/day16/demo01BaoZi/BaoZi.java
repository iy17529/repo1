package com.rapjoee.day16.demo01BaoZi;

/**
 * ClassName:BaoZi
 *
 * @Author:Mr.Zhan
 * @Date:2020/2/11 14:38
 * Description:
 *
 * 包子类
 *      属性：皮、馅、状态【有无】
 */
public class BaoZi {
    private String piEr;                //皮
    private String xianEr;              //馅
    boolean conditionOfBaoZi = false;   //状态.赋初值为没有
    private int countBaoZi = 0;         //包子的数量，只能做三个

    public int getCountBaoZi() {
        return countBaoZi;
    }

    public void setCountBaoZi(int countBaoZi) {
        this.countBaoZi = countBaoZi;
    }

    public BaoZi() {
    }

    public BaoZi(String piEr, String xianEr, boolean conditionOfBaoZi) {
        this.piEr = piEr;
        this.xianEr = xianEr;
        this.conditionOfBaoZi = conditionOfBaoZi;
    }

    public String getPiEr() {
        return piEr;
    }

    public void setPiEr(String piEr) {
        this.piEr = piEr;
    }

    public String getXianEr() {
        return xianEr;
    }

    public void setXianEr(String xianEr) {
        this.xianEr = xianEr;
    }

    public boolean isConditionOfBaoZi() {
        return conditionOfBaoZi;
    }

    public void setConditionOfBaoZi(boolean conditionOfBaoZi) {
        this.conditionOfBaoZi = conditionOfBaoZi;
    }
}
