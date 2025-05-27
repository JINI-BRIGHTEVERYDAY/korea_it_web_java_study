package _21_Class.Car;
/*
* public class Car {
// 자동차에 대한 정의 (속성이 필요) -> 자동차에 대한 정보
    String carName;
    int carYearModel;
    String carColor;

    // 생성자 -> Main에서 만들 빈껍데기를 여기서 미리 만든다
    Car() { // 기본생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor");

    }

    Car(String carName) {
        System.out.println("carName의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsConstructor");
        this.carName = carName;
    }

    // 자동차의 기능 설명, 메소드로 구현
    public void startCar() {
        System.out.println(carName + "이 시동을 겁니다. " );
    }

    public void drive() {
        System.out.println(carName + "이 전진합니다. ");
    }

    public void stop() {
        System.out.println(carName + "이 정지합니다.");
    }
}
*
* 여기까지 우선적으로 완료
* */


public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car();
        // Car class에서 생성자를 만들어놓은 것에 대한 출력값
        // Car1에서 생성자는 아무런 매개변수 값을 사용하지 않았다

        Car car2 = new Car("아반떼");
        // Car2는 carName만을 사용하기로 약속했다

        Car car3 = new Car("싼타페", 2025, "white");
        // Car3는 모든 값을 다 받기로 약속했다

        // 추상화
        car3.startCar();
        car3.drive();

    }
}
