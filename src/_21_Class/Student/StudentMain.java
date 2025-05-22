package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {

        // 객체 생성
        Student student = new Student();


        student.name = "JINI";
        student.age = 28;
        student.email = "jinibrighteveryday@gmail.com";
        student.address = "부산 강서구";

//        System.out.println(student.name);
//        System.out.println(student.age);
//        System.out.println(student.email);
//        System.out.println(student.address);

        student.showInfo();


    }
}
