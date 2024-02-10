package org.example.Thread;

public class MyThreadMain {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName(); //현재 스레드가 가지고 있는 이름
        System.out.println("Thread name : "+name);
        System.out.println("Thread Start");

        MyThread myThread1 = new MyThread("*");
        MyThread myThread2 = new MyThread("+");

        //3. thread는 start()메소드로 실행한다.
        myThread1.start();
        myThread2.start();


        System.out.println("Thread end");
    }
}
