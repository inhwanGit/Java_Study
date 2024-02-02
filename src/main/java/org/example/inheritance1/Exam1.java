package org.example.inheritance1;

public class Exam1 {
    public static void main(String[] args){
        Parent parent = new Parent();
        System.out.println(parent.i);
        parent.printI();
        System.out.println("--------------------");
        Child child = new Child();
        System.out.println(child.i);
        child.printI();
        System.out.println("--------------------");
        Parent parent1 = new Child();  //Child는 Parent의 후손이다. 혹은 자식이다.
        System.out.println(parent1.i);
        parent1.printI();
    }
}
