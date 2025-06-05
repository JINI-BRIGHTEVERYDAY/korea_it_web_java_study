package _34_Exception;

import lombok.extern.java.Log;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) { //2번째
        super(message);
        System.out.println("예외가 발생하였습니다.");  //3번째
    }
}


public class Exception02 {
    public static void login(String id, String pw) throws LoginFailedException{ //4번째
        String correctId = "admin";
        String correctPw = "1q2w3e4r";

        if(!id.equals(correctId) || !pw.equals(correctPw)) {
            // 예외 발생
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다."); // 1번째
        }
    }


    public static void main(String[] args) {
        String inputId = "admin";
        String inputPw = "1234qwer";

        try {
            login(inputId,inputPw);
        }catch (LoginFailedException e) { // 5번째, 예외가 터진 것
            System.out.println("로그인 실패: " + e.getMessage()); // 6번째, 최종적으로
        }finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}


