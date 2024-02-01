package org.example.Label;

public class LabelExam2 {
    public static void main(String[] args) {
        //outter: -> 라벨
        outter:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2)
                    // outter;를 사용하면 outter가 붙은 for문 반복문을 빠져나가게 된다.
                    continue outter;
                System.out.println(i + "," + k);
            }
        }
    }
}
