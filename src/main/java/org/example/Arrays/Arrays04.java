package org.example.Arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        int[] array1 = {5,4,3,1,2};

        Arrays.sort(array1);
        for(int i : array1){
            System.out.println(i);
        }
    }
}
