package _21_Class.OOP;

import _21_Class.Person.Person;

public class OOP {
    Person person = new Person();

    public static void main(String[] args) {
        // OOP란 => Objected Oriented Programming
        // 객체 지향 프로그래밍
        // 현실 세계의 개념을 코드로 표현한 것
        // 사람, 동물, 자동차 하나의 객체로 보는 것
        // 상태 (속성)과 동작(기능)을 중심으로 프로그래밍하는 것

        // OOP의 4가지 원칙
        // 1. 추상화
        // - 복잡한 내부 동작은 감추고, 꼭 필요한 기능만을 보여주는 것
        // 2. 캡슐화
        // 정보은닉의 문제를 방지하기 위함
        // 데이터 (변수)를 보호하고, 접근을 제한하여 안정성을 높이는 것 (정보은닉)
        // 3. 상속
        // 4. 다형성

        Person person = new Person();
        System.out.println(person.name);
//        System.out.println(person.age); // 다른 패키지이므로 접근을 할 수 없다
//        System.out.println(person.address); //같은 패키지에서만 접근이 가능하다


        // 접근제어자
        // public - 어디서든 접근이 가능하다
        // default - 같은 패키지에서만 접근이 가능하다 (명시를 따로 하지 않으면 그게 default)
        // protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
        // private - 해당 클래스 내부에서만 접근이 가능하다
        //

    }
}
