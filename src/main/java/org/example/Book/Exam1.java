package org.example.Book;

public class Exam1 {
    public static void main(String[] args){
        Book b1 = new Book();
//        b1.price = 100; // 필드를 직접 접근 하는 것은 정보 은닉 관점에서 안좋다.
//        System.out.println(b1.price);

        b1.setPrice(500);
        System.out.println(b1.getPrice());
    }
}
