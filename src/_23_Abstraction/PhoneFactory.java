package _23_Abstraction;

public class PhoneFactory extends Factory{
    // 추상클래스 상속받으면 반드시 재정의를 해야 한다
    /*


    *
    *     // 추상클래스의 추상메서드
    public abstract void produce(String model);
    // 이건 추상메서드
    // 원래라면 중괄호열고 구현을 해야 했지만, 여기서는 하지 않는다
    // 자식클래스가 구현을 할 것이므로

    public abstract void manage();
    // 자식클래스에서 오버라이드가 되어야 함

    // 추상클래스 => 추상 메서드가 하나라도 있으면
    *
    *
    이제 구현합시다
    */

    //name을 사용하는 것
    public PhoneFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[" + model +"] 스마트폰을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getName() + "스마트폰 공장을 관리합니다.");
    }


}
