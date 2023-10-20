package org.study.run.exam1;
/**
 * 제네릭예제
 * */
public class GenericExample {
    public static void main(String[] args) {
        // 제네릭을 사용하여 문자열(String)을 저장할 수 있는 상자(Box) box1을 생성합니다.
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        int value = box2.content;
        System.out.println(value);
    }
}
