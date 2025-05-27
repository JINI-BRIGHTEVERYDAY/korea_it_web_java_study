package _22_Inheritance;

/*
* super는 부모에게 접근할 수 있는 키워드
* 자식클래스에서 "부모님 기능 또는 속성" 접근할 때 쓰는 것
* super 키워드의 두 가지 사용 방식이 존재
*
* 1. super() : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 아무런 값이 없다
* 그러나 매개변수 생성자라면 () 매개변수가 포함되는 것이다
*
* 2. super.메소드() 또는 super.필드명(멤버변수) : 부모클래스의 메소드 또는 멤버변수에 접근
* */

public class Tiger extends Animal {
    // public class Tiger 자식클래스 extends Animal 부모클래스
    // Animal에게 상속 받아서 Animal이 가지고 있는 속성과 메소드를 그대로 받음
    // Animal은 부모클래스(슈퍼클래스), Tiger는 자식클래스(서브클래스)
    // 이때, 부모클래스에는 없는 속성을 따로 추가할 수 있다.

    // 멤버변수
    private boolean isStriped;

    // Animalage와 AnimalName도 같이 가지고 있음, 왜냐하면 Animal을 상속받기 때문


    // 생성자 만들기

    // 아무런 매개변수 받지 않음, 기본 생성자
    public Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객체 생성");
    }


    // 매개변수 받고
    public Tiger(String animalName, int animalAge, boolean isStriped) {
        // 매개변수 받았으면 이제 무엇을 호출할 것인지가 나와야 함

        super(animalName, animalAge);
        // 부모클래스에 있는 것을 호출할 것, 속성값을 넣어준 것
        this.isStriped = isStriped; // this 사용
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성");
    }

    public boolean isStriped() {

        return isStriped;
    }

    public void setStriped(boolean striped) {

        isStriped = striped;
    }




    // 상속 관계에서 자식 클래스가 부모 클래스의 메서드를 재정의함
    // 부모로부터 물려받은 메소드를 자식이 '다르게' 실행하도록 바꾸는 것
    // 부모 클래스의 메서드를 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의함
    //

    /*
    * 상속 관계에서 자식 클래스가 부모 클래스의 메소드를 재정의하기
    * 부모로부터 물려받은 메소드를 자식이 "다르게" 실행하도록 바꾸는 것
    * 부모클래스의 메소드를 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의하기
    *
    * */


    @Override
    public void move() {
        super.move();
        System.out.println(getAnlmalName() + "가 움직입니다.");
    }


    public void hunt() {
        System.out.println(getAnimalName() + "가 사냥을 합니다.");
        // 왜 super를 안쓰나
        // 상속과 메소드에서는 탐색의 순서가 있는데
        // 자식 클래스에서 해당 메소드가 없다면 부모클래스에서 찾게 된다
    }

}
