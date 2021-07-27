package com.kh.prac5.model.vo;

public class ReadingBook extends Hobby{
    private int bookNo;

    public ReadingBook() {
    }

    public ReadingBook(int spendTime, int spendMoney, int bookNo) {
        super(spendTime, spendMoney);
        this.bookNo = bookNo;
    }

    public ReadingBook(int bookNo) {
        super();
        this.bookNo = bookNo;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public void reMethod() {
        System.out.println(super.toString() + " 책 : " + bookNo);
    }

    @Override
    public void print() {
        System.out.println(super.toString() + " 책 : " + bookNo);
    }    
}
