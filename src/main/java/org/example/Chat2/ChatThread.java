package org.example.Chat2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ChatThread extends Thread{
    private String name;
    private BufferedReader br;
    private PrintWriter pw;
    private Socket socket;
    List<ChatThread> list;

    public ChatThread(Socket socket, List<ChatThread> list) throws Exception{
        this.socket = socket;
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.br = br;
        this.pw = pw;
        this.name = br.readLine();
        this.list = list;
        this.list.add(this);
    }
    @Override
    public void run() {
        // broadcast
        // ChatThread는 사용자가 보낸 메시지를 읽어들인다.
        // 접속된 모든 클라이언트에게 메시지를 보낸다.

        String line = null;
        try {
            while ((line = br.readLine()) != null){

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
