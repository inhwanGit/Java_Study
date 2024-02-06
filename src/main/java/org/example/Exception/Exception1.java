package org.example.Exception;

public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exobj1 = new ExceptionObj1();
        int value = exobj1.divide(10,0);
        System.out.println(value);
    }
}

class ExceptionObj1{
    public int divide(int i, int k){
        int value = 0;
        value =  i / k; // ArithmeticException 0으로 나눌 수 없다.
        return value;
    }
}