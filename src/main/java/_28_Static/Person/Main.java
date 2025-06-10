package _28_Static.Person;

public class Main {
    public static void main(String[] args) {
        //Person에 대한 객체 생성, 매개변수에는 이름을 넣도록 되어 있으므로 이름을 문자열 형태로 넣기
        Person person1 = new Person("홍길동");
        Person person2 = new Person("김춘향");

        person1.sayHello(); //인스턴스 메소드
        person2.sayHello();

        // Static에 메서드에 대해서는 각각도 가능하고 클래스 전체에 대해서도 호출이 가능하다
        Person.showPopulation(); //클래스 메소드

        //person1.showPopulation();
        //person1.showPopulation();
    }
}
