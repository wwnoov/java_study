package com.myStudy.Inheri;

public class Computer extends Calculator{

    public double areCircle(double r){
        System.out.println("Computer 객체의 areCircle() 실행");
        return Math.PI *r *r;
    }
}
