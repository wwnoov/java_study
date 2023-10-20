package com.myStudy.myInter.exam02;
/**
 * 오버라이딩 연습
 * */
public class RemoteControlExample {
    public static void main(String[] args) {
        // RemoteControl 클래스의 인스턴스를 생성합니다.
        RemoteControl rc;
        // Television 클래스의 객체를 rc 변수에 할당합니다.
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();
        // RemoteControl 클래스의 changeBattery 정적 메서드를 호출하여 리모컨 배터리를 교체합니다
        RemoteControl.changeBattery();
    }
}
