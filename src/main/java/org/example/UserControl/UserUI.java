package org.example.UserControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        System.out.println("====================================================================");
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
                        System.out.print("이미 존재하는 이메일입니다. 다시 입력해주세요");
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

    // "3. 회원정보수정"
    public User updateUser(List<User> users) {
        try {
            System.out.println("수정할시 회원님의 이메일을 입력해주세요.");
            String email = br.readLine();

            for (User serachUser : users) {
                if (serachUser.getEmail().equals(email)) {
                    System.out.println("1. 회원 이름  2. 회원 생년월일  3. 회원 이메일");
                    System.out.println("=======================================");
                    System.out.print("수정하실 기능을 입력해주세요 : ");
                    String strNum = br.readLine();
                    int num = Integer.parseInt(strNum);

                    if (num == 1) {
                        System.out.print("수정할시 회원님의 이름을 입력해주세요. : ");
                        String updateName = br.readLine();
                        serachUser.setName(updateName);
                    } else if(num == 2){
                        System.out.print("수정할시 회원님의 생년월일 입력해주세요. : ");
                        String updateBirthday = br.readLine();
                        int intUpdateBirthday = Integer.parseInt(updateBirthday);
                        serachUser.setBirthday(intUpdateBirthday);
                    } else if(num == 3){
                        System.out.print("수정할시 회원님의 이메일 입력해주세요. : ");
                        String updateEmail = br.readLine();
                        serachUser.setName(updateEmail);
                    } else {
                        System.out.println("잘못된 입력입니다. 수정을 종료합니다.");
                        break;
                    }
                    System.out.println("수정이 완료되었습니다.");
                    return serachUser;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    // "4. 회원삭제"
    public User deleteUser(List<User> users){
        try {
            System.out.print("삭제하실 회원님의 이메일을 입력해주세요. : ");
            String email = br.readLine();
            //1. 이메일로 회원 찾기
            User foundUser = null;
            for (User user : users) {
                if (user.getEmail().equals(email)) {
                    //찾은 회원 정보 담기
                    foundUser = user;
                    break;
                }
            }
            if(foundUser != null){
                users.remove(foundUser);
                System.out.println("회원 정보를 삭제하였습니다.");
            }else {
                System.out.println("해당 이메일은 존재하지 않습니다.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
