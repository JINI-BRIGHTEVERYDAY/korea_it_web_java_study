package _24_Interface;

public class ChannelDownButton extends Button{

    @Override
    public void onUp() {
        System.out.println("채널을 계속 내립니다.");
    }

    @Override
    public void onPressed() {
        System.out.println("채널을 한칸 올립니다.");
    }
}

