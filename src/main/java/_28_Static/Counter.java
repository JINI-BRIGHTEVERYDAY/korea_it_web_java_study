package _28_Static;

public class Counter {
    public static int count = 0;

    public static void increase() {

        count++;
    }

    public static void main(String[] args) {
        increase();
        increase();
        increase();
        System.out.println(count);
    }

    // static으로 되었으므로 객체를 생성하지 않음
}
