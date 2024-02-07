package org.example.IO;

import java.io.CharArrayWriter;

public class IOExam05 {
    public static void main(String[] args) throws Exception {
        char data1 = 'a';
        char data2 = '가';
        CharArrayWriter out = new CharArrayWriter();
        out.write(data1);
        out.write(data2);
        out.close();

        char[] array = out.toCharArray();
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
