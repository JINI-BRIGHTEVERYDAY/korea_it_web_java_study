package _22_Inheritance;

// Animal에게서 상속받음
// 부모생성자 호출하여 객체 생성과 동시에 속성값을 넣도록 생성자 만들고
// getter, setter
// getAnimalName => 제 이름은 ___ 입니다.
// getAnimalAge => 올해 제 이름은 __이고, 내년에는 __입니다.
// move => 사람이 두 발로 걷습니다.
// read(String bookName) => ___이 책이름을 읽습니다.

// Main에서 객체 생성하시고 다 써보세요

public class Human extends Animal{

    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }

    @Override
    public String getAnimalName() {
        return "제 이름은 " + super.getAnimalName() + "입니다."; // return으로 반환처리
//        System.out.println("제 이름은 " + getAnimalName() + "입니다");
    }

    public int getAnimalAge() {
        System.out.println("제 나이는 " + super.getAnimalAge() + "이고 내년에는 " + (super.getAnimalAge()+1) + "살 입니다.");
        return super.getAnimalAge(); // return으로 반환처리


    }

    @Override
    // 부모클래스에서 이미 정의됨
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");

    }

    // 새로 정의할 메소드

    public void read(String bookName) {
        System.out.println(super.getAnimalName() + "이 " + bookName + "을 읽습니다.");

    }


}
