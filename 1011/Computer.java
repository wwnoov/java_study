package com.myStudy.Inheri;
/**
 * 자바 상속
 * */
public class Computer extends Calculator{

    public double areCircle(double r){
        System.out.println("Computer 객체의 areCircle() 실행");
        return Math.PI *r *r;
    }
}
