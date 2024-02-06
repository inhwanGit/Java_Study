package org.example.Singleton;

public class Singleton1 {

    // Instance
    private static Singleton1 instance;

    // private construct
    private Singleton1(){};

    static {
        try{instance = new Singleton1();}
        catch (Exception e){
            throw new RuntimeException("Error" +e.getMessage());
        }
    }

    public static Singleton1 getInstance(){
        return instance;
    }
}
