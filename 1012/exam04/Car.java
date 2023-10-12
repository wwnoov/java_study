package com.myStudy.myInter.exam04;

public class Car {

    Tire tire1 = new HanKookTire();
    Tire tire2 = new HanKookTire();

    void run(){
        tire1.roll();
        tire2.roll();
    }
;}
