package org.example.Generic;

public class GenericBoxMain {
    public static void main(String[] args) {

        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        // genericBox.add(5); //컴파일 에러 -> GenericBox를 String타입으로 담는다 선언했기 때문

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(5);
        Integer inValue = intBox.get();
        System.out.println(inValue);
    }
}
