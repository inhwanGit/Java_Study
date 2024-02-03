package org.example.추상클래스;

// 추상 클래스
public abstract class Car2 {
    public Car2(String name){
        super(); //자동으로 들어간다.
        System.out.println("추상클래스.Car2() 생성자 호출");
    }

    // 추상 메소드. Car2를 만든 사람은 run()이라는 메소드가 필요하다고 생각 했다.
    // run()은 자동차 마다 다르게 구현할 것 같다.
    public abstract void run(); // 이와 같이 메소드를 선언하게 되면 상속받는 쪽에서는 무조건 선언해야된다.
}
