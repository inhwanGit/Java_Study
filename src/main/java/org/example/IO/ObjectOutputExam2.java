package org.example.IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectOutputExam2 {
    public static void main(String[] args) throws Exception {
        User user1 = new User("inhwan@naver.con", "NanNo", 19991120);
        User user2 = new User("aa@naver.con", "No", 19911112);
        User user3 = new User("dd@naver.con", "Yes", 19921111);

        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/tmp/user.dat"));
        out.writeObject(list);
        out.close();
    }
}
