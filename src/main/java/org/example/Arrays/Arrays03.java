package org.example.Arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,2,3,4,6};

        // 양수, 0, 음수 (비교할때)
        // compare는 왼쪽 배열이 크면 양수, 오른쪽 배열이 크면 음수, 같으면 0이 나온다.
        int compare = Arrays.compare(array1,array3);
        System.out.println(compare);
    }
}
