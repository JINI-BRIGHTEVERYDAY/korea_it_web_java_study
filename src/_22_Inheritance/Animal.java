package _22_Inheritance;

/*
* 1. 먼저 객체 속성을 먼저 정의하기
* 2. 생성자 만들기
* 3. getter, setter
* 4. move에 대한 메소드 정의
*
* */

public class Animal {
    // 필드(멤버변수) == 객체 속성
    private String animalName;
    private int animalAge;



    // 생성자

    // 1. 기본 생성자
    public Animal() {
    }

    // 2. 동물 이름
    public Animal(String animalName) {

        this.animalName = animalName;
    }

    // 3. 동물 나이
    public Animal(int animalAge) {

        this.animalAge = animalAge;
    }

    // 4. 동물 이름과 나이 모두 출력하기
    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }



    // getter
    public String getAnimalName() {

        return animalName;
    }

    public int getAnimalAge() {

        return animalAge;
    }



    // setter

    public void setAnimalName(String animalName) {

        this.animalName = animalName;
    }

    public void setAnimalAge(int animalAge) {

        this.animalAge = animalAge;
    }

    // 메소드 이름 move, 움직입니다 호출하기

    public void move() {

        System.out.println("움직입니다.");
    }

}