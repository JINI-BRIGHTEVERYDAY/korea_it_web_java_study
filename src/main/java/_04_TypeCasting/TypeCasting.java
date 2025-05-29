package _04_TypeCasting;

//  형변환

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수에서 실수로 변환하기
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt); //scoreInt를 실수로 변환하기
        System.out.println((double) scoreInt);
        System.out.println(scoreInt); // 형변환하더라도 초기의 int 형태로

        // 실수에서 정수로 변환하기
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat); // 소수점 이하부분은 버려지고 정수형태로 출력하기

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3; // 정수와 실수의 합 (double) 98
        System.out.println(sum1);

        //int sum2 = 98 + 55.3F; // 합이 실수형태인데 int이므로
        int sum2 = 98 + (int) 55.3F;
        System.out.println(sum2);

        int convertedScoreInt = (int) scoreDouble;
        System.out.println(convertedScoreInt);
        // int -> long -> float -> double (더 자세하게 표현이 가능함)

        // 왼쪽에서 오른쪽으로 갈 때는 형변환이 필요하지 않음
        // 오른쪽에서 왼쪽으로 갈 때는 형변환이 필요하다

        // double -> float -> long -> int (수동형변환)
        // int -> long -> float -> double (자동형변환)

        long convertedScoreDouble = scoreInt;
        System.out.println(convertedScoreDouble);

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);

        // 숫자에서 문자열로 형변환하기
        // 정수에서 문자열로

        String strNum1 = String.valueOf(55); // 첫번째 방법
        strNum1 = Integer.toString(55); // 두번째 방법
        System.out.println(strNum1); //숫자로 출력된듯보이지만 문자열로 출력된것이다

        // double에서 문자열

        String strNum2 = String.valueOf(88.37);
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        // float에서 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        // 문자열을 숫자로 "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);

        double d = Double.parseDouble("123.45");
        System.out.println(d);

        //i = Integer.parseInt("숫자"); 에러
        //System.out.println(i);

    }
}
