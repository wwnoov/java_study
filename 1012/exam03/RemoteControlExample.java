package com.myStudy.myInter.exam03;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTv();

        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTv();
        searchable.search("https://www.youtube.com");
    }
}