package org.study.com.Lambda7;

public class RunnableExmaple {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i=0;i<10;i++){
                System.out.println(i);
            }
        });
        thread.start();
    }
}
