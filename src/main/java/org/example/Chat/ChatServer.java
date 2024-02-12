package org.example.Chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        // 공유객체에서 쓰레드에 안전한 리스트를 만든다.
        List<PrintWriter> outList = Collections.synchronizedList(new ArrayList<>());
        while (true){
            Socket socket = serverSocket.accept(); // 클라이언트와 통신하기 위한 소켓
            System.out.println("접속 : " + socket);
            ChatThread chatThread = new ChatThread(socket, outList);
            chatThread.start();
        }

    }
}

class ChatThread extends Thread{
    private Socket socket;
    private List<PrintWriter> outlist;
    private PrintWriter out;
    private BufferedReader in;
    public ChatThread(Socket socket, List<PrintWriter> outlist){
        this.socket = socket;
        this.outlist = outlist;

        // 1. socket으로 부터 읽어들일 수 있는 객체를 얻는다.
        // 2. socket에 쓰기 위한 객체를 얻는다. (현재 연결된 클라이언트에게 쓰는 객체)
        try {
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outlist.add(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void run(){
        // 3. 클라이언트가 보낸 메시지를 읽는다.
        // 4. 접속된 모든 클라이언트에게 메시지를 보낸다. (현재 접속된 모든 클라이언트에게 쓸 수 있는 객체가 필요하다.)
        String line = null;
        try {
            while ((line = in.readLine())!= null){
                for(int i = 0; i< outlist.size(); i++){
                    PrintWriter ow = outlist.get(i);
                    ow.flush();
                    ow.println(line);
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally { // 접속이 끊어질때
            try {
                outlist.remove(out);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}