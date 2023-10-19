package org.study.com.Lambda5;

import org.study.com.Lamdba2.MyFunctionInterface;

public class UsingThis {
    public int outterField = 10;
    class  Inner{
        int innerFiled = 20;

        void method(){
            //람다식
            MyFunctionInterface fi = () ->{
                System.out.println("outterFiled: "+outterField);
                //클래스명 this를 사용
                System.out.println("outterFiled: "+UsingThis.this.outterField+"\n");
                System.out.println("innerField: "+innerFiled);
                //람다식 내부에서 this는 inneㄱ객체를 참조
                System.out.println("innerField: "+this.innerFiled+"\n");
            };
            fi.method();
        }
    }
}
