package org.example.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Timer;

public class AccountFunction {
    private BufferedReader br;
    public AccountFunction(){
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu(){
        System.out.print("1. 계좌 등록");
        System.out.print("      ");
        System.out.print("2. 계좌 목록");
        System.out.print("      ");
        System.out.print("3. 입 출금");
        System.out.print("      ");
        System.out.print("4. 계좌 삭제");
        System.out.print("      ");
        System.out.println("5. 종료");
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

    // 계좌 등록
    public User AccountRegistration(List<User> users){
        try {
            System.out.print("회원님의 성함을 입력해주세요 : ");
            String name = br.readLine();
            int brithYear;
            //4자리 태어난 년도가 아닌경우
            while (true){
                System.out.print("회원님의 태어난년도를 입력해주세요 : ");
                brithYear = Integer.parseInt(br.readLine());
                if(String.valueOf(brithYear).length() != 4){
                    System.out.println("잘못된 탄생일입니다.");
                }else {
                    break;
                }
            }
            System.out.print("회원님의 주소를 입력해주세요 : ");
            String address = br.readLine();
            int accountNumber = (int)(Math.random() * 899999) + 100000; //100000~999999까지 랜덤값
            System.out.print("계좌 개설시 입금할 금액을 입력해주세요 : ");
            String strmoney = br.readLine();
            int money = Integer.parseInt(strmoney);
            while (true){
                boolean chk = false;
                chkAccountNumber(users);
                for(User chkAccountNumber : users){
                    if(chkAccountNumber.getAccountNumber() == accountNumber){
                        chk = true;
                        accountNumber = (int)(Math.random() * 899999) + 100000;
                        break;
                    }
                }
                if(!chk){
                    System.out.println("계좌가 생성되었습니다.");
                    break;
                }
            }
            User user = new User(name,brithYear,address,accountNumber,money);
            return user;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void allPrint(List<User> users){
        System.out.println("이름          나이          주소          계좌번호            잔액");
        System.out.println("============================================================");
        for(int i = 0; i < users.size(); i++){
            User user = users.get(i);
            System.out.print(user.getName()+"\t\t\t");
            System.out.print(user.getAge()+"\t\t\t");
            System.out.print(user.getAddress()+"\t\t\t");
            System.out.print(user.getAccountNumber()+"\t\t\t");
            System.out.print(user.getMoney()+"\t\t");
            System.out.println();
        }
    }

    public void moneyIo(List<User> users){
        try {
            User chk = chkAccountNumber(users);
            if(chk != null) {
                System.out.println("1.입금        2.출금");
                System.out.println("==================");
                System.out.print("입출금을 선택해주세요 : ");
                String num = br.readLine();
                if (num.equals("1")) {
                    while (true){
                        System.out.println(chk.getName() + "님 환영합니다. 현재 통장 잔액은 : " + chk.getMoney()+"입니다.");
                        System.out.print("입금하실 금액을 입력해주세요 : ");
                        String strinputMoney = br.readLine();
                        if(!strinputMoney.isEmpty() && !strinputMoney.equals("0")){
                            int inputMoney = Integer.parseInt(strinputMoney);
                            int totalMoney = chk.getMoney() + inputMoney;
                            chk.setMoney(totalMoney);
                            System.out.println("입금이 완료되었습니다. 잔액은 : "+chk.getMoney()+"입니다.");
                            break;
                        }
                        System.out.println("잘못 입력하셨습니다.");
                    }
                } else if (num.equals("2")) {
                    while (true){
                        System.out.println(chk.getName() + "님 환영합니다. 현재 통장 잔액은 : " + chk.getMoney()+"입니다.");
                        System.out.print("출금하실 금액을 입력해주세요 : ");
                        String stroutputMoney = br.readLine();
                        if(!stroutputMoney.isEmpty() && !stroutputMoney.equals("0")){
                            int outputMoney = Integer.parseInt(stroutputMoney);
                            if(outputMoney <= 0){
                                System.out.println("잘못 입력하셨습니다.");
                            }else if( chk.getMoney() < outputMoney){
                                System.out.println("잔액이 부족합니다.");
                            }
                            else {
                                int totalMoney = chk.getMoney() - outputMoney;
                                chk.setMoney(totalMoney);
                                System.out.println("출금이 완료되었습니다. 잔액은 : "+chk.getMoney()+"입니다.");
                                break;
                            }
                        }
                    }
                } else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void DeleteAccount(List<User> users){
        User chk = chkAccountNumber(users);
        if(chk != null){
            users.remove(chk);
            System.out.println("계좌 삭제를 완료하였습니다.");
        }
    }

    public User chkAccountNumber(List<User> users){
        try {
            System.out.print("회원님의 계좌번호를 입력해주세요 : ");
            String accountNum = br.readLine();
            for(User chkAccountNum : users){
                if(chkAccountNum.getAccountNumber() == Integer.parseInt(accountNum)){
                    return chkAccountNum;
                }else {
                    System.out.println("존재하지 않는 계좌번호입니다.");
                    return null;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
