package _23_Abstraction;

// abstract => 추상적인, 형태만 있는
// 틀은 있지만, 내용은 없는 클래스
// 이 기능은 꼭 있어야 함 근데 이 기능 구현은 자식클래스에서 함
// 객체는 만들 수 없다
// 왜 써야 하는가?
// 설계 일관성, 확장성 확보 => 공통된 구조를 가진 자식 클래스를 설계함
// 오류 방지 또는 강제 구현 => 추상 메서드를 구현하지 않으면 에러 발생할 것 (필수 기능을 구현 누락방지)
// 코드 재사용성 => 공통 메서드나 필드를 추상 클래스에 미리 작성 가능


public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    // 추상 클래스의 추상 메서드
    public abstract void produce(String model);
    public abstract void manage();

    // 추상 클래스 => 추상 메서드가 하나라도 있으면, 추상 클래스


    // getter setter 사용하기
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다. 공장 이름: " + name);
    }


}
