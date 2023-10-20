package com.myStudy.Inheri;
/**
 * 생성자 연습
 * */
public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("아이폰","검정");

        System.out.println("모델: "+ myPhone.model);
        System.out.println("색상: "+ myPhone.color);
    }
}
