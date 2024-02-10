package org.example.VerSimpleWebService;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class VerSimpleWebServer {
    public static void main(String[] args) throws IOException {
        // 8080 port로 대기한다.
        ServerSocket serversocket = new ServerSocket(8080);

        // 클라이언트를 대기한다.
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket을 반환한다.
        // 브라우저에서 http://127.0.0.1:8080/ 를 입력한다.
        // 2번째 http://127.0.0.1:8080/board/hello.html
        System.out.println("클라이언트 접속을 기다린다.");
        Socket socket = serversocket.accept();

        // Client와 읽고 쓸수 있는 InputStream, OutputStream 반환한다.
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String firstLine = br.readLine();
        List<String> headrs = new ArrayList<>();
        String line = null;
        // 빈줄을 만나면 while문을 끝낸다.
        while (!((line = br.readLine()).equals(""))){
            headrs.add(line);
        }
        // 요청정보 읽기 끝.
        System.out.println(firstLine);
        for(int i = 0; i<headrs.size(); i++){
            System.out.println(headrs.get(i));
        }

        //서버에게 응답메시지 보내기
        // HTTP/1.1 200 OK <-- 상태메세지
        // 헤더 1
        // 헤더 2
        // 빈줄
        // 내용
        pw.println("HTTP/1.1 200 OK");
        pw.println("name : kim");
        pw.println("email : inhwan@www.naver.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>hello!!</h1>");
        pw.println("</html>");
        pw.close();

        // HTTP 프로토콜은 클라이언트가 정보를 서버에게 보내준다. (요청정보)
//        byte[] buffer = new byte[512];
//        int readCount = 0;
//
//        while ((readCount = in.read(buffer)) != -1){//-1은 EOF(End of File)
//            System.out.write(buffer, 0, readCount); //write는 바이트 배열을 출력할 수 있다.
//        }


        serversocket.close();
        System.out.println("서버가 종료됩니다.");
    }
}
