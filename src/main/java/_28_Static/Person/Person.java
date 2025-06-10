package _28_Static.Person;

public class Person {

    public static int population = 0;
    public String name;

    public Person(String name) {
        System.out.println("현재 인구 수: " + population);
        // population에는 static이 붙었으므로 객체를 생성하지 않는다
        this.name = name;
        population++;
        System.out.println("객체 생성");
    }

     public void sayHello() {
         System.out.println("안녕하세요, 저는 " + name + "입니다.");
     }

     public static void showPopulation() {
         System.out.println("전체 인구 수 " + population);
     }


}