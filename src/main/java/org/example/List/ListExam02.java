package org.example.List;

import java.util.ArrayList;

public class ListExam02 {
    public static void main(String[] args) {
        // 자료를 꺼낼 때 형변환 하지 않아도 된다.
        ArrayList<String> list = new ArrayList<>();
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
