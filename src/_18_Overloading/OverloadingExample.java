package _18_Overloading;

// 문제
// 메소드 이름은 printInfo()
// 문자열 이름만 전달 -> 이름을 출력
// 문자열 이름, 정수 나이 전달 -> 이름 나이 출력
// 문자열 이름, 정수 나이, 문자열 이메일 -> 이름 나이 이메일 출력

public class OverloadingExample {

    public static void printInfo(String name) {
        name = "JINI";
        System.out.println("이름은" + name + "입니다");
    }

    public static void printInfo(String name, int age) {
        name = "Jini";
        age = 28;
        System.out.println("이름은" + name + "이고, 나이는 " + age + "입니다. ");

    }

    public static void printInfo(String name, int age, String email) {
        name = "Jini";
        age = 28;
        email = "jinibrighteveryday@gmail.com";
        System.out.println("이름은" + name + "이고, 나이는 " + age + "이며, 이메일은 " + email + "입니다. ");


    }




    public static void main(String[] args) {
        printInfo("JINI");
        printInfo("JINI", 28);
        printInfo("JINI", 28, "jinibrighteveryday@gmail.com");
    }
}
