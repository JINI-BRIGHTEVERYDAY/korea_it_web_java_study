package _21_Class.Student;

// Student라는 패키지 만들고, 안에 Student와 StudentMain이라는 클래스 만들기
// 이름, 나이, 이메일, 주소 변수 만들고
// 메소드 showInfo() =>  정보 출력
// StudentMain에서 객체 생성 후에 여러분 정보 대입(주소 대충)
// ShowInfo() 호출해서 정보출력

public class Student {

        private String name;
        private int age;
        private String email;
        private String address;

    // private 일때 값을 넣는 방법
    // 1. 생성자
    // 2. setter
//    Student(String name, int age, String email, String address) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.address = address;
//

// Alt Insert => Constructor 클릭하여 다 불러오기
// 찾지 않아도 알아서 생성자 불러오기 가능
    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    // 2. setter
    // Alt Insert setter 클릭하여 불러오기
    // 이런 기능 있을 때는 알고 써야 함

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // setter는 메소드를 거쳐서 클래스 안에서 접근함


    //getter


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

// 메소드가 대신 접근을 해준다.

    public void showInfo() {
            System.out.println("이름은" + name);
            System.out.println("나이는" + age);
            System.out.println("이메일은" + email);
            System.out.println("주소는" + address);
        }


}
