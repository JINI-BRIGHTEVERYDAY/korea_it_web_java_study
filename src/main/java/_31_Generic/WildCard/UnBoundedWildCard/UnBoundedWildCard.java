package _31_Generic.WildCard.UnBoundedWildCard;

public class UnBoundedWildCard {
    //? => 타입에 제한이 없다 (비한정적 와일드 카드)
    //하지만 읽기만 가능, 쓰기는 불가능함
    //왜냐하면 타입이 명확하지 않기 때문
    public static void printBox(Box<?> box) {
        //box.setItem(); 불가능하다
        System.out.println("Box 내용물: " + box.getItem());
    }

}
