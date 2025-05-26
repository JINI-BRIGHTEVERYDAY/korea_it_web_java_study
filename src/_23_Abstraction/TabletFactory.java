package _23_Abstraction;

// Factory라는 추상클래스 상속
// 생성자 만들어서 이름 바로 넣도록 함
// 재정의 다 해주고
// 고유 메소드 Upgrade(String model) 만들기 => "아이패드 7세대로 업그레이드 되었습니다."
// 메인에서 produce("아이패드 6세대")
// upgrade("아이패드 7세대")

public class TabletFactory extends Factory{
    @Override
    public void produce(String model) {
        super(name);
    }

    @Override
    public void manage() {
        System.out.println(getName() + "공장을 관리합니다.");
    }
}
