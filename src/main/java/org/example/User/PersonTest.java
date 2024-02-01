package org.example.User;

public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "홍길동"; // 문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다. String을 사용할 땐 되도록 new를 사용하지 말자
        //p1.address = "일산";
        p1.isVip = true;

        System.out.println(p1.name);
        System.out.println(p1.address.length()); //NullPoinException이라는 오류 발생 -> 래퍼런스 타입은 반드시 인스턴스를 참조해야 사용할 수 있다.
        System.out.println(p1.isVip);
    }
}
