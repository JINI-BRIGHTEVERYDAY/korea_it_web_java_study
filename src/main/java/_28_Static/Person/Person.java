package _28_Static.Person;

public class Person {

    public static int population = 0;
    public String name;

    public Person(String name) {
        this.name = name;
        population++;
    }

    public void SayHello() {
        System.out.println("안녕하세요, 저는" + name + " 입니다.");
    }

    public static void showPopulation

}
