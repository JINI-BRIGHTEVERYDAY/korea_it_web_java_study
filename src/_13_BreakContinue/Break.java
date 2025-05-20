package _13_BreakContinue;

public class Break {
    public static void main(String[] args) {
        // 반복문 - break와 continue
        // break - 특정 상황(조건)에서 반복문을 빠져나오게끔 하는
        // 톤쇼우 웨이팅 50명 대기
        // 판매 가능한 갯수 10개

        int wating = 50;
        int max = 10;
        for (int i = 1; i < wating; i++) { // 가게 운영중
            System.out.println(i + "번 손님 입장");
            if (i == max) {
                System.out.println("재료 소진");
                break; // 11번 입장 손님부터는 입장이 불가능
            }
        }
        System.out.println("영업 종료");

        System.out.println("--------------------------------------");

        // while문으로 구현하기

        int nowNum = 1;
        while(nowNum <= wating) {
            System.out.println(nowNum + "번 손님 입장");
            if (nowNum == max){
                System.out.println("재료 소진");
                break;
            }
            nowNum++;
        }
        System.out.println("영업종료");
    }
}
