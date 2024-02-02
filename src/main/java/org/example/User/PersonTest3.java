package org.example.User;

public class PersonTest3 {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "홍길동";

        p1.pintName();
        Person.printCount();
        Person.count++;

        Person.printCount();
    }
}
