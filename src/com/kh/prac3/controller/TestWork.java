package com.kh.prac3.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TestWork {

    public void afterToken(String str) {
        System.out.println("토큰 처리 전 글자 : " + str);
        System.out.println("토큰 처리 전 갯수 : " + str.length());
        
        StringTokenizer st = new StringTokenizer(str, " ");

        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()) {
            sb.append(st.nextToken());
        }

        System.out.println("토큰 처리 후 글자 : " + sb);
        System.out.println("토큰 처리 후 갯수 : " + sb.length());
        System.out.println("모두 대문자로 변환 : " + sb.toString().toUpperCase());

    }

    public void findChar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(i==0) sb.append(str.toUpperCase().charAt(i));
            else sb.append(str.charAt(i));
        }
        System.out.println("첫 글자 대문자 : " + sb);

        System.out.println("찾을 문자 하나를 입력하세요 : ");
        char ch = sc.nextLine().charAt(0);
        int count = 0;

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i) == ch) count++;
        }
        System.out.println(ch + " 문자가 들어간 갯수 : " + count);
        sc.close();
    }
    
}
