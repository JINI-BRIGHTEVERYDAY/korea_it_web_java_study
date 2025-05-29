package _25_casting.Animal;

//cat도 Animal로부터 상속받음
public class Cat extends Animal{

    // 부모클래스에 있는 speak 오버라이딩해서 받아옴
    @Override
    public void speak() {
        System.out.println("야옹");
    }

    // 고유메서드
    public void grooming() {
        System.out.println("고양이가 그루밍을 합니다.");
    }

}

