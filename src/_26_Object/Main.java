package _26_Object;

public class Main {
    public static void main(String[] args) {
        // 모든 클래스는 object클래스를 상속받고 있다.

        Teacher teacher1 = new Teacher("지니", "코리아아카데미");
        Teacher teacher2 = new Teacher("홍길동", "하버드");
        System.out.println(teacher1);
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));
    }
}
