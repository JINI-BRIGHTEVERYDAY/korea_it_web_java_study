package _24_Interface;

// extends => 단일 상속 (클래스, 추상클래스)
// implements => 다중 상속 (인터페이스)

public abstract class Button implements Press, Up, Down {

    @Override
    public void onUp() {

    }

    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed(); // 무조건 재정의 해야한다

}
