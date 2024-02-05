package org.example.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int[] copyForm = {1,2,3};
        int[] copyTo1 = java.util.Arrays.copyOf(copyForm, copyForm.length); // 배열을 복사하는 것뿐이지 배열을 참조하는것은 아니다. 메모리상 다른 배열을 사용

        for (int c1 : copyTo1){
            System.out.println(c1);
        }
        System.out.println("------------------------------");
        int[] copyTo2 = java.util.Arrays.copyOf(copyForm, 5);

        for(int c2 : copyTo2){
            System.out.println(c2);
        }
        System.out.println("------------------------------");
        int[] copy3 = copyForm; //배열을 참조하는것이다. 메모리상 같은 배열을 사용
        for(int c3 : copy3){
            System.out.println(c3);
        }
    }
}
