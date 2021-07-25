package com.kh.prac4.run;

import com.kh.prac4.model.vo.Member;

public class Run {
    public static void main(String[] args) {
        Member[] m = {  new Member("김선후", 17, '남', 'B'),
                        new Member("홍미라", 23, '여', 'O'),
                        new Member("장수인", 20, '여', 'A'),
                        new Member("김가람", 27, '남', 'B'),
                        new Member("박수연", 25, '여', 'O')};

        Member[] tempM = new Member[8];
        for(int i=0;i<tempM.length;i++) {
            tempM[i] = new Member();
        }

        int tempIndex = 0;
        for(int i=0;i<m.length;i++) {
            for (int j=i+1;j<m.length;j++) {

                if(m[i].equals(m[j])) {
                    int k;
                    for(k=0;k<tempM.length;k++) {
                        if(m[j].equals(tempM[k])) break;
                    }
                    if(k==tempM.length) tempM[tempIndex++] = m[j];
                } 
            }
        }

        System.out.println("성별과 혈액형이 일치하는 인원이 있는 경우는 총 " + tempIndex + "가지");
    }
    
}
