package org.example.Array;

public class Array01 {
    public static void main(String[] args) {
        int[] array1;
        int array2[];
        int array3[];

        // 배열 변수를 선언했다면 반드시 초기화 해줘야 한다.
        array1 = new int[5]; // 정수를 5개 가질 수 있는 인스턴스 생성
        array2 = new int[5];
        array3 = new int[0]; // 정수를 아무것도 가질 수 없는 인스턴스 생성

        System.out.println(array1.length); // .length 배열의 길이
        System.out.println(array2.length);
        System.out.println(array3.length);
    }
}