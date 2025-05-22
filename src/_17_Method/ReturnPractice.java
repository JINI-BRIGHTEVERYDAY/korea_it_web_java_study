package _17_Method;

public class ReturnPractice {
    public static String getName() {
        String name = "홍길동";
        return name;
    }

    public static int getAge(){
        int age = 27;
        return age;
    }

    public static void main(String[] args) {
        // Return 반환값
        // void의 정체가 드러남
        // void는 반환값이 없다

        //getName(); 출력되지 않는다
        System.out.println(getName());
        System.out.println(getAge());

        String myName = getName();
        System.out.println(myName);

        int myAge = getAge();
        System.out.println(getAge());
    }
}
