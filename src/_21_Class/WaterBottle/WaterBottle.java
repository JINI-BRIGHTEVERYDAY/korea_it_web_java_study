package _21_Class.WaterBottle;

// 문제
// 패키지로 WaterBottle 만들고, WaterBottle클래스, WaterBottleMain클래스 만들기
// currentWater 현재 물의 양
// 메소드
// 물 채우기(fill) => 최대 용량인 1000을 넘을 수 없다.
// 물 마시기(drink) => 현재 물의 양보다 초과해서 마실 수 없다.
// getter를 통해서 현재 물병의 물의 양에 접근할 수 있다.

public class WaterBottle {
    private int currentWater;

    WaterBottle() {
        System.out.println("현재 물의 양은 " + currentWater + "입니다.");
    }

    // 물 채우기
//    public void fill(int amount) {
//        currentWater = 0;
//        if (amount >= 0 && amount <= 1000) {
//            currentWater += amount;
//            System.out.println("현재 물의 양에 " + amount + "만큼 채워졌습니다. 따라서, 현재 물의 양은 " + currentWater + "입니다.");
//        } else {
//            System.out.println("더할 수 없는 물의 양이거나, 최대 용량을 초과하여 물을 채울 수 없습니다. 현재 물의 양은 " + currentWater);
//        }
//    }

    // 위에는 틀리게 작성한 코드이므로 리뷰해야 함

    public void fill(int amount) {
        if (amount >= 0 && currentWater + amount <= 1000) {
            currentWater += amount;
            System.out.println("현재 물의 양에 " + amount + "만큼 채워졌습니다. 따라서, 현재 물의 양은 " + currentWater + "입니다.");
        } else {
            System.out.println("0이상의 물을 채우거나 물병의 양을 초과할 수 없습니다. 현재 물의 양: " + currentWater);
        }
    }


    // 물 마시기

    public void drink(int amount) {
        if (amount > 0 && currentWater >= amount) {
            currentWater -= amount;
            System.out.println("현재 물의 양에 " + amount + "만큼 비워졌습니다. 따라서, 현재 물의 양은 " + currentWater+ "입니다. " );
        }else{
            System.out.println("물의 양이 부족하여 물을 마실 수 없습니다. 현재 물의 양은 " + currentWater + "입니다");
        }
    }

    // getter 사용
    public int getCurrentWater() {
        return currentWater;
    }
}
