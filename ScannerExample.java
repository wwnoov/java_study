package com.myStudy.Scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("X 값 입력:");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.println("Y 값 입력:");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("X+Y :" + result);
        System.out.println();

        while (true) {
            System.out.print("입력 문자열:");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열:"+ data+"\n");
        }
        System.out.println("종료");


    }
}
