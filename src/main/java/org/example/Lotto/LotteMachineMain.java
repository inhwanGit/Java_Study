package org.example.Lotto;

public class LotteMachineMain {
    public static void main(String[] args) {

        // 변수가 45개 필요하다. Ball인스턴스를 45개 참조할 수 있는 배열이 만들어진다.
        Ball[] balls = new Ball[45];
        for(int i = 0; i < 45; i++){
            balls[i] = new Ball(i+1);
        }
        // LottoMachine인스턴스가 생성된다.
        LottoMachine lottoMachine = new LotteMachineImpl();
        lottoMachine.setBall(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].getNumber());
        }
    }
}
