package com.myStudy.Inheri.Driver;
/**
 * 상속 예제
 * 택시 버스 상속
 * */
public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}