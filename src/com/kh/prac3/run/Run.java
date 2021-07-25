package com.kh.prac3.run;

import com.kh.prac3.controller.TestWork;

public class Run {
    private static TestWork tw;

    public static void main(String[] args) {
        String str = "J a v a P r o g r a m";
        tw = new TestWork();
        System.out.println("------토큰처리하기------");
        tw.afterToken(str);

        System.out.println("------문자갯수찾기------");
        tw.findChar();
    }
}