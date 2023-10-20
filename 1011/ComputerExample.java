package com.myStudy.Inheri;
/**
 * 자바 상속
 * */
public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원 면적 : "+calculator.areCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원 면적 : "+computer.areCircle(r));
    }
}
