package com.myStudy.esect;
/**
 * 자바 제어문
 * 별표 만들기.
 */
/
public class Diamond {
    public static void main(String[] args) {
        // 상단
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print("  "); //공백
            }
            for (int j = 1; j <= i * 2 - 1; j++) { //나머지 별 한방에채우기.
                System.out.print("* ");
            }
            System.out.println();
        }
        //하단.
        for (int i = 3; i > 0; i--) {    //하단
            for (int j = 3; j >= i; j--) {
                System.out.print("  "); //공백
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}