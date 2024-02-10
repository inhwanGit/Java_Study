package org.example.Thread;

//1. Thread클래스 상속받는다.
public class MyThread extends Thread{
    private String str;

    public MyThread(String str){
        this.str = str;
    }

    //2. run()메소드를 작성한다.
    @Override
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println(str);
            try {
                Thread.sleep(1000); // 1초간 쉰다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }//for
    }
}
