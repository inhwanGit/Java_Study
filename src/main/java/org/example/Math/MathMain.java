package org.example.Math;

public class MathMain {
    public static void main(String[] args){
        int value =  MyMath.abs(-5);
        System.out.println(value);

        MyMath myMath = new MyMath();
        int value1 = myMath.abs1(-5);
        System.out.println(value1);
    }
}
