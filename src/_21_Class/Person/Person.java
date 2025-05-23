package _21_Class.Person;
// 접근제어자
// public - 어디서든 접근이 가능하다
// default - 같은 패키지에서만 접근이 가능하다 (명시를 따로 하지 않으면 그게 default)
// protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
// private - 해당 클래스 내부에서만 접근이 가능하다
//
public class Person {
    public String name; // 어디서든 접근 가능
    protected int age;  // 같은 패키지 또는 자식 클래스에서만 접근 가능
    String address; // 같은 패키지에서만 접근이 가능하다 (명시를 따로 하지 않으면 그게 default)
    private String id; // 해당 클래스 내부에서만 접근이 가능하다



}
