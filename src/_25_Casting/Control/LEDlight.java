package _25_Casting.Control;

public class LEDlight implements Power{

    @Override
    public void on() {
        System.out.println("LED전원을 켭니다");
    }

    @Override
    public void off() {
        System.out.println("LED전원을 끕니다");
    }

    public void lightControling() {
        System.out.println("LED 조작합니다");
    }
}
