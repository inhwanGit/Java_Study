package org.example.UserControl;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("/tmp/users.dat");
        List<User> users = userDao.getUser();
        while (true){
            int menuId = userUI.menu();
            switch (menuId){
                case 1 : {User user = new UserUI().regMenu(users); users.add(user);
                    System.out.println("회원등록이 완료되었습니다."); break;}
                case 2 : {userUI.printUser(users); break;}
                case 3 : {userUI.updateUser(users); break;}
                case 4 : {userUI.deleteUser(users); break;}
                case 5 : {userDao.saveUser(users);
                    System.out.println("시스템을 종료합니다."); System.exit(0);}
                default: {
                    System.out.println("키를 잘못 입력하셨습니다.");
                }
            }
        }
    }
}
