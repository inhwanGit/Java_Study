package org.example.While;

public class WhileExam4 {
    public static void main(String[] args){
        int i = 1;
        while (i++ < 10){
            if(i % 2 != 0)
                continue;
            System.out.println(i);
        }
    }
}
