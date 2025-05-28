package _25_Casting.Control;

public class Computer implements Power{


    @Override
    public void on() {
        System.out.println("컴퓨터 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터 전원을 끕니다.");
    }

    public void Screening() {
        System.out.println("컴퓨터 모니터링을 합니다.");
    }
}
