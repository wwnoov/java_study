package com.myStudy.myInter.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("처음 타이어");

        myCar.run();
        System.out.println("=========");
        //타이어 교체
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();
        System.out.println("교체 타이어");
        myCar.run();
    }
}