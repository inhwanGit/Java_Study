package org.example.main;

import org.example.fw.Controller;
import org.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller controller = new FirstController();
        controller.execute();
    }
}
