package org.example.WebServer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception{
        // 클라이언트가 접속할 때까지 대기할때 필요한 객체가 ServerSocket
        ServerSocket serverSocket = new ServerSocket(1000);
        System.out.println("1");
        Socket clientSocket = serverSocket.accept(); // 대기한다. 클라이언트가 접속하면 클라이언트와 통신하는 Socket이 반환된다.
        System.out.println("2");

        InputStream inputStream = clientSocket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

        // http://localhost:1000/hello
        // GET /hello HTTP/1.1
        System.out.println(br.readLine());
    }
}
