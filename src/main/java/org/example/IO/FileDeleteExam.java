package org.example.IO;

import java.io.File;

public class FileDeleteExam {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("사용법 : java File Delete 파일이름");
            System.exit(0);
        }

        File file = new File(args[0]);
        if(file.exists()){
            boolean delete =  file.delete();
            if(delete)
                System.out.println("파일 삭제 성공");
            else
                System.out.println("파일 삭제 실패");
        }else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}