package org.example.Chat;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);

        while (true){
            Socket socket = serverSocket.accept(); // 클라이언트와 통신하기 위한 소켓

            ChatThread chatThread = new ChatThread(socket);
            chatThread.start();
        }

    }
}

class ChatThread extends Thread{

    private Socket socket;

    public ChatThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        // 1. socket으로 부터 읽어들일 수 있는 객체를 얻는다.

        // 2. socket에 쓰기 위한 객체를 얻는다.

        // 3. 클라이언트가 보낸 메시지를 읽는다.

        // 4. 접속된 모든 클라이언트에게 메시지를 보낸다.
    }
}