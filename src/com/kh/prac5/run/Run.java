package com.kh.prac5.run;

import com.kh.prac5.model.vo.Collecting;
import com.kh.prac5.model.vo.Hobby;
import com.kh.prac5.model.vo.ReadingBook;

public class Run {
    public static void main(String[] args) {
        Hobby h = new Hobby();
        Hobby uph = new Collecting();
        //ReadingBook downRB = (ReadingBook) uph;

        Hobby[] polyArr = new Hobby[4];
        polyArr[0] = new Collecting(3, 100, "유표");
        polyArr[1] = new ReadingBook(4, 200, 100);
        polyArr[2] = new ReadingBook(5, 300, 225);
        polyArr[3] = new Collecting(6, 400, "도자기");

        for(int i=0;i<polyArr.length;i++) polyArr[i].print();
    }
 } 
