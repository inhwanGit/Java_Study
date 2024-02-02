package org.example.User;

public class Person {
    String name; // 인스턴스 필드 (static이 안 붙어 있다.)
    String address;
    boolean isVip;
    static int count = 0; // Person 클래스가 가지고 있는 count변수는 별도로 static한 영역에 저장되고 초기화 된다. // 클래스 필드
    static { // 클래스 필드는 static 블록에서 초기화할 수 있다.
        count = 100;
    }

    // 클래스가 가지고 있는 필드도 사용할 수 있다.
    // 인스턴스 메소드
    public void pintName(){
        System.out.println("내 이름은 " + name);
    }
    // 클래스 메소드
    public static void printCount(){
        // System.out.println(name); //static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용할 수 없다. 그 이유는 메모리에 생성되는 시점이 다르기 떄문이다.
        System.out.println("count : " + count);
    }
}
