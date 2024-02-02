package org.example.Book;

public class Book {
    // public int price;
    private int price; //지역변수

    //private한 필드를 접근하기 위해 제공하는 메소드를 setter, getter라고 한다.
    // setter, getter -> 프로퍼티(property)
    public int getPrice() {
        //메소드가 길어지면 메소드에서 선언된 지역 변수인지 필드인지 착각할 수 있기 때문에 인스턴스 필드를 사용할 때는 this.price라고 적어 줄 수 있다.
        return price;
        // return this.price; // this는 내 자신 인스턴스를 참조하는 예약어 // 클래스 메소드는 인스턴스가 생성이 되지 않아도 사용가능하여 메모리에 생성되는 시점이 달라 클래스 메소드에서는 this을 사용할 수 없다. // 인스턴스 변수
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
