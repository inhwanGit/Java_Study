package org.example.추상클래스;

public class SportsCar {
    // 부모가 기본생성자가 없기 때문에 반드시 super()를 호출해야한다.
    public SportsCar(String name){
        super();
    }
    public void run() {
        System.out.println("사륜구동입니다. ");
    }
}
