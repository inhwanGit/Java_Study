package org.example.Chat2;

import java.io.*;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws Exception{
        if(args.length != 1){
            System.out.println("사용법 : java com.example.chat2.ChatClient 닉네임");
            return;
        }
        String name = args[0];
        Socket socket = new Socket("127.0.0.1", 8888);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader keyboard = new BufferedReader(new)

        // 닉네임 전송
        pw.println(name);
        pw.flush();

        // 백그라운드로 서버가 보내준 메시지를 읽어들여서 화면을 출력한다.
        InputThread inputThread = new InputThread(br);
        inputThread.start();

        // 클라이언트는 읽어들인 메시지를 서버에게 전송한다.
    }
}

class InputThread extends Thread{
    BufferedReader br;
    public InputThread(BufferedReader br){
        this.br = br;
    }

    @Override
    public void run(){
        try {
            String line = null;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}