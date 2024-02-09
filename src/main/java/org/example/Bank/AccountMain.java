package org.example.Bank;

import java.util.List;

public class AccountMain {
    public static void main(String[] args) {
        AccountFunction accountFunction = new AccountFunction();
        AccountFileIO fileIO = new AccountFileIO("/tmp/AccountFile");
        List<User> users = fileIO.getUser();
        while (true){
            int menuId = accountFunction.menu();
            switch (menuId){
                case 1 : {
                    User user = new AccountFunction().AccountRegistration(users); users.add(user);
                    System.out.println("회원등록이 완료되었습니다."); break;}
                case 2 : {accountFunction.allPrint(users); break;}
                case 3 : {accountFunction.moneyIo(users); break;}
                case 4 : {accountFunction.DeleteAccount(users); break;}
                case 5 : {fileIO.saveUser(users);
                    System.out.println("시스템을 종료합니다."); System.exit(0);}
                default: {
                    System.out.println("키를 잘못 입력하셨습니다.");
                }
            }
        }
    }
}
