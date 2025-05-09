package ch08.sec04;

public class Radio implements RemoteControl {
    int volume;
    @Override
    public void turnOn() {
        System.out.println("라디오를 켭니다.");
    }

    public void turnOff() {
        System.out.println("라디오를 끕니다.");
    }

    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
        System.out.println("현재 라디오 볼륨 : " + this.volume);
    }

}
