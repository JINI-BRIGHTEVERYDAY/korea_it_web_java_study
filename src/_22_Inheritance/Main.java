package _22_Inheritance;

public class Main {


    public static void main(String[] args) {
        // 상속 - 기존 클래스 (부모클래스)의 속성과 기능(메서드)을 새롤운 클래스(자식 클래스)가 물려받는 것
        // => 코드의 재사용성과 계층 구조 설계를 가능하게 하는 핵심 개념
        // => 유지 보수 즉 공통 기능이 한 곳 (부모클래스)에 있으므로, 수정할 일이 생기면 부모클래스 하나만 고치면 자식클래스에도 반영된다
        // 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다. (개방 폐쇄 원칙)
        // 개방폐쇄 원칙이 무엇이냐? : 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다

        // 자식클래스는 부모의 코드를 그대로 사용하게 된다
        // 자식클래스는 부모의 코드를 그대로 사용하거나, 필요한 기능을 또 추가하거나,
        // 부모의 코드(메소드) 변경 가능 => 오버라이딩
        // 오버로딩 vs 오버라이딩

        // 클래스 새로 정의하기
        Animal animal1 = new Animal();

        // setter로 값 대입하기
        animal1.setAnimalName("고양이");
        animal1.setAnimalAge(3);

        //move에 대한 메소드 호출하기
        animal1.move();
        // animal1.setStriped(); 불가능


        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랭이");
        System.out.println(tiger1.getAnimalName());
        tiger1.setAnimalAge(3);
        System.out.println(tiger1.getAnimalAge());
        tiger1.move();
        tiger1.hunt();
        tiger1.setStriped(true);

        tiger2 = new Tiger("백호", 3, false);



        //속성이 정해져있지 않음

    }
}
