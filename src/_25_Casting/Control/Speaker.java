package _25_Casting.Control;

public class Speaker implements Power{

    @Override
    public void on() {
        System.out.println("스피커 전원을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("스피커 전원을 켭니다");
    }

    public void SpeakerControl() {
        System.out.println("스피커를 조작합니다.");
    }

}
