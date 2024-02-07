package org.example.IO;


import java.io.CharArrayReader;

public class IOExam06 {
    public static void main(String[] args) throws  Exception{
        char[] array = new char[2];
        array[0] = 'a';
        array[1] = '가';
        CharArrayReader in = new CharArrayReader(array);
        int read1 = in.read();
        int read2 = in.read();
        int read3 = in.read();
        in.close();

        System.out.println((char)read1);
        System.out.println((char)read2);
        System.out.println((char)read3);
    }
}
