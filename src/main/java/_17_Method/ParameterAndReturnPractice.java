package _17_Method;

// 전달도 받고 반환도 받기

public class ParameterAndReturnPractice {
//    public static void power(int number) {
//        // 거듭제곱을 하는 메소드
//        // 매개변수를 전달받아서 해당 매개변수를 거듭제곱할 것
//        int result = number * number;
//        System.out.println(number + "의 2승은 " + result + "입니다.");
//    }

    public static int getPower(int number) {
//        int result = number * number;
//        return result;
        return number * number;
    }

//    public static void powerByExp(int number, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
//    }

    public static int getpowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    // 못 풀어낸 문제 -> 공부가 필요한 문제
    public static int getStrLength(String str) {
        int result = str.length();
        return result;
    }


    public static void main(String[] args) {
        int power = getPower(3);
        System.out.println(power);

        int powerByexp = getpowerByExp(2,4);
        System.out.println(powerByexp);

        // 문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력하는 메소드
        int strLength = getStrLength("안녕하세요 반갑습니다.");
        System.out.println(strLength);
    }





}
