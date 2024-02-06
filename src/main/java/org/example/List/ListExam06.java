package org.example.List;

import java.util.*;

public class ListExam06 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("k1", "park");
        map.put("k2", "hi");
        map.put("k3", "hello");

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}