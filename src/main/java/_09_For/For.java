package _09_For;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        // for (선언 ; 조건; 증감) {
        //   반복될 코드들
        // }

        for (int i = 0; i < 10; i++){
            System.out.println("안녕 " + i);
        }

        for (int i = 0; i < 50; i++) {
            System.out.println("ㅎㅇ");
        }

//         짝수만 출력하도록 함
//         1부터 10까지 출력하는데, 짝수만 출력하도록 함
//         첫 번째 방법, 근데 이제 if문을 곁들임

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("--------------------------------");

        // 두 번째 방법

        for (int i = 2; i <= 10 ; i += 2) {
            System.out.println(i);
        }

        // for (int i = 2; 0 < i <= 10; i += 2) 에러

        System.out.println("--------------------------------");
        // 10부터 1까지 거꾸로 출력하기

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("--------------------------------");
        // 연습문제
        // 1~100까지 다 더한 값을 출력하세요

//
//        for (int i = 1; i <= 100 ; i++) {
//            int sum = 0;
//            sum += i;
//            System.out.println(sum);
//        }
//          에러발생

        System.out.println("--------------------------------");

        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
