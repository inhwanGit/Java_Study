package org.example.IO;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloIO01 {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("/tmp/hello01.dat");
        // int의 마지막 2byte만 써짐
        out.write(1); // 0000 0000 1byte 0000 0000 1byte 0000 0000 1byte 0000 00001 1byte
        out.write(255); //
        out.write(0);
        out.close();
    }
}