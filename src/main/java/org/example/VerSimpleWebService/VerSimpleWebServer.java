package org.example.VerSimpleWebService;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class VerSimpleWebServer {
    public static void main(String[] args) throws IOException {
        // 8080 port로 대기한다.
        ServerSocket serversocket = new ServerSocket(8080);

        // 클라이언트를 대기한다.
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket을 반환한다.
        // 브라우저에서 http://127.0.0.1:8080/ 를 입력한다.
        System.out.println("클라이언트 접속을 기다린다.");
        Socket socket = serversocket.accept();

        System.out.println(socket.toString());

        serversocket.close();
        System.out.println("서버가 종료됩니다.");
    }
}
