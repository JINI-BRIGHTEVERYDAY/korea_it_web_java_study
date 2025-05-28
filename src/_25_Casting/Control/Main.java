package _25_Casting.Control;

public class Main {
    public static void main(String[] args) {
        // Power 인터페이스
        // on(), off()
        // Tv 클래스, Computer, Speaker, LEDLight, Mouse, SmartPhone
        // 재정의하고 고유메서드 하나 -> 자유로 할 것

//        Power[] powers= {new Computer(), new Mouse(), new Tv()};
//        CentralControl centralControl = new CentralControl(powers);
        CentralControl centralControl1 = new CentralControl(new Power[5]);

        centralControl1.addDevice(new Computer());
        centralControl1.addDevice(new Tv());
        centralControl1.addDevice(new Mouse());
        centralControl1.addDevice(new Speaker());
        centralControl1.addDevice(new LEDlight());
        centralControl1.addDevice(new SmartPhone());

        centralControl1.powerOn();
//        centralControl1.powerOff();

        centralControl1.performSpecificMethod();

    }
}
