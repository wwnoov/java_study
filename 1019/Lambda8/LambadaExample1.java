package org.study.com.Lambda8;

//FunctionInterface : 구현해야할 추상 메소드가 한개인 인터페이스
@FunctionalInterface

interface  Print{
    void print(int a, int b);
}

class Test{
    public void testMethod(Print print){
        print.print(1,2);
        System.out.println("콘솔 출력 실행문");
    }
}
public class LambadaExample1 {
    public static void main(String[] args) {
        Test noLamda = new Test();
        noLamda.testMethod(new Print() {
            @Override
            public void print(int a, int b) {
                System.out.println("a와b의 합은 "+ (a+b));
                System.out.println("a와b의 차는 "+ (a-b));
            }
        });
        Test lamdaTest = new Test();
        lamdaTest.testMethod((a,b) ->{
            System.out.println("a와b의 합은 "+ (a+b));
            System.out.println("a와b의 차는 "+ (a-b));
        });
    }
}
