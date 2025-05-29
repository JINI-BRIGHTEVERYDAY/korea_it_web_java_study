package _16_MultiArrayLoop;

// 다차원 배열 합 구하기
// 3 * 3 크기 1부터 홀수만 차례대로 대입하고 출력해서 확인 먼저
// 그 수들의 합을 구하기


public class MultiArrayLoopPractice {
    public static void main(String[] args) {

        int[][] array = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };

        int sum = 0;

        System.out.println("배열 출력:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sum += array[i][j];  // 동시에 합계 계산
            }
            System.out.println();
        }
        System.out.println("3*3 배열의 모든 요소의 합: " + sum);
    }

}
