package org.example.추상클래스;

public class Car2Exam {
    public static void main(String[] args) {
        //추상클래스.Car2 c = new 추상클래스.Car2("hello"); //추상클래스.Car2'은(는) abstract이며, 인스턴스화할 수 없습니다 error 발생
        Bus2 b = new Bus2();
        b.run();

        SportsCar s = new SportsCar("sportsCar!!!");
        s.run();

    }
}
