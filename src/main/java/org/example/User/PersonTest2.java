package org.example.User;

public class PersonTest2 {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p2.name = "전우치";

        System.out.println(p1.name);
        System.out.println(p2.name);
//        System.out.println(p1.count);
//        System.out.println(p2.count);
        System.out.println(Person.count);
//        p1.count++;
        Person.count++;
//        System.out.println(p1.count);
//        System.out.println(p2.count);
//        p2.count++;
//        System.out.println(p1.count);
//        System.out.println(p2.count);

        System.out.println(Person.count); //static한 필드는 클래스명.필드명 형식으로 사용한다.
    }
}
