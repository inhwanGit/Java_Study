package org.example.Enum;

public enum County {
    KOREA{
        public void print(){
            System.out.println("대한민국");
        }
    };
    public abstract void print();
}