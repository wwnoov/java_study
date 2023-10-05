package com.myStudy.esect;

import java.util.Scanner;

public class Diamond3 {
    public static void main(String[] args) {
        System.out.print("홀수를 입력해 주세요 : "); //행과 열의 중간 값이 존재하기 위해 홀수여야만 함
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 사용자에게 숫자를 입력 받음
        int mid = num / 2; //행과 열의 중간 값을 구하기 위한 변수

        //이중 for문을 이용해 행(i)과 열(j)을 구현, 만약 5를 입력 받았다면 5x5의 행렬이 생성
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                /*
                (0,0)부터 이 행과 열이 다이아몬드 내부에 있는지를 체크
                Math.abs(i - mid)는 행이 중앙에서 얼마나 떨어져 있는지,
                Math.abs(j - mid)는 열이 중앙에서 얼마나 떨어져 있는지 계산
                두 값을 더하면 중앙에서 몇 칸 떨어져있는지 알 수 있고
                이 값이 중간 값인 mid 보다 같거나 작다면 다이아몬드 내부이기 때문에 * 출력
                크다면 다이아몬드에서 벗어낫기 때문에 공백 출력
                절대값을 구해주는 Math.abs() 함수를 이용하기 때문에 다이아몬드 상부와 하부를 구분할 필요가 없음
                */
                if (Math.abs(i - mid) + Math.abs(j - mid) <= mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 열이 끝에 다다르면 줄을 바꿔주어서 다음 행으로 이동
        }
    }
}
