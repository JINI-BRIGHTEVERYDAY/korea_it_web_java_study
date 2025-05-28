package _25_Casting.Control;

public class CentralControl {

    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) { // Computer , LED, Nouse... 다 받을 수 있는 매개변수는 Power
        // -> 암시적으로 업캐스팅

//        deviceArray[0] = device;

        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            return;
        }

        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");

    }

    public int checkEmpty() {
        // return 값으로 int 받음
        // for문으로 구현하기
        // 배열의 빈자리 인덱스 찾기

        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i; // 빈자리 찾았을 때
            }
        }

        return -1; // 다 차있을 때
        // 배열의 인덱스에서 보통 음수가 잘 없음
    }

    public void powerOn() {
        for (Power device : deviceArray) {
            if(device == null) {
                System.out.println("장치가 등록되어 있지 않은 슬롯입니다.");
                continue;
            }
            device.on();
        }
    }

//    public void powerOff() {
//        for (int i = 0; i < deviceArray.length; i++) {
//            if(deviceArray[i] == null) {
//
//            }
//        }
//    }

    public void performSpecificMethod() {
        for(Power device : deviceArray) {
            if (device instanceof Computer) {
                Computer computer = (Computer) device;
                Computer.Screening();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftPointing();
            } else if (device instanceof LEDlight) {
                LEDlight leDlight = (LEDlight) device;
                leDlight.lightControling();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.SpeakerControl();
            } else if (device instanceof Tv) {
                Tv tv = (Tv) device;
                tv.changeChannel();
            }


        }
    }

}
