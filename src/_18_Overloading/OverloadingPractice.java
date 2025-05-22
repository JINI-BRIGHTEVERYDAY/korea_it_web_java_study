package _18_Overloading;

public class OverloadingPractice {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        int number = (int) doubleNum;
        return number * number;
    }

    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    // getPower이라는 세 개의 메소드가 오버로딩 되었다.
    // 각 메소드에 선언된 매개변수는 서로 타입이 다르다

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    }


    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 개 선언하기
        // 매개변수 (파라미터)의 타입이 달라야 한다 또는 갯수가 달라야 한다
        // Return 되는 자료형은 타입이 같아야 한다

        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2,4));


        // 문제
        // 메소드 이름은 printInfo()
        // 문자열 이름만 전달 -> 이름을 출력
        // 문자열 이름, 정수 나이 전달 -> 이름 나이 출력
        // 문자열 이름, 정수 나이, 문자열 이메일 -> 이름 나이 이메일 출력

        // 메소드 이름 add() => void
        // int와 int 덧셈
        // double과 double의 덧셈
        // 문자열숫자와 문자열숫자의 덧셈

    }

}
