package org.example.Switch;

public class SwitchExam2 {
    public static void main(String[] args){
        int num = 1;
        switch (num){
            case 1 :
                System.out.println("1입니다."); //num이 1일 경우
                break;
            case 2 :
                System.out.println("2입니다."); //num이 2일 경우
                break;
            case 3 :
                System.out.println("3입니다."); //num이 3일 경우
                break;
            default:
                System.out.println("1,2,3이 아닙니다.");
        }
    }
}
