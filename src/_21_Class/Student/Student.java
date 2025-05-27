package _21_Class.Student;

// Student라는 패키지 만들고, 안에 Student와 StudentMain이라는 클래스 만들기
// 이름, 나이, 이메일, 주소 변수 만들고
// 메소드 showInfo() =>  정보 출력
// StudentMain에서 객체 생성 후에 여러분 정보 대입(주소 대충)
// ShowInfo() 호출해서 정보출력

/*
* 1. public class Student와 StudentMain을 먼저 만들기
* 2. Class Student 안에 속성을 만들기 -> String name, int age...
* 3. 메소드 showInfo 만들고 출력하기 -> System.out.println("이름은 " + name);...
* 4. 그 다음 메인 StudentMain으로 가기
*
*
* */

public class Student { // 속성을 먼저 만들기
    private String name;
    // Private 변수를 걸어놓으면 해당 클래스 안에서만 접근이 가능함
    private int age;
    private String email;
    private String address;


    // private일 때 값을 넣는 방법은?
    // 1. 생성자를 만들어서 애초에 객체 생성할 때 바로 넣게끔
    // 2. setter
//    Student(String name, int age, String email, String address) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.address = address;
//    } 이렇게 입력하는 법


    // alt insult로 constructor 불러오기
    // 1. 생성자
    public Student(String name, int age, String email, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    // 2. setter -> setter라는 메소드를 통해서 클래스의 속성에 접근하기
    // alt insult로 setter 불러오기

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

    // getter


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


    public void showInfo() { // 메소드로 출력
        System.out.println("이름은 " + name);
        System.out.println("나이는 " + age);
        System.out.println("이메일은 " + email);
        System.out.println("주소는 " + address);

    }

}
