package _24_Interface;

public interface Press {
    // interface 인터페이스는 기능(메소드)의 명세(규칙, 약속)만 정의하는 틀과 같다
    // 모든 변수는 public static final(상수) 생략가능
    public static final String NAME = "button";

    // 객체 생성 불가능, 생성자가 없음
    // 기능 중심 설계를 하고 싶을 때
    // 여러 클래스에서 같은 행동(메서드)를 다르게 구현하고 싶을 때

    abstract void onPressed(); // 추상메소드인 상태, abstract는 생략되어있다

    // interface Up, Down 만들기
    // onUp, onDown 메소드 만들기


}
