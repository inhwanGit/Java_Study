package org.example.IO;


import java.io.StringWriter;

public class IOExam07 {
    public static void main(String[] args) throws Exception {
        StringWriter out = new StringWriter();
        out.write("hello");
        out.write("world");
        out.write("!");
        out.close();

        String str = out.toString(); // 문자열 전체를 합친다.
        System.out.println(str);
    }
}
