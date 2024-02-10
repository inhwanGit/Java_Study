package org.example.Thread;

public class MyThreaExam {
    public static void main(String[] args) {

        String name = Thread.currentThread().getName(); //현재 스레드가 가지고 있는 이름
        System.out.println("Thread name : "+name);
        System.out.println("Thread Start");
        //1초마다 * 를 10번 출력하는 프로그램을 작성하시오.
        for (int i = 0; i<10; i++){
            System.out.println("*");
            try {
                Thread.sleep(1000); // 1초간 쉰다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//for

        //1초마다 +를 10번 출력하는 프로그램을 작성하시오.
        for (int i = 0; i<10; i++){
            System.out.println("+");
            try {
                Thread.sleep(1000); // 1초간 쉰다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } //for
        System.out.println("Thread end");
    }
}
