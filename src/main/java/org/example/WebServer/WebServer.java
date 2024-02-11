package org.example.WebServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws Exception{
        // 클라이언트가 접속할 때까지 대기할때 필요한 객체가 ServerSocket
        ServerSocket serverSocket = new ServerSocket(1000);
        System.out.println("1");
        try {
            while (true) {
                Socket clientSocket = serverSocket.accept(); // 대기한다. 클라이언트가 접속하면 클라이언트와 통신하는 Socket이 반환된다.
                System.out.println("2");

                ClientThread ct = new ClientThread(clientSocket);
                ct.start();
            }
        }finally {
            serverSocket.close();
        }
    }

}

class ClientThread extends Thread{
    private Socket clientSocket;
    public ClientThread(Socket clientSocket){
        this.clientSocket = clientSocket;
    }


    public void run(){
        try {
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(outputStream));

            // http://localhost:1000/hello
            // GET /hello HTTP/1.1
            String firstLine = br.readLine();
            String msg = "";
            if (firstLine.indexOf("/hello") >= 0)
                msg = "hi";
            else if (firstLine.indexOf("/hi") >= 0)
                msg = "hi";
            System.out.println(firstLine);

            String line = null;
            while (!(line = br.readLine()).equals("")) {
                System.out.println(line);
            }
            // 빈줄까지 읽어들이면 끝


            pw.println("HTTP/1.1 200 OK");
            pw.println("name:kim");
            pw.println("email:inhwna@naver.com");
            pw.println();
            pw.flush();

            // GET /hello HTTP/1.1 의 요청이 왔을때 /pf.png 대한 파일을 읽어서 출력한다.
            // /hello를 어디서 읽어들이느냐? 서버입장으로 봤을때 어디 경로에 있는 파일을 읽어들이는지?
            pw.println("<html>");
            pw.println(firstLine + "world!!");
            pw.println("</html>");

            pw.flush(); // 서버에게 전송
            br.close();
            pw.close();
            clientSocket.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
