package org.example.fw;
/*
Controller의 종류가 여러개라면?
초기화 - 같은 코드
실행 - 다른 코드
마무리 - 같은 코드
*/
public abstract class Controller {
    // protected는 같는 package이거나 상속받았을 경우에만 접근 가능하다.
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }
    // 메소드의 final는 메소드의 오버라이딩을 막기 위해서 사용한다.
    protected final void close(){
        System.out.println("마무리 하는 코드");
    }
    protected abstract void run(); // 매번 다른 코드

    // 내가 가지고 있는 메소드를 호출한다.
    // 어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init(); //this 생략 가능
        this.run();
        this.close();
    }
}
