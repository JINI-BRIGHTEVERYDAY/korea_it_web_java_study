package _18_Overloading;

// 메소드 이름 add() => void
// int와 int 덧셈
// double과 double의 덧셈
// 문자열숫자와 문자열숫자의 덧셈

public class OverLoadingExample2 {

    public static void add(int x, int y) {
        int result = x + y;
        System.out.println("두 정수의 합은 "+ result + "입니다.");
    }

    public static void add(double x, double y) {
        double result = x + y;
        System.out.println("두 실수의 합은 " + result + "입니다");
    }

    public static void add(String x, String y) {

        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        double result = a + b;
        System.out.println("두 문자열의 합은 " + result + " 입니다.");
    }

    public static void main(String[] args) {
        add(3,5);
        add(2.8,4.7);
        add("3.5","2.2");
    }
}
