package _16_MultiArrayLoop;

// 다차원 배열 합 구하기
// 3*3 크기 1부터 홀수만 차례대로 대입하고 출력해서 확인하기
// 그 수들의 합을 구하기

public class MultiArrayLoopPractice2 {
    public static void main(String[] args) {
        int[][] arr = new int [3][3];
        int num = 1;

        // 홀수만 다 대입하기
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num += 2;
            }
        }

        // 출력 확인
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

        }
        System.out.println("합계는 " + sum);
    }
}
