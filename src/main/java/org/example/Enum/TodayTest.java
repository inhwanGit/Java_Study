package org.example.Enum;

public class TodayTest{
    public static void main(String[] agrs){
        Today today = new Today();
        // today의 setDay()메소드에는 Enum타입인 Day가 전달되야 한다.
        // 이 경우 정수로 선언된 상수와 다르게 Day안에 선언된 상수만 값으로 전달 할 수 있다.
        today.setDay(Day.SUNDAY);
        //today.setDay(100); //이 코드는 사용할 수 없다.

        //today가 가지고 있는 Day타입의 상수값을 출력한다. 상수이름이 그대로 출력된다.
        System.out.println(today.getDay());
    }
}