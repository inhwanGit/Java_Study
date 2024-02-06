package org.example.Exception;

public class Exception3 {
    public static void main(String[] args) {
        ExceptionObj3 exceptionObj3 = new ExceptionObj3();
        try {
            int value = exceptionObj3.divide(10,0);
            System.out.println(value);
        }catch (ArithmeticException ex){
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }
}

class ExceptionObj3{
    /**
     * i를 k로 나눈 나머지를 반환한다.
     * @throws ArithmeticException
     * */
    public int divide(int i, int k) throws ArithmeticException{
        int value = 0;
        value =  i / k;
        return value;
    }
}