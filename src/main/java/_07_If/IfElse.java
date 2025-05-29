package _07_If;

public class IfElse {
    public static void main(String[] args) {
        // else 조건이 참이 아니라면, 거짓이라면 실행되는 코드블럭

        // 키가 120 이어야 탑승 가능
        int height = 120;
        if (height >= 120) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
    }
}
