package org.example.IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOExam02 {
    public static void main(String[] args) throws Exception {
        // 문제 이름, 국어, 영어, 수학, 총점, 평균 점수를 파일에 읽어들이기

        DataInputStream in = new DataInputStream(new FileInputStream("/tmp/score.dat"));
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();
        in.close();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);
    }
}
