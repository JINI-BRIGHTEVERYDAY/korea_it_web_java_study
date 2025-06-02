package _31_Generic.WildCard.UpperBoundedWildCard;

public class ExtensWildCard {
    // <? extends Animal>
    // Dog, Cat, Animal 등 Animal을 상속한 모든 타입을 받을 수 있다.
    // 상한 경계 와일드카드 (상위클래스 제한하기)
    // 읽기만 허용된다. 쓰는 것은 허용되지 않는다
    // 반환타입은 Animal로 취급된다
    // Animal 또는 Animal을 상속한 타입만 받겠다
    public static void makeSound(Box<? extends Animal> box) {
        Animal animal = box.getItem();
        animal.sound();

//        box.setItem(new Dog());
        // 이유? Box<? extends Animal>은 정확한 타입이 뭔지 몰라서 쓰기를 제한한다
    }
}
