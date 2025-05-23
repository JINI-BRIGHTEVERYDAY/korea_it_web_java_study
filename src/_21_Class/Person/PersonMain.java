package _21_Class.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); // 어디서든 접근가능
        System.out.println(person.age); //같은 패키지 또는 자식 클래스에서만 접근 가능 -> 따라서 접근가능
        System.out.println(person.address); //같은 패키지에서만 접근이 가능하다 (명시를 따로 하지 않으면 그게 default)
//        System.out.println(person.id); // private 이므로 같은 패키지라도 다른 클래스라면 접근 불가능
    }
}
