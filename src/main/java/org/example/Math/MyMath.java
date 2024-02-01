package org.example.Math;

public class MyMath {
    // 자동생성 - 기본생성자는 생성자가 없을 경우 컴파일 할시 자동으로 생성된다.
    // 생성자의 접근제한자가 private를 붙이면 다른 곳에서 인스턴스 생성을 하지 못한다는 의미
    // static 메소드로 인해 인스턴스를 만들지 않더라도 사용 가능하지만, 인스턴스를 만드는 것은 메모리 낭비이다.
    //private MyMath(){}
    public static int abs(int x){
        if(x < 0)
            return x * -1;
        else
            return x;
    }

    public int abs1(int x){
        if(x < 0)
            return x * -1;
        else
            return x;
    }
}
