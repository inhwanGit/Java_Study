package org.example.Foreach;

public class ForEachExam1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

//        for(int i = 0; i < array.length; i++){ // i : 0,1,2,3,4
//            System.out.println(array[i]);
//        }

        for(int i : array){ //array 배열로 부터 하나씩 꺼내라
            System.out.println(i);
        }
    }
}
