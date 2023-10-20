package com.myStudy.esect;

/**
 * 자바 제어문
 * 1~10단까지의 합계를 구하는 프로그램
 */
public class DanSum {


    public static void main(String[] args) {

        int sum=0;
        int allsum=0;
        for (int i = 2; i <= 10; i++) {
            sum=0;
            for (int j = 1; j <= 9; j++) {
                System.out.println(i+"*"+j+"="+i*j+"\t");
                sum += i*j;
            }

            allsum +=sum;
            System.out.println(i+"단의 합은 "+sum);
        }
        System.out.println("1~10단까지의 합계는"+"\n"+allsum);
    }
}