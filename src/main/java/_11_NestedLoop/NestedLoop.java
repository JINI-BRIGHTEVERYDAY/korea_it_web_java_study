package _11_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문
        // 네모 별 찍기

        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5; i++) { //세로줄
            for (int j = 0; j < 5; j++) { //가로줄
                System.out.print("*");
            }
            System.out.println(); //줄바꿈
        }

        System.out.println("-------------------------------");
        // 별 삼각형 찍기

        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        // 별 삼각형 거꾸로 찍기

        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 0; i < 5; i++) {
            //for (int j = 5; j < i-1; j--) { 오답
            //for (int j = 5; j < i; j--) { 오답
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        for (int i = 5; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        // SSSS* i = 0 j 4번 j < 4
        // SSS** i = 1 j 3번 j < 3
        // SS*** i = 2 j 2번
        // S**** i = 3 j 1번
        // ***** i = 4 j 0번

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("S");
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
