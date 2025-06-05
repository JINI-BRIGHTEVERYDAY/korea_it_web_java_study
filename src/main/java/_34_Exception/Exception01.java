package _34_Exception;

// 오류
// 에러 (Error) - 시스템적 오류 (JVM이 감당 못함)
// Exception - 개발자가 처리 가능한 오류

// 예외 (Exception)
// - 프로그램 실행 중 발생할 수 있는 비정상적인 상황을 객체로 표현한 것

public class Exception01 {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 2;
//        int result = a / b;
//        System.out.println(result);

        //왜 예외처리를 해야하나
        //Java의 특성상 예외가 하나라도 발생한다면, 전체 컴파일이 실패한다
        //개발자에게 빨갛게 기분 나쁜 에러 메시지가 뜸
        //예외처리를 하였을 때 예외상황에 대한 적절한 대응이 가능함

        //예외처리의 방법
        // try - catch - finally 구문/ throws, throw 키워드
        // try {
        //   예외가 발생할 수 있는 코드
        // } catch (ExceptionType 클래스 e 변수,객체) {
        //    예외가 발생했을 때 처리할 코드
        // } finally {
        //    예외가 발생하던 말건 무조건 실행되는 코드
        // }

//        try {
//            int result = a / b;
//            System.out.println("결과 : " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다. : " + e.getMessage());
//        } finally {
//            System.out.println("프로그램 정상 종료");
//        }

        // 배열 인덱스 예외
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e ) {
            throw new RuntimeException(); // 트리거
            // 이미 정의된 예외 클래스를 이용해서 의도적으로 예외를 던지는 역할
            // 반드시 new 키워드를 통해서 예외 클래스의 객체를 생성해야 한다
            //System.out.println(e.getMessage());
        }
    }
}
