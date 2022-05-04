package tv_and_radio;

public class TV  implements DevicesInterface{
    private int channel ;
    private int volume ;
    private String status;
    private boolean on;


    public TV(int channel,int volume,String status,boolean on) {

        this.channel = channel;
        this.volume = volume;
        this.status = status;
        this.on = false;     //TV is turned off
    }
    public TV(){}

    public boolean enable(){

        on = true;
        return on;
    }
    public boolean disable(){
        return on;
    }
    public int getVolume() {
        return volume;
    }
    @Override
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 0 && newVolumeLevel <=100){
            volume =newVolumeLevel;
        }
    }
    public int getChannel() {
        return channel;
    }

    public void setChannel(int newChannel){
        if (on && newChannel >=1 && newChannel <=120){
            channel =newChannel;
        }
    }

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        if(channel >=1 && channel <=120 ||volume >=1 && volume <=100){
       }
        return status;
    }
}
