package org.example.List;

import java.util.ArrayList;

public class ListExam01 {
    public static void main(String[] args) {
        //자료구조객체들은 제너릭을 사용하지 않으면 Object 타입으로 저장된다.
        ArrayList list = new ArrayList<>();
        list.add("kim");
        list.add("park");
        list.add("lee");

        String str1 = (String)list.get(0);
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
