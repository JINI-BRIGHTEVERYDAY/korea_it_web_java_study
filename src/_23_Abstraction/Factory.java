package _23_Abstraction;

// abstract => 추상적인 , 형태만 있는
// 틀은 있지만, 내용은 없는 클래스
// 이 기능은 꼭 있어야 해, 근데 이 기능 구현은 자식클래스에서 하는 거야
// 객체를 만들 수가 없다
// 왜 써야 하나? 설계 일관성과 확장성을 확보하여 공통된 구조를 가진 자식 클래스를 설계한다
// 오류 방지한다 / 강제 구현하기 => 추상 클래스를 구현하지 않으면 에러가 발생한다 (필수 기능 구현 누락방지함)
// 코드 재사용성 => 공통 메소드나 필드를 추상 크래스에서 미리 작성가능함


// 추상메서드를 쓸 것이면 추상클래스가 되어야 한다
public abstract class Factory {
    private String name; //멤버변수

    // 생성자 만들어준 것
    public Factory(String name) {
        this.name = name;
    }

    // 추상클래스의 추상메서드
    public abstract void produce(String model);
    // 이건 추상메서드
    // 원래라면 중괄호열고 구현을 해야 했지만, 여기서는 하지 않는다
    // 자식클래스가 구현을 할 것이므로

    public abstract void manage();
    // 자식클래스에서 오버라이드가 되어야 함

    // 추상클래스 => 추상 메서드가 하나라도 있으면


    //getter, setter

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    // 그 이외의 일반메소드 -> 추상메서드는 아님, 그러므로 필수로 구현을 자식클래스에서 해야하는 건 아님

    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다. 공장이름은 " + name);
    }


}
