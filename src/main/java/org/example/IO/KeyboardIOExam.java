package org.example.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardIOExam {
    public static void main(String[] args) throws Exception{
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : Sysytem.in (InputStream 주인공)
        // 화면 : System.out (PrintStream 주인공)
        // 키보드로 입력받는건 문자를 입력받는 것 : char 단위
        // char단위 입출력 클래스는 Reader, Writer
        // 한줄 읽기 : BufferReader라는 클래스는 readLine이라는 메소드를 가지고 있다.
        // 한줄 쓰기 : PrintStream, PrintWriter

        //BufferedReader는 장식
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in)); // 더 이상 읽어들일것이 없으면(EOF) null 반환

        String line = null;
        while ((line = bufferedReader.readLine()) != null){// 한줄 입력 받는다. // Mac은 command + D를 누르면 null값이 들어가면 프로그램이 종료가된다.(EndOfFile)
            System.out.println("읽어들인 값 : "+ line);
        }
    }
}