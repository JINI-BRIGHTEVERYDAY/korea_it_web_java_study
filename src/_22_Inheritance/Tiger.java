package _22_Inheritance;

/*
*  super는 부모에게 접근할 수 있는 키워드
* 자식클래스에서 "부모님 기능 또는 속성" 접근할 때 쓰는 것
* super 키워드의 두 가지 사용원칙 존재
* 1. super() : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 아무런 값이 없다
* 매개변수 생성자라면 () 매개변수가 포함된다
* 2. super.메소드() 또는 super.필드명(멤버변수) : 부모클래스의 메소드 또는 멤버변수에 접근하기
*
* */

// Tiger라는 클래스는 Animal이라는 클래스에게 상속을 받았다
// Animal은 부모클래스, Tiger는 자식클래스가 된다

public class Tiger extends Animal{
    // Animal에게 상속받아서 Animal이 가지고 있는 속성과 메소드를 그대로 받음
    // Animal은 부모클래스(슈퍼클래스), Tiger는 자식클래스(서브클래스)
    // 이때 부모클래스에는 없는 속성을 따로 추가할 수 있다.
    private boolean isstriped;

    public Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객체");
    }

    // noArgsConstructor

    // 두 개 다 있는 것 선택하면 Tiger에서는 어떤 것을 선택할지 또 보인다
    // 부모클래스에 있는 것을 선택하면서 자식클래스에 해당되는 것에서 무엇을 선택할 것인지 고르게 함
    public Tiger(String animalName, int animalAge, boolean isstriped) {
        super(animalName, animalAge);
        this.isstriped = isstriped;
        System.out.println("모든 속성값이 부여된 호랑이 객체 생성");
    }

    // allArgsConstructor

    //getter로 처리
    public boolean isIsstriped() {
        return isstriped;
    }

    // setter로 처리
    public void setIsstriped(boolean isstriped) {
        isstriped = isstriped;
        // 굳이 this를 쓸 필요 없다
    }

    // 상속 관계에서 자식 클래스가 부모 클래스의 메소드를 재정의한다
    // 부모로부터 물려받은 메소드를 자식이 '다르게' 실행하도록 바꾸는 것
    // 부모클래스의 메소드를 자식 클래스에서 동일한 이름, 매개변수, 리턴 타입으로 재정의함

    //override를 이용해서 Animal에만 있었던 move에 대한 재정의를 자식클래스인 tiger에 해준다
    @Override
    public void move() { // move는 부모클래스 Animal에서도 있었다
        super.move(); // 부모가 가진 클래스, 재정의하기 전의 것도 출력하기
        System.out.println(getAnimalName() + "가 움직입니다."); // 그대로 쓰지 않고 재정의한다
        // 이렇게 되면, 둘다 출력한다

    }

//`       Animal에서의 정의는

//        public void move() {
//            System.out.println("움직입니다.");
//           }



    public void hunt() {
            System.out.println(getAnimalName() + "가 사냥을 합니다.");
            // super 쓰지 않아도 자식에게 없으면 부모의 클래스에서 받아서 온다
            // 동적바인딩
            // 왜 super를 쓰지 않나?
            // 상속과 메소드에서는 탐색 순서
            // 자식클래스에서 해당 메소드가 없다면, 부모클래스에서 찾느다

        }




}
