package org.example.IpSearch;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpSearch {
    public IpSearch() throws IOException {
    }

    public static void main(String[] args) {
        try {
            // 내 IP 주소 알아내기
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostAddress());

            // google IP 주소 알아내기
            InetAddress[] addresseArr = InetAddress.getAllByName("www.google.com"); // 하나의 도메인이 여러개의 IP로 설정할 수 있다.(여러개로 매핑하는 이유는 혹시 서버가 죽었을 경우를 대비하기 위해서이다.)
            for (InetAddress ia : addresseArr) {
                System.out.println(ia.getHostAddress());
            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}
