package _21_Class.Car;

/*
* 1. Car class와 CarMain class 생성
* 2. 자동차에 대한 정의 (속성 필요) -> 자동차에 대한 정보로 입력
* (이건 어디? public clas car에서 : String carName, int carYearModel...)
*
* 3. 자동차의 기능 구현, 메소드로 구현하기
* (public void startcar()...)
*
*
* (추가) 4. 생성자! 정의하기
* 객체를 생성할 때 newCar할 때 바로 값을 넣음
*
* */

public class Car {
// 자동차에 대한 정의 (속성이 필요) -> 자동차에 대한 정보
    String carName;
    int carYearModel;
    String carColor;

    // 생성자
    Car() { // 기본생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor");

    }

    Car(String carName) {
        System.out.println("carName의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsConstructor");
        this.carName = carName;
    }

    /*
    * this에 대한 보충설명
    * this 해당 클래스로 만들어진 객체 의미
    * this 왜 씀 -> 속성의 이름과 매개변수의 이름이 같을 때 명확히 하기 위해서
    *
    * */

    Car(String carName, int carYearModel, String carColor) {
        System.out.println("모든 속성값이 부여된 자동차");
        System.out.println("AllArgsContructor");
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
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
