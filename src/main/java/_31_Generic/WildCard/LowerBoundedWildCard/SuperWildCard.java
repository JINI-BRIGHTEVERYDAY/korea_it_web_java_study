package _31_Generic.WildCard.LowerBoundedWildCard;

public class SuperWildCard {
    // 하한 경계 와일드카드 : Dog 또는 Dog 상위 타입만을 허용한다
    public static void putDog(Box<? super Dog> box) {
        box.setItem(new Dog()); // 쓰기는 가능, 읽기는 안됨
//        Dog dog = box.getitem(); 읽기는 안됨

        Object odj = box.getItem(); // 읽을 수는 있으나 object로 반환될 것임

        System.out.println("obj: " + obj);


    }
}
