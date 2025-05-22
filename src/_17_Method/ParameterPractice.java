package _17_Method;

public class ParameterPractice {
    public static void power(int number) {
        // 거듭제곱을 하는 메소드
        // 매개변수를 전달받아서 해당 매개변수를 거듭제곱할 것
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }

    public static void getAvg(int a,int b,int c) {
        int result = (a + b + c) / 3 ;
        System.out.println("세 개의 정수의 합의 평균은 " + result + "입니다.");
    }

    public static void isEven(int x) {
        String result2 = (x % 2 == 0) ? "짝수" : "홀수"; // ( ) 조건을 물어보고 -> ? 그리고 맞으면 x 틀리면 y
        System.out.println(result2);
    }

    public static void main(String[] args) {
        // Parameter
        // 매개변수, 전달값

        int num = 4;
       power(num);

      powerByExp(2, 4);

        getAvg(80,90,100);

        isEven(2);
    }

    // 세 개의 정수를 전달하여 평균을 출력하는 메소드
    // getAvg(80,90,100)

    // 정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
    // 단, 삼항연산자를 쓸 것
    // isEven(2);
}
