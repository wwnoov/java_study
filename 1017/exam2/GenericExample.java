package org.study.run.exam2;
/**
 * 제네릭 예제
 * */
public class GenericExample {
    public static void main(String[] args) {
        
        // 제네릭을 사용하여 문자열(String)을 저장할 수 있는 Product 생성
        Product<Tv,String> product1 =new Product<>();

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}