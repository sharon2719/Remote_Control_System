package tv_and_radio;

public interface DevicesInterface {
    boolean enable();
    boolean disable();
    int getVolume();
    void setVolume(int newVolumeLevel);
    int getChannel();
    void setChannel(int newChannel);
    String getStatus();
    String setStatus(String status);
}
