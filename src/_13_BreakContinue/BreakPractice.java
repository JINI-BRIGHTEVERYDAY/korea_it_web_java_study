package _13_BreakContinue;

public class BreakPractice {
    public static void main(String[] args) {

        // 톤쇼우 웨이팅 50명
        // 그러나 판매가능량은 10

        int waitng = 50;
        int max = 10;

        for (int i = 1; i < waitng; i++) {
            System.out.println(i + "번째 손님 입장");

            if (i == max) {
                System.out.println("재료 소진");
                break;
            }
        }
        System.out.println("오늘 영업 끝");
    }
}
