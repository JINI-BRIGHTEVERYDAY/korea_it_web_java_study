package _25_Casting.Animal;

// Animal에 상속받아야 함
public class Dog extends Animal{

    // 앞서 Animal에서 만들었던 speak를 오버라이드해서 불러옴
    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    // 고유메서드
    public void wagTail() {
        System.out.println("꼬리를 흔든다.");
    }
}
