package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
        //변수명 짓는 법
        /*
        * 1. 저장되는 데이터에 어울리는 이름으로 할 것, 직관적이고 한 눈에 파악하기 쉬운 이름으로 해야 함
        * 2. 밑줄(_), 문자, 숫자, 사용 가능 (단, 숫자는 맨 앞에 올 수 없다)
        * 3. 한 단어 또는 2개 이상의 단어를 연속하여
        * 4. 소문자로 시작하고, 두번째 단어부터는 시작글자를 대문자로
        * 파스칼 표기법 (쌍봉낙하 표기법) => LastName => 클래스명, 파일명
        * 카멜 표기법 (단봉낙하 표기법) => lastName => 변수명, 메소드명
        * 5. 예약어 사용불가(public, static, void, int, float...)
        *
        * */

        // boolean
        // is, flag으로 처음 시작하는 것이 일반적임

        String carBrandName = "KIA";
        String carModelName = "EV6";
        String carColor = "White";
        int carPassengerCapacity = 5;
        int carModelYear = 2025;

        // 상수 절대 변하지 않는 데이터 => 상수명 다 대문자
        final String COUNTRY_CODE = "KR"; // final이 추가되면 상수가 된다

        // 상수명에는 단어와 단어 사이에는 _로 구분하기
        // COUNTRY_CODE = "US" 에러 출력


    }
}
