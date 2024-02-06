package org.example.Singleton;

public class Singleton4 {


    // private construct
    private Singleton4(){};

    private static class InnerSingleton{
        // 클래스 로딩 시점에서 생성
        private static final Singleton4 uniqueInstance = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return InnerSingleton.uniqueInstance;
    }
}
