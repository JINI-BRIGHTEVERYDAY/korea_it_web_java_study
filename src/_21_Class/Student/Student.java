package _21_Class.Student;

// Student라는 패키지 만들고, 안에 Student와 StudentMain이라는 클래스 만들기
// 이름, 나이, 이메일, 주소 변수 만들고
// 메소드 showInfo() =>  정보 출력
// StudentMain에서 객체 생성 후에 여러분 정보 대입(주소 대충)
// ShowInfo() 호출해서 정보출력

public class Student {

        String name;
        int age;
        String email;
        String address;

        public void showInfo() {
            System.out.println("이름은" + name);
            System.out.println("나이는" + age);
            System.out.println("이메일은" + email);
            System.out.println("주소는" + address);
        }


}
