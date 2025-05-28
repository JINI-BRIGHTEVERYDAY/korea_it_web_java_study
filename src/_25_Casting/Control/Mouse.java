package _25_Casting.Control;

public class Mouse implements Power{


    @Override
    public void on() {
        System.out.println("마우스의 전원을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("마우스의 전원을 끕니다.");
    }

    public void leftPointing() {
        System.out.println("마우스를 왼쪽으로 조작합니다.");
    }
}
