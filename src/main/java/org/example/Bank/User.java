package org.example.Bank;

import java.io.Serializable;
import java.time.Year;

public class User implements Serializable {
    private String name;
    private int age;
    private String address;
    private String accountNumber;
    private int money;

    public User(String name, int age, String address, String accountNumber, int money){
        this.name = name;
        this.age = age;
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
        this.age = age;
}

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
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
