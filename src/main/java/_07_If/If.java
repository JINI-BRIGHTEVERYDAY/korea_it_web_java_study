package _07_If;

public class If {
    public static void main(String[] args) {
        // 조건문 if
        // 키가 120이상이어야 탑승 가능
        int height = 130;
//        if (조건) {
//            조건이 참일 때 실행되는 코드
//        }
        if (height >= 120) {
            System.out.println("탑승가능");
            System.out.println("탑승함");

            // 출력코드가 두 줄 이상이라면 중괄호를 포함해야 한다
        }

        // 키가 120 이상이고, 어른이 아니면 탑승가능
        boolean isAdult = false;
        if (height >= 120 && !isAdult) {
            System.out.println("탑승가능");
        }
        //if (height >= 120 && isAdult == false) {
        //System.out.println("탑승 가능");
        //}

        // 키가 120 이상이거나 어른이면 탑승가능
        boolean isAdult2 = true;
        if (height >= 120 | isAdult2) {
            System.out.println("탑승가능");

        }


    }

}