package org.example.Exception;

public class Exception2 {
    public static void main(String[] args) {
        ExceptionObj2 exceptionObj2 = new ExceptionObj2();
        int value = exceptionObj2.divide(10,0);
        System.out.println(value);
    }
}

class ExceptionObj2{
    public int divide(int i, int k){
        int value = 0;
        try{
            value =  i / k;
        }catch (ArithmeticException ex){
            System.out.println("0으로 나눌 수 없다.");
            System.out.println(ex.toString());
        }
        return value;
    }
}