package _06_String;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        System.out.println(str.replace(" and", ",")); // 특정 문자열을 다른 문자열로 대체함
        // 실행 결과 : I like music, movie, travel.

        System.out.println(str.substring(7)); // 인덱스 기준 7부터 출력함
        // 실행 결과 : music and movie and travel.

        System.out.println(str.substring(7, 12)); // 인덱스 기준 7부터 11까지, 마지막 끝지점은 본인 포함하지 않는다
        System.out.println(str.indexOf("movie"));

        System.out.println(str.substring(str.indexOf("movie"), str.indexOf("."))); // 마지막이 . 이므로 .은 출력되지 않는다

        str = "    I want to go home      ";
        System.out.println(str.trim()); // 문자열 앞뒤 공백을 제거함

        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1 + s2); // 기존 방법
        System.out.println(s1.concat(s2)); // 해당 문자열 뒤에 다른 문자열을 이어붙이는 방법
        System.out.println(s1 + " " + s2); //  공백을 두는 기존 방법
        System.out.println(s1.concat(" ").concat(s2)); // 공백을 두는 concat

    }
}
