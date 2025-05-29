package _25_casting.Control;

public class CentralControl {

    // Power 배열형태로 구현해야 함
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {
        // 매개 변수를 무엇을 써야할지? -> Tv, SmartPhone... 다 받을 수 있는 것은?
        // Power
        // -> 암시적으로 업캐스팅함

        //deviceArray[0] = device;
        //-> 이렇게 쓰면? 계속 0번째에만 들어가게됨
        //인덱스가 0인 곳에만 계속 넣게 된다
        //첫 번째 문제는 여기에 있음

        //for문 돌리면 ? -> for문 돌리는 것도 일임

        int emptyIndex = checkEmpty();

        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 추가할 수 없습니다.");
            return;
        }

        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + "장치가 연결되었습니다.");

        // 왜 device.getClass().getSimpleName()인지?

    }

    // return 값으로 index값을 받아올것

    // deviceArray[0] = device;
    // 0부터 4까지 index가 확인하여 device가 있는지 없는지 볼 것임
    // 없으면 없는 인덱스에다가 device를 넣게끔 해야한다
    // 그렇게 하기 위해서는 index를 하나씩 확인해봐야 하는 것

    public int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                return i; // 빈자리 찾았을 경우
            }
        }

        return -1;

        // 다 차 있는 경우
        // 배열 index에서는 보통 음수가 잘 없다
    }

    public void powerOn() {
        for(Power device : deviceArray) {
            // device에 해당되는 것들이 모두 Power에 상속되어있음
            if (device == null) {
                System.out.println("장치가 등록되어 있지 않은 슬롯입니다.");
                continue;
            }

            device.on();

        }
    }
    
    public void PowerOff() {
        // 일반 for문
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("장치가 등록되어 있지 않은 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }

    public void performSpecificMethod() {
        for(Power device : deviceArray)  {
            // 만약에 Tv가 들어왔는데 컴퓨터가 아니라면? 캐스팅 오류가 날 것
             if(device instanceof Computer) {
                 Computer computer = (Computer) device;
                 computer.compute();
             } else if (device instanceof Mouse) {
                 Mouse mouse = (Mouse) device;
                 mouse.leftClick();
             } else if (device instanceof LEDLight) {
                 LEDLight ledLight = (LEDLight) device;
                 ledLight.changeColor();
             } else if (device instanceof Tv) {
                 Tv tv = (Tv) device;
                 tv.changeChannel();
             } else if (device instanceof Speaker) {
                 Speaker speaker = (Speaker) device;
                 speaker.controlVolume();
             } else if (device instanceof SmartPhone) {
                 SmartPhone smartPhone = (SmartPhone) device;
                 smartPhone.sendKakaoTalk();
             }

             // 각각 다 자료형이 다르므로 각각 다운 캐스팅함
        }
    }






}
