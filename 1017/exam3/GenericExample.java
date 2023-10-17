package org.study.run.exam3;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLignt();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
