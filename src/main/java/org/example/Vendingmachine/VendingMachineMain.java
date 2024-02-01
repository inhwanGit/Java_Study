package org.example.Vendingmachine;

public class VendingMachineMain {

    public static void main(String[] args) {

        VendingMachine machine = new VendingMachine();
        String product = machine.pushProductButton(100);
        System.out.println(product);

        VendingMachine.printVersion(); //static한 메소드는 클래스 명 다음에 사용하기 앞에와 같이(프로그래머 간의 관례)
        // VendingMachine.pushProductButton(100); // static 메서드 'pushProductButton(int)'은(는) static 컨텍스트에서 참조할 수 없습니다 error 발생
    }
}
