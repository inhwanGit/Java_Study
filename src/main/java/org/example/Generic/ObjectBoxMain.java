package org.example.Generic;

public class ObjectBoxMain {
    public static void main(String[] args) {
        ObjectBox box = new ObjectBox();
        box.set("Kim");
        String str = (String)box.get();
        System.out.println(str.toUpperCase()); //toUpperCase -> 대문자로 바꿔주는 것.

        box.set(5);
        Integer i = (Integer) box.get();
        System.out.println(i.intValue());
    }
}
