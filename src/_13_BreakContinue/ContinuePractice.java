package _13_BreakContinue;

public class ContinuePractice {
    public static void main(String[] args) {
        int waiting = 50;
        int max = 20;
        int sold = 0;
        int noShow = 12;

        for (int i = 1; i < waiting; i++) {
            System.out.println(i + "번째 손님 입장");

            if (i == noShow) {
                System.out.println(i + "번째 손님 노쇼");
                continue;
            }

            sold ++;
            if(sold == max) {
                System.out.println("재료 소진");
                break;
            }
        }
        System.out.println("식당 영업 끝");
    }
}
