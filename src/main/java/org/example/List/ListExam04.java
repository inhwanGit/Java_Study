package org.example.List;

import java.util.ArrayList;
import java.util.List;

public class ListExam04 {
    public static void main(String[] args) {
        //인터페이스 타입 = 클래스타입으로 프로그램 작성해야 좋다.
        //객체지향 프로그램을 잘 작성하려면 인터페이스를 먼저 잘 작성해야된다.
        List<String> list = new ArrayList<>();
        
        list.add("kim");
        list.add("park");
        list.add("lee");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
