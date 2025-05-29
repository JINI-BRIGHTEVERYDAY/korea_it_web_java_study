package _24_Interface;

public class PowerButton extends Button{
// Button이 가지고 있는 기능 전부 다 불러와야 함
// Button에서는 이미 오버라이드 되어있음
// 그러면 오버라이드 된  onPressed부분을 abstract로 바꾸고
// 클래스명도 추상클래스로 바꾸기 -> 왜냐하면 추상메서드 하나라도 있으면 전체가 추상클래스로 정의되어야 하니까


    private boolean status = false; // 버튼의 상태 정의함

    // onPressed를 구현해야 함, 왜냐하면 override에서 추상으로 정의되었기 때문에
    @Override
    public void onPressed() {
        if(status) {
            System.out.println("전원을 끕니다.");
        } else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }


}
