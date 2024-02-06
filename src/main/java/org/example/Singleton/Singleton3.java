package org.example.Singleton;

public class Singleton3 {

    // Instance
    private static Singleton3 instance;

    // private construct
    private Singleton3(){};

   public static synchronized Singleton3 getInstance(){
       if (instance == null){
           instance = new Singleton3();
       }
       return instance;
   }
}
