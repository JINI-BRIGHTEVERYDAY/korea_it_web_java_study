package _22_Inheritance;

public class Main {
    public static void main(String[] args) {

    // 상속 - 기존 클래스(부모클래스)의 속성과 기능(메서드)을 새로운 클래스(자식 클래스)가 물려받는 것
    // 왜 상속을 해야 하나?
    // => 코드의 재사용성과 계층 구조설계를 가능하게 해주는 핵심적 개념
    // => 유지 보수 이점 즉 공통 기능이 한 곳(부모클래스)에 있으므로, 수정할 일이 생기면 부모클래스 하나만 고치면 자식클래스에도 반영된다
    // => 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다 (개방 폐쇄 원칙)

    // 자식클래스는 부모의 코드를 그대로 사용
    // 자식클래스는 부모의 코드를 그대로 사용하거나, 필요한 기능을 또 추가하거나
    // 부모의 코드(메소드) 변경 가능 => 오버라이딩


    // 지금부터 객체 생성

    Animal animal1 = new Animal();
    animal1.setAnimalName("고양이");
    animal1.setAnimalAge(3);
    animal1.move();

    Tiger tiger1 = new Tiger();
    tiger1.setAnimalName("호랭이");
        System.out.println(tiger1.getAnimalName());
        //getAnimalName이 tiger에 없지만, tiger는 Animal로부터 상속받았기 때문에 가능해진다

    tiger1.setAnimalAge(3);
        System.out.println(tiger1.getAnimalAge());

    tiger1.move();
    tiger1.hunt();
    tiger1.setIsstriped(true);

    // tiger에는 없는데 Animal에는 있음
    Tiger tiger2 = new Tiger("백호", 3, false);


    // Human에 대한 객체 생성

    Human human = new Human("JINI", 28);
        System.out.println(human.getAnimalName());
        System.out.println(human.getAnimalAge());
        human.move();
        human.read("불편한 편의점");




    }


}
