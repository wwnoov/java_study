package com.myStudy.Char;
/**
 * 배열 원하는 문자 읽기
 * */
public class CharAtEx {
    public static void main(String[] args) {
        String ssn ="956241230123";
        char sex = ssn.charAt(6);
        switch (sex){
            case '1':
            case '3':
                System.out.println("남자입니다");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다");
                break;
        }
    }
}