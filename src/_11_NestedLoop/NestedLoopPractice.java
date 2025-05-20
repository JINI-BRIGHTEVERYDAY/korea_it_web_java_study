package _11_NestedLoop;

// 별 삼각형 찍기
// *
// **
// ***
// ****
// *****

public class NestedLoopPractice {
    public static void main(String[] args) {
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
