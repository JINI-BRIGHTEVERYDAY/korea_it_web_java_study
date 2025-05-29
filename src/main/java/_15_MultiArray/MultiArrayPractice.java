package _15_MultiArray;

public class MultiArrayPractice {
    public static void main(String[] args) {
        //첫 줄에 3칸, 두 번째 줄에 4칸, 세 번째 줄에 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[1][1]);
        System.out.println(seats2[0][2]);
    }
}
