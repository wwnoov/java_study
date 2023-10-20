package com.myStudy.Inheri.tire;
/**
 * 자바 상속
 * 타이어 상속
 * */
public class CarExample {
    public static void main(String[] args) {
        Car myCar =new Car();

        myCar.tire= new Tire();
        myCar.run();

        myCar.tire= new HankooTire();
        myCar.run();

        myCar.tire= new KumhaTire();
        myCar.run();
    }
}
