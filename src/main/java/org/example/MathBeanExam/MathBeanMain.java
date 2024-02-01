package org.example.MathBeanExam;

public class MathBeanMain {
    public static void main(String[] args){
        MathBeanExam math = new MathBeanExam(); //heap 메모리에 올라간다.
        math.printClassName();
        math.printNumber(10);
        System.out.println(math.GetOne());
        System.out.println(math.plus(10,20));
    }
}
