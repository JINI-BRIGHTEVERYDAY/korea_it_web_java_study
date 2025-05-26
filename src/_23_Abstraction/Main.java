package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플");
        phoneFactory.setName("애플");
        phoneFactory.produce("아이폰16");
        phoneFactory.manage();
        phoneFactory.displayInfo();

        Factory factory = new Factory("애플") {
            @Override
            public void produce(String model) {
                System.out.println(getName() + "잠깐 만들어진 익명클래스가 무언가를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println(getName() + "잠깐 만들어진 익명클래스가 공장을 관리합니다.");
            }
        };
        factory.manage();
        factory.produce("스마트폰");

        // 익명클래스 => 추상 클래스의 객체처럼 보이지만, 자식 클래스를 즉석에서 임시로 만들어서 객체로 만들어낸 것, 생성한 것
        // 재사용하지 않고 한 번만 쓰고 버릴 것이라면 익명클래스를 쓰는 것
        // 임시로 만들어진 이름없는 자식클래스 == 익명클래스
        // 그러므로 추상클래스의 객체가 만들어진 것이 아니기 때문에 추상클래스의 개념에 위배되는 것은 아니다
    }
}
