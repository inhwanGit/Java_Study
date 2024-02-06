package org.example.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {
        //인터페이스 타입 = 클래스타입으로 프로그램 작성해야 좋다.
        Collection<String> collection = new ArrayList<>(); //new ArrayList<>()이기 때문에 순서대로 데이터가 나온다.
        collection.add("kim");
        collection.add("park");
        collection.add("lee");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
