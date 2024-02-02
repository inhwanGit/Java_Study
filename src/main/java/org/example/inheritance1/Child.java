package org.example.inheritance1;

public class Child extends Parent{
    public int i = 10; // 필드에 대한 오버라이딩
    public void printI(){ // 메소드에 대한 오버라이딩
        System.out.println("child - printI() : " + i);
    }
}
