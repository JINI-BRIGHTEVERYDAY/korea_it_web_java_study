package _24_Interface;

public class TvRemoteController {

    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton, VolumeDownButton volumeDownButton, VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;

    }

    public void onPressedPowerButton() {
        System.out.print("TV의");
        powerButton.onPressed();

    }

    public void onPressedChannelUpButton() {
        System.out.println("TV의 ");
        channelDownButton.onPressed();
    }



}
