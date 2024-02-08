package org.example.UserControl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
}
