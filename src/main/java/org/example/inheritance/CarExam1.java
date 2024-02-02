package org.example.inheritance;

public class CarExam1 {
    public static void main(String[] args){
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송();

        Car c1 = new Bus();
        c1.run();
        //c1.안내방송(); //error -> 참조 변수의 타입으로 Car를 사용하면 Car가 가지고 있는 메소드만 사용 가능하기 떄문
        //안내 방송을 사용하려면 아래와 같이 하면된다.
        Bus b2 = (Bus)c1; //(Bus)는 참조할 수 있도록 해주는것 -> 프로그래머인 내가 보증한다는 의미
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.run();
    }
}
