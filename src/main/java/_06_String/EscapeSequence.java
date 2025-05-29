package _06_String;

public class EscapeSequence {
    public static void main(String[] args) {
        // 툭수문자, 이스케이프 문자
        // \n, \t, \\, \",\'
        System.out.println("집에");
        System.out.println("너무");
        System.out.println("가고싶어요");

        System.out.println("집에\n너무\n가고싶어요");
        // \n은 줄바꿈 => new line
        // \t => tab
        // tab은 스페이스바 4칸 들여쓰기도 1탭 기준
        /*
            손흥민
            페이커
            방탄소년단
            블랙핑크
        * */
        System.out.println("\t손흥민");
        System.out.println("\t페이커");
        System.out.println("\t방탄소년단");
        System.out.println("\t블랙핑크");

        // \\
        // "C:\Program Files\java"
        // System.out.println("C:\Program Files\java"); 에러발생
        System.out.println("C:\\Program Files\\java");

        // \"
        // 손흥민의 팀은 "토트넘 홋스퍼 FC"이다.
        System.out.println("손흥민의 팀은 \"토트넘 홋스퍼 FC\"이다");

        // \'
        // 페이커는 '신'이다
        System.out.println("페이커는 '신'이다");
        //System.out.println("페이커는 \'신\'이다);

        char c = 'A';
        c ='\'';
        System.out.println(c);

        // 문제
        String id = "961224-1234567";
        // 출력을 961224-1
        System.out.println(id.substring(0, 8));
        System.out.println(id.substring(0,id.indexOf("-")+2)); //생각하지 못한 방법
        //System.out.println(id.substring(str.indexOf("movie"), str.indexOf("."))); 시도
    }
}
