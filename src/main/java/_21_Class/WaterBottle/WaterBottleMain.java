package _21_Class.WaterBottle;

public class WaterBottleMain {
    public static void main(String[] args) {
        WaterBottle waterBottle = new WaterBottle();

        waterBottle.fill(500);
//        waterBottle.fill(-1000);

        waterBottle.drink(200);
        waterBottle.fill(800);

        waterBottle.drink(1200);

        // return값 출력하기
        System.out.println("현재 물의 양은 " + waterBottle.getCurrentWater() + "입니다.");
    }
}
