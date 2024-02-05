package org.example.Arrays;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {
        int[] array1 = {5,4,3,1,2};

        Arrays.sort(array1);

        //binarySearch를 사용하기 위해서는 배열의 값이 정렬되어 있어야된다.
        int i = Arrays.binarySearch(array1, 4);
        System.out.println(i);
    }
}
