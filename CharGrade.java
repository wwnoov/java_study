package com.myStudy.Char;
/**
 * 자바 if문으로 학점 구하는 프로그램
 */
import java.util.Scanner;

public class CharGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학점을 입력하세요:");
        String strX = scanner.nextLine();
        int score = Integer.parseInt(strX);
        char grade;
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70){
            grade = 'C';
        } else if (score >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(score + "점은" + grade + " 등급입니다");
    }
}
