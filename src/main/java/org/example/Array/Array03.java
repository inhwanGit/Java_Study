package org.example.Array;

public class Array03 {
    public static void main(String[] args) {
        int[] array1 = new int[5]; // 배열의 크기를 전해주고 다양한 방법으로 값을 읽어들일때 유리
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        int[] array2 = new int[]{1,2,3,4,5}; // 배열을 선언함과 동시에 값을 초기화해줄때 유리
        int[] array3 = {1,2,3,4,5};

        System.out.println("array1의 값 출력");
        for(int i =0; i< 5; i++){
            System.out.println(array1[i]);
        }

        System.out.println("array2의 값 출력");
        for(int i =0; i< 5; i++){
            System.out.println(array2[i]);
        }

        System.out.println("array3의 값 출력");
        for(int i =0; i< 5; i++){
            System.out.println(array3[i]);
        }
    }
}
