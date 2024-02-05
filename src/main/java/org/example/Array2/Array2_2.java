package org.example.Array2;

public class Array2_2 {
    public static void main(String[] args) {
        // 가변배열 -> 각각의 데이터의 수가 달라지게 되면 가변배열이 유리
        int[][] array = new int[2][];
        array[0] = new int[2];
        array[1] = new int[3];

        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;

        // 가변형배열을 사용할때 length 유의하도록
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j] + "\t");
            }
        }
    }
}