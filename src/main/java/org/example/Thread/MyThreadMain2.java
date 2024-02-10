package org.example.Thread;


public class MyThreadMain2 {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName(); //현재 스레드가 가지고 있는 이름
        System.out.println("Thread name : "+name);
        System.out.println("Thread Start");

        MyRunnable runnable1 = new MyRunnable("*");
        MyRunnable runnable2 = new MyRunnable("+");

        //3. Thread인스턴스를 생성하는, 생성자에 Runnable인스턴스를 넣어준다.
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        //4. Thread가 가지고 있는 start()메소드를 호출한다.
        thread1.start();
        thread2.start();

        System.out.println("Thread end");
    }
}