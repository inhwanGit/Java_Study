package org.example.Numexam;

public class BitOperatorExam1 {
    public static void main(String[] args){

        int a = 4;
        int b = a >> 1; // 2^1 으로 나눈다.
        System.out.println(b);

        int c = 4;
        int d = c << 1; //2^1 으로 곱한다.
        System.out.println(d);

        int e = 10;
        int f = e >>> 1;
        System.out.println(f);
    }
}

