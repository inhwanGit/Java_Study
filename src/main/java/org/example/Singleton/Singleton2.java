package org.example.Singleton;

public class Singleton2 {

    // Instance
    private static Singleton2 instance;

    // private construct
    private Singleton2(){};

   public static Singleton2 getInstance(){
       if (instance == null){
           instance = new Singleton2();
       }
       return instance;
   }
}
