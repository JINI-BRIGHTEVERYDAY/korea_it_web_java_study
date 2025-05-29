package _25_Casting.Animal;

public class Main {
    public static void main(String[] args) {
        // 업캐스팅
        // 자식 클래스의 객체를 부모 클래스 타입으로 참조하는 것
        // 즉, 자식 클래스의 인스턴스(객체)를 부모 클래스의 타입의 변수에 저장하는 것
        // Java에서의 업캐스팅은 다형성을 구현하는 핵심적 개념이다
        // -> 업캐스팅이 되어야만 다형성이 구현되었다고 볼 수 있다

        Dog d = new Dog(); // ro
        d.speak();
        d.wagTail();


        // 업캐스팅 (자식 => 부모), 형 변환 명시 안해도 된다
        Animal a = new Dog(); // A a = new B();
        //a는 Animal 타입이지만, 내부적으로는 Dog의 객체가 들어있다
        a.speak();
        //a.wagTail(); // 부모 객체인 animal을 참조하고 있음, 그러므로 에러가 남
        //animal에서는 wagTail이 없다

        // speak가 Dog에도 있고 Animal에도 있지만
        // 그러나 오버라이드된 것을 먼저 불러오게 된다

        /*

        요약!
        *
        * Animal a = new Dog();
        *
        * dog는 자식클래스, Animal이라는 부모클래스로부터 상속받음
        * 업캐스팅으로 부모클래스를 참조하는 변수 a를 만들어냈음
        * 객체로 Dog를 만들었다
        *
        그렇다면? 나는 Dog에 속해있지만, 입고 있는 옷은 Animal이다
        나를 참조할 때는 부모의 것을 먼저 보아야 한다
        Animal에도 있고, Dog에도 있으면? 공통된 메서드가 있다면
        자식클래스에 오버라이드된 메서드가 있다면,
        그 메서드를 호출 했을 때 자식의 것을 호출해야 한다
        왜냐하면 동적 바인딩이라고 해서 메서드를 찾을 때 자식에게서 먼저 찾고
        자식에게서 없으면 부모에게서 찾아야 한다

        * */

        // a.speak(); -> 오버라이드된 자식 메서드를 호출한다
        // a.wagTail(); -> 부모에게서 없기 때문에 호출이 가능하지 않다

        // 호출해야 한다면 ? 가능한 건 다운캐스팅 방법

        ((Dog) a).wagTail();
        // a. wagTail은 안되었지만, Dog 형태로 가능하게 형변환해주기
        // 다운캐스팅 방법 1 (부모 => 자식) 형변환 명시를 해주어야 함
        // 일시적으로 형변환을 함

        // 업캐스팅 방법 2
        Animal a2 = d; // 업캐스팅 방법 2 -> 부모클래스 타입에 자식클래스 대입하기
        a2.speak();

        // 다운캐스팅 2
        Dog d2 = (Dog) a2; // 새로운 변수에 다운캐스팅한 객체를 대입하기
        d2.wagTail();


        // Tiger와 Cat가지 만든 시점
        // 다양한 자식들을 하나의 클래스 타입으로 처리할 수 있음 -> 그러나 이 단계에서는 업캐스팅도
        // 다운캐스팅도 아무것도 하지 않았다

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        Dog[] dogs = {
                dog1,
                dog2,
                dog3
        };

        // dog1~dog3 은 Dog[] 하나로 묶인다
        // dog1~dog3 은 Dog클래스이므로 하나로 묶이는 것은 당연함


        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal tiger = new Tiger();

        Animal[] animals = {
                dog,
                cat,
                tiger
        };

        /*
        * Dog안에 dog객체 들어있고
        * Cat안에 cat객체가 들어있고
        * Tiger안에 tiger객체가 들어있음
        * 참조가 Animal로 되어있을 뿐
        * 객체는 결국 Dog, Cat, Tiger가 다 들어있을뿐
        * 근데 하나의 클래스로 다른 다양한 자식 클래스들을 한번에 관리할 수 있다
        * 이런 배열 형태로 했을 때
        * 배열의 형태를 Animal로 잡아주는 dog,cat,tiger 다 넣을 수 있는
        * 그렇다면 내가 배열을 사용할 때 한 가지의 타입으로 여러 가지의 클래스들을 넣을 수 있을 것
        *
        * 내가 dog,cat,tiger다 넣고 싶은데 모두 클래스가 달라
        * 근데 하나의 배열에 넣고 싶다
        * 그게 가능하지 않다
        * 이렇게 업캐스팅하여 공통점을 부모클래스로 묶어버린다
        * 업캐스팅을 하면 하나의 클래스로 여러 개의 자식들을 관리할 수 있게 된다
        * */

        // 향상된 for문
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
