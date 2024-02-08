package org.example.UserControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserUI {
    private BufferedReader br;
    public UserUI(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu(){
        System.out.print("1. 회원등록");
        System.out.print("      ");
        System.out.print("2. 회원목록");
        System.out.print("      ");
        System.out.print("3. 회원정보수정");
        System.out.print("      ");
        System.out.print("4. 회원삭제");
        System.out.print("      ");
        System.out.println("0. 종료");
        System.out.println("=======================================================");
        System.out.print("이용하실 메뉴를 입력해주세요 : ");
        int menuId = -1;
        try {
            String line = br.readLine();
            menuId = Integer.parseInt(line); //문자열을 정수로 변환
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return menuId;
    }
    // "1. 회원등록"
    public User regMenu(List<User> users){
        try {
            System.out.print("이름을 입력하세요 : ");
            String name = br.readLine();
            System.out.print("생일을 입력하세요(숫자만 입력하세요) : ");
            String strbirthday = br.readLine();
            String email;

            while (true){
                System.out.print("이메일을 입력하세요 : ");
                email = br.readLine();
                boolean exitwhile = false;
                // 이메일 중복확인
                for(User existingUser : users){
                    if(existingUser.getEmail().equals(email)){
                        System.out.println("이미 존재하는 이메일입니다.");
                        exitwhile = true;
                        break;
                    }
                }
                //중복되지 않았다면 while문 빠져나가기
                if(!exitwhile){
                    break;
                }
            }


            int birthday = Integer.parseInt(strbirthday);
            User user = new User(name,birthday,email);
            return user;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //"2. 회원목록"
    public void printUser(List<User> users){
        System.out.println("이름           생년          email");
        System.out.println("================================");
        for(int i = 0; i<users.size(); i++){
            User user = users.get(i);
            System.out.print(user.getName());
            System.out.print("        ");
            System.out.print(user.getBirthday());
            System.out.print("        ");
            System.out.print(user.getEmail());
            System.out.println();
        }
    }

    //"3. 회원정보수정"
    public void updateUser(List<User> users){
        //1. 이메일로 회원 찾기
    }
}
