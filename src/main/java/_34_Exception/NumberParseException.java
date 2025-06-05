package _34_Exception;

//1. 사용자로부터 문자열 입력을 받습니다.
//2. 입력된 문자열을 Integer.parseInt()를 사용하여 정수로 변환합니다.
//3. 변환된 숫자를 출력합니다.
//4. 만약 변환되는 과정에서 입력값이 숫자가 아니라면 예외발생
// => 예외처리 후 "숫자가 아닌 값을 입력하셨습니다."
//5. 마지막엔 "프로그램 정상 종료"


import java.util.Scanner;

public class NumberParseException {
    // 1. 사용자로부터 문자열 입력을 받습니다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        String sample1 = scanner.nextLine();
        //2. 입력된 문자열을 Integer.parseInt()를 사용하여 정수로 변환합니다.

        try{
            int number = Integer.parseInt(sample1);
            System.out.println("입력한 숫자는 : " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력하였습니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }

    }
}

//        int sample2 = Integer.parseInt(sample1);
//        //3. 변환된 숫자를 출력합니다.
//        System.out.println(sample2);
//            //4. 만약 변환되는 과정에서 입력값이 숫자가 아니라면 예외발생
//            try {
//                sample2 =
//                System.out.println("정수 단위로 변환되었습니다.");
//            } catch (ArithmeticException e) {
//                System.out.println("숫자가 아닌 값을 입력하셨습니다.");
//            } finally {
//                System.out.println("프로그램 정상 종료");
//            }
//        }

