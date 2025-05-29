package _21_Class.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.address); // 접근이 가능한지 불가능한지 봅시다
    }
}
