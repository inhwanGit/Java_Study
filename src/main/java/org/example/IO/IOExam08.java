package org.example.IO;


import java.io.StringReader;
import java.io.StringWriter;

public class IOExam08 {
    public static void main(String[] args) throws Exception {
        StringReader in = new StringReader("helloworld!!!!!");
        int ch = -1;

        while ((ch = in.read()) != -1){
            System.out.println((char) ch);
        }
    }
}