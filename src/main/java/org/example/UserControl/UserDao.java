package org.example.UserControl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
* 파일에서 List<User>정보를 저장하거나 읽어오는 기능
* */
public class UserDao {
    private String fileName;

    //생성자
    public UserDao(String fileName) {
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
