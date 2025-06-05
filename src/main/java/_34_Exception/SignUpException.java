package _34_Exception;


class SignUpFailedException extends Exception {
    public SignUpFailedException(String message) { //2번째
        super(message);
        System.out.println("회원가입에 문제가 생겼습니다.");  //3번째
    }
}


public class Exception03 {
    public static void login(String name, int age) throws SignUpFailedException {
        String name1 = "홍길동";
        int age1 = 12;

        if (age < 14) {
            throw new SignUpFailedException("회원가입 할 수 없습니다."); // 1번째
        }
    }
}


    public static void main(String[] args) {
        String name2 = "홍길동";
        int age2 = 12;

        // 회원가입하는 로직
        // try - catch - finally

        try {
            login(name2, age2);
        }catch (SignUpFailedException e) { // 5번째, 예외가 터진 것
            System.out.println("회원가입의 실패: " + e.getMessage()); // 6번째, 최종적으로
        }finally {
            System.out.println("프로그램 정상 종료");

        }
    }
}
