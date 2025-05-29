package _21_Class.Student;

/*
* public class Student { // 속성을 먼저 만들기
    String name;
    int age;
    String email;
    String address;

    public void showInfo() { // 메소드로 출력
        System.out.println("이름은 " + name);
        System.out.println("나이는 " + age);
        System.out.println("이메일은 " + email);
        System.out.println("주소는 " + address);

    }

}
*
* 여기까지 앞서 완료하였다면,
*
* */


public class StudentMain {
    public static void main(String[] args) {
        // setter가 적용되었다면 이 방법으로 모두 다 삽입해야 한다
        Student student = new Student("홍길동", 28, "jinibrighteveryday@gmail.com", "부산 강서구");
            student.setName("윤봉길");

                    // 객체 생성
        // 그러나 여기까지는 빈껍데기에 불과

        // 아래서부터 정의하기
//        student.name = "JINI";
//        student.age = 28;
//        student.email = "jinibrighteveryday@gmail.com";
//        student.address = "부산광역시 강서구..";

//        System.out.println(student.name);
//        -> private로 되어있으므로 접근이 되지 않음
        // getter 사용

        // 이렇게 되면, 객체의 값들을 다 넣어준 것이나 다름없다

        // 그러나 setter가 적용되었다면, 이 방법은 사용할 수 없다

        // 이제 메소드 호출할 차례
        student.showInfo();



    }
}
