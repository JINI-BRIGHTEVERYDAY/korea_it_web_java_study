package _14_Array;

import java.util.Arrays;
import java.util.Comparator;

public class Array03 {
    public static void main(String[] args) {
        Integer[] nums = {8, 4, 5, 1, 7, 10, 6, 2 , 9 ,3};

//        System.out.println(nums);
          System.out.println(Arrays.toString(nums));

          Arrays.sort(nums); // 오름차순 정렬 => 따로 대입을 하지 않았다
        // nums변수의 값을 값 자체를 정렬한 것

          System.out.println(Arrays.toString(nums));

          // 내림차순
        Arrays.sort(nums, Comparator.reverseOrder());
        // int는 원시적인 자료형 -> 숫자 연산만 가능 => primitive type
        // Integer -> 내장되어 있는 기능들
        // Integer는 클래스로 이루어져 있고, Wrapper Class

        // 같은 정수이지만, int는 계산만이 가능한 반면에,
        // Integer는 다양한 기능을 사용할 수 있다.
        // double - Double
        // float - Float
        // long - Long

    }
}
