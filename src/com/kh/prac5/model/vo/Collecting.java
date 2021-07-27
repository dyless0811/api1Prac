package com.kh.prac5.model.vo;

public class Collecting extends Hobby{
    private String stuff;

    public Collecting() {
    }

    public Collecting(String stuff) {
        this.stuff = stuff;
    }

    public Collecting(int spendTime, int spendMoney, String stuff)  {
        super(spendTime, spendMoney);
        this.stuff = stuff;
    }

    public void colMethod() {
        System.out.println(super.toString() + " 물품 : " + stuff);
    }

    @Override
    public void print() {
        System.out.println(super.toString() + " 물품 : " + stuff);
    }
}