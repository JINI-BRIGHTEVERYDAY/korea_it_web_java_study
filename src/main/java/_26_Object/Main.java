package _26_Object;

public class Main {
    public static void main(String[] args) {
        // 모든 클래스는 object를 상속받고 있음
        // Object
        Teacher teacher1 = new Teacher("JINI", "코리아학교");
        Teacher teacher2 = new Teacher("홍길동", "하버드");
        System.out.println(teacher1);
        //System.out.println(teacher1.toString());
        //System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));

    }
}
