package tv_and_radio;

public class Radio implements DevicesInterface{
    private int channel ;
    private int volume ;
    private String status;
    private boolean on;


    public Radio(int channel,int volume,String status,boolean on) {

        this.channel = channel;
        this.volume = volume;
        this.status = status;
        this.on = false;     //radio is turned off
    }
    public Radio(){}
    @Override
    public boolean enable() {
        on =true;
        return on ;
    }

    @Override
    public boolean disable() {
        return on;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 0 && newVolumeLevel <=20){
            volume =newVolumeLevel;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int newChannel) {
        if (on && newChannel >=1 && newChannel <=100){
            channel =newChannel;
        }
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String setStatus(String status) {
        if(channel >=1 && channel <=100 ||volume >=1 && volume <=20){
        }
        return status;
    }
}
