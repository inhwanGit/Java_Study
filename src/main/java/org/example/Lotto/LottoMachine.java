package org.example.Lotto;

/*
1. 1~45까지 써있는 Ball을 로또 기계에 넣는다.
2. 로또 기게에 있는 Ball들을 섞는다.
3. 섞인 Ball중에서 6개를 꺼낸다.
*/
public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;
    public void setBall(Ball[] balls); // Ball[] Ball이 여러개를 받겠다. 45개를 받는다.
    public void mix(); // 자기가 가지고 있는 Ball들을 섞는다.
    public Ball[] getBalls(); // 6개의 Ball을 반환한다.
}
