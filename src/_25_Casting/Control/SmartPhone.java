package _25_Casting.Control;

public class SmartPhone implements Power{

    @Override
    public void off() {
        System.out.println("스마트폰의 전원을 끕니다.");
    }

    @Override
    public void on() {
        System.out.println("스마트폰의 전원을 켭니다.");
    }

    public void sendKakaoTalk() {
        System.out.println("스마트폰으로 카카오톡을 보냅니다");
    }
}
