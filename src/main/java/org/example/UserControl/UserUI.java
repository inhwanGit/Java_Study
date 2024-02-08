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
        System.out.println("1. 회원등록");
        System.out.println("2. 회원목록");
        System.out.println("3. 종료");
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
    public User regMenu(){

        try {
            System.out.println("이름을 입력하세요 : ");
            String name = br.readLine();
            System.out.println("생일을 입력하세요(숫자만 입력하세요) : ");
            String strbirthday = br.readLine();
            System.out.println("이메일을 입력하세요 : ");
            String email = br.readLine();
            int birthday = Integer.parseInt(strbirthday);
            User user = new User(name, birthday, email);
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
            System.out.println("    ");
            System.out.print(user.getBirthday());
            System.out.println("    ");
            System.out.print(user.getEmail());
            System.out.println();
        }
    }
}
