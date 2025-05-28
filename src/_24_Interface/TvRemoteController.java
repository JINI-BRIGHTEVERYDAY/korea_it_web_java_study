package _24_interface;

// 리모컨에 부품 결합하기
public class TvRemoteController {

    // 멤버 변수 선언
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeUpButton volumeUpButton;
    private VolumeDownButton volumeDownButton;

    public TvRemoteController(
            PowerButton powerButton,
            ChannelDownButton channelDownButton,
            ChannelUpButton channelUpButton,
            VolumeUpButton volumeUpButton,
            VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeUpButton = volumeUpButton;
        this.volumeDownButton = volumeDownButton;
    }

    public void onPressedPowerButton() {
        System.out.print("TV의");
        powerButton.onPressed();
    }

    public void onPressedChannelUpButton() {
        System.out.println("TV의 ");
        channelUpButton.onPressed();
    }

    public void onUpChannelUpButton() {
        System.out.println("TV의 ");
        channelUpButton.onUp();
    }

    public void onPressedChannelDownButton() {
        System.out.println("TV의 ");
        channelDownButton.onDown();
    }

    public void onDownChannelDownButton() {
        System.out.println("TV의 ");
        channelDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        System.out.println("TV의 ");
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton() {
        System.out.println("TV의 ");
        volumeUpButton.onUp();
    }

    public void onDownVolumeDownButton() {
        System.out.println("TV의 ");
        volumeDownButton.onDown();
    }

    public void onPressedVolumeDownButton() {
        System.out.println("TV의 ");
        volumeDownButton.onPressed();
    }

}
