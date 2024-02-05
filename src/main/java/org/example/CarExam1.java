package org.example;

public class CarExam1 {
    public static void main(String[] args) {
        //추상클래스는 인스턴스를 생성할 수 없기때문에 익명클래스를 이용하여 사용한다.
        Car car = new Car(){
            @Override
            public void a(){
                System.out.println("이름없는 객체 a()메소드 오버라이딩");
            }
        };

        car.a();
    }
}
