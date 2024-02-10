package org.example.Bank;

import java.io.Serializable;
import java.time.Year;
import java.util.Timer;

/*
* 계좌 프로그램
* 이름, 나이(birthYear - nowYear), 주소, 계좌번호, 돈
* */
public class User implements Serializable {
    private String name;
    private int age;
    private String address;
    private int accountNumber;
    private int money;

    public User(String name, int age, String address, int accountNumber, int money){
        this.name = name;
        this.age = Integer.parseInt(String.valueOf(Year.now()))-age+1;
        this.address = address;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Integer.parseInt(String.valueOf(Year.now()))-age+1;
}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", money=" + money +
                '}';
    }
}
