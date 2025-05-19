package _10_While;

public class While {
    public static void main(String[] args) {
        // 반복문 - while
        // 조건이 있는데, 참일 경우에 계속 반복한다
        // while(조건) {
        //      반복할 코드
        // }

        // for문 - 횟수 중심
        // while문 - 조건 중심

        // 1에서 5까지 출력

        int num = 1;
        while(num <= 5) {
            System.out.println(num);
            num ++;
            // 조건을 변화시키기 위한 증가 (필수)
        }

        System.out.println("---------------------------------");
        // 10에서 거꾸로 1까지

        num = 10;
        while (num >= 1) {
            System.out.println(num);
            num--;
        }

        System.out.println("---------------------------------");

        // 짝수만 출력 하기 (1~10)

//        num = 1;
//        while (num <= 10) {
//            if (num % 2 == 0) {
//                System.out.println(num);
//                num ++;
//            }
        // 비교 분석

//        int num = 1; 에러발생, int 없이 쓸 것

        System.out.println("---------------------------------");

        // 짝수만 출력 하기 (1~10)
        num = 1;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num ++;
        }

        System.out.println("---------------------------------");

        // 1부터 100까지의 누적합
        num = 1;
        int sum = 0;
        while (num <= 100) {
            sum += num;
            num ++;
        }
        System.out.println("합계는 " + sum);

        System.out.println("---------------------------------");
    }
}
