package org.example.UserControl;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String birthday;
    private String email;
    private int age;

    public User(String name, String birthday, String email, int age) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
