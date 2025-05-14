package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        //System.out.println("hello"); //문자열
        //System.out.println(123); //정수형
        //System.out.println("123"); //문자열

        // 정수형 - int, long -> 표현할 수 있는 범위가 다르다

        // 변수
        // 자료형 변수명 = 데이터;

        // 정수 - int, long
        int num = 123;
        int num1; // 데이터가 없는 상태, 초기화하지 않은 상태
        num1 = 234; // 초기화한 상태
        num1 = 456;

        System.out.println("num1은 " + num1);

        // long l = 1000000000000L; 가독성이 좋지 않음
        long l = 1_000_000_000_000L;
        //long l = 1000000000000; 에러

        System.out.println("l은 " + l);

        // 실수형 - float, double - float 7자리 double 14자리
        // float f = 3.14; 에러
        float f = 3.14f;
        double d = 3.14123456123456;

        // 문자 - char (문자 하나만 담기)
        char a = 'a'; //(""은 문자열을 의미함)
        char b = 'b';
        System.out.println("" + a + b);
        // 195
        // 아스키코드 숫자가 더해진 상태

        // 문자열 - String
        // 자료형이 아님

        String str = "안녕하세요";
        System.out.println(str);

        // 논리 자료형 -  boolean
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);

        /*
        * 제 이름은 *** 입니다. 제 나이는 ** 살이고
        * 취미는 *** 입니다.
        * 연습문제
        *
        * */

        String x = "진현";
        System.out.println("제 이름은 " + x + "입니다.");

        int y = 30;
        System.out.println("제 나이는 " + y + "살이고");

        String z = "독서";
        System.out.println("취미는 " + z + "입니다.");

        String mbti = "ISTJ";
        System.out.println("제 MBTI는 " + mbti + "입니다." );

        // System.out.println(); 줄바꿈
        // System.out.print(); 줄바꾸지않음



    }
}
