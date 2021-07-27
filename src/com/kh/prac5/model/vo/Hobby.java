package com.kh.prac5.model.vo;

public class Hobby {
    private int spendTime;
    private int spendMoney;

    public Hobby() {
        
    }

    public Hobby(int spendTime, int spendMoney) {
        this.spendTime = spendTime;
        this.spendMoney = spendMoney;
    }

    @Override
    public String toString() {
        return "시간 : " + spendTime + " 금액 : " + spendMoney; 
    }

    public void print() {
        System.out.println("시간 : " + spendTime + " 금액 : " + spendMoney);
    }
}
