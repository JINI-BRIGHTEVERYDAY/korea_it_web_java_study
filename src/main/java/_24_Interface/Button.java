package _24_Interface;

// extends => 단일 상속 (클래스, 추상클래스)
// implements => 다중 상속 (인터페이스)

public abstract class Button implements Press, Up, Down {

    // 추상메서드로 정의되었는데 구현이 되지 않고 implements만 떠 있을 때는 오류가 뜰 것



    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed(); //무조건 재정의하도록


    @Override
    public void onUp() {

    }

    //ChannelDownButton
    //VolumeUpButton
    //VolumeDownButton

}

