package _28_Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(KoreaItStudent.static_curriculum);
        // 객체 생성이 필요없다

        KoreaItStudent koreaItStudent = new KoreaItStudent("JINI", 28);
        System.out.println(koreaItStudent.getStatic());
        // 객체 생성이 필요

        // 클래스 수준(인스턴스 수준이 아니라)에서 변수를 정의하거나 메서드를 선언할 때 사용된다
        // static으로 선언된 변수나 메서드는 클래스의 인스턴스에 속하지 않음
        // 클래스 자체에 속하게 된다
        // 이는 인스턴스를 생성하지 않고 접근이 가능하다
        // 이런 점에서 인스턴스 변수나 메서드와 차이가 있다.
        // 특징
        // 클래스 수준의 변수 및 메소드 - static 변수와 메소드는 클래스 로드 시 메모리에 할당된다
        // 공유가 가능하다 - 모든 인스턴스가 동일한 static 변수에 접근한다, 따라서 데이터를 공유하거나 상태를 저장할 때 유용하다



    }
}
