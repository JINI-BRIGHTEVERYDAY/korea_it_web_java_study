package _31_Generic.WildCard.LowerBoundedWildCard;

public class SuperWildCard {
    //하한 경계 와일드카드 : Dog 또는 Dog의 상위 타입만 허용함
    public static void putDog(Box<? super Dog> box) {
        box.setItem(new Dog()); // 쓰기는 가능
        // Dog dog = box.getItem(); // 읽기는 안된다.

         Object obj = box.getItem(); // 읽을 수는 있으나, object로 반환처리 된다

        System.out.println("obj: " + obj);


    }
}
