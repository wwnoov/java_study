package com.myStudy.myClass.exam02;
/**
 * 자바 클래스
 * */
public class Calculator {
    //리턴값이 없는 메소드 선언
    void powerOn() {
        System.out.println("전원을 켭니다");
    }

    //리턴값이 있는 메소드 선언
    void powerOff() {
        System.out.println("전원을 끕니다");
    }

    //호출 시 두 정수 값을 전달받고
    //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    //호출 시 두 정수 값을 전달받고
    //호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    double divide(int x, int y) {
        double result =(double) x / y;
        return result;
    }
}