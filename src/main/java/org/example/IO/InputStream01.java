package org.example.IO;

import java.io.InputStream;

public class InputStream01 {
    public static void main(String[] args) {
        InputStream in = null;
        try{
            int data = in.read(); // byte 단위로 읽어 들여오는 read메소드가 byte가 아닌 int를 리턴하는 이유 -> EOF를 표현할 수 있는 방법이 없어서
        }catch (Exception ex1){
            System.out.println(ex1);
        }finally {
            try {
                in.close();
            }catch (Exception ex2){
                System.out.println(ex2);
            }
        }
    }
}
