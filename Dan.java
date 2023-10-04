package com.myStudy.esect;

import java.util.Scanner;

/**
 구구단 입력 프로그램
 */
public class Dan {

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("단을 입력하세요");
            String x = scanner.nextLine();
            int dan = Integer.parseInt(x);
            if (dan<10 && dan>1) {
                for (int i = 1; i <= 9; i++) {
                   // System.out.println(dan + "*" + i + "=" + dan * i);
                    System.out.printf("%d X %d = %2d ",dan,i,dan*i);
                    System.out.println("");
              }
            }
                else{
                System.out.println("구구단은 2~9단까지만 가능합니다");
                    break;
                }
            }
        }
    }