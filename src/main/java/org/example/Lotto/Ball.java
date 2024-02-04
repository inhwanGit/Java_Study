package org.example.Lotto;

// 불변객체 -> 클래스에서 값을 리턴만 해주는것.
public class Ball {
    private int number;
    public Ball(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
