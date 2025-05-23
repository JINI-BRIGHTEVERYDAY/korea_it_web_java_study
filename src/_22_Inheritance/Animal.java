package _22_Inheritance;

public class Animal {
    // 필드(매개변수) == 객체 속성
    private String animalName;
    private int animalAge;

    // 생성자


    public Animal() {
    }

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public Animal(String animalName, int animalAge) {
        this.animalName = animalName;
        this.animalAge = animalAge;
    }


    // getter
    public  String getAnimalName() {
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