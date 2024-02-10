package org.example.Bank;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
/*
* 계좌List를 저장할 수 있도록 한다.
* */
public class AccountFileIO {
    private String fileName;

    //생성자
    public AccountFileIO(String fileName) {
        this.fileName = fileName;
    }

    public void saveUser(List<User> list){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(list);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public List<User> getUser(){
        File file = new File(fileName);
        if(!file.exists()){
            return new ArrayList<>();
        }

        List<User> list = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            list = (List<User>)in.readObject();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return list;
    }
}
