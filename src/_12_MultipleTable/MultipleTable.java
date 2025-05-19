package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        //1~9단까지 출력하시오
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i +" * "+ j + " = " + i * j);

            }
            System.out.println();
        }
    }
}
