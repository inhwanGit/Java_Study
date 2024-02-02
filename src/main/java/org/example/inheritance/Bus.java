package org.example.inheritance;

// Bus는 자동차의 한 종류다.
public class Bus extends Car{
    // 오버라이딩
    public void run(){
        System.out.println("후륜구동한다.");
    }
    public void 안내방송(){ // 한글로 메소드를 사용할 수 잇다.
        System.out.println("안내방송한다.");
    }
}
