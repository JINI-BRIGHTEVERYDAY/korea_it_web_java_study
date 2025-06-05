package _34_Exception;

import java.util.Scanner;

public class DividedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 두 개의 정수를 입력받습니다.
        System.out.println("두 수를 입력합니다.");
        System.out.print("첫 번째 수를 입력합니다 : ");
        int number1 = scanner.nextInt();
//        scanner.nextLine();

        System.out.print("두 번째 수를 입력합니다 : ");
        int number2 = scanner.nextInt();
//        scanner.nextLine();

        // 2. 첫 번째 수를 두 번째 수로 나눈 결과를 출력합니다.


        try {
            int result = number1 / number2;
            System.out.println("결과는 " + result + "입니다.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다 : " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료하였습니다.");
        }
    }
}
