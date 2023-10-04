package com.myStudy.esect;
/**
 중앙 별 의 갯수를 입력받아서 다이아몬드 모양으로 만들기
 */

/

import java.util.Scanner;

public class Diamond2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원하는 중앙별 갯수를 입력하세요(홀수만 가능합니다)");
        String strX = scanner.nextLine();
        int data = Integer.parseInt(strX);
        int star = data - (data / 2);
        // 상단
        if (data % 2 == 1) {
            for (int i = 1; i <= star; i++) {
                for (int j = 1; j <= star - i; j++) {
                    System.out.print("  "); //공백
                }
                for (int j = 1; j <= i * 2 - 1; j++) { //나머지 별 한방에채우기.
                    System.out.print("* ");
                }
                System.out.println();
            }
            //하단.
            for (int i = star - 1; i > 0; i--) {    //하단
                for (int j = star - 1; j >= i; j--) {
                    System.out.print("  "); //공백
                }
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (data % 2 != 1){
            System.out.println("홀수만 입력하세요");
       }
    }
}