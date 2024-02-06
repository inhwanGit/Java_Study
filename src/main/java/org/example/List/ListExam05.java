package org.example.List;

import java.util.*;

public class ListExam05 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("kim");
        boolean flag2 = set.add("park");
        boolean flag3 = set.add("lee");
        boolean flag4 = set.add("lee");

        // 중복된 값을 확인하려면 boolean을 활용하면 된다.
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
