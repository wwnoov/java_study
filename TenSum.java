package com.myStudy.esect;

/**
 * 자바 제어문
 1~10까지 합을구하는 프로그램
 */
public class TenSum {
    public static void main(String[] args) {
        int sum=0;
        for (int i= 0; i<=10;i++){
        sum += i;
        }
        System.out.println("1~10까지의 합은"+"\n"+sum);
    }
}