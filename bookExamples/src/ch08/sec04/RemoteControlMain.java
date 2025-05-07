package ch08.sec04;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn(); // Tv를 켭니다. 출력
        rc.turnOff(); // Tv를 끕니다. 출력
        rc.setVolume(3); // 현재 Tv 볼륨 : 3 출력
        rc.setVolume(14); // 현재 Tv 볼륨 : 10 출력

        rc = new Radio();
        rc.turnOn(); // 라디오를 켭니다. 출력
        rc.turnOff(); // 라디오를 끕니다. 출력
        rc.setVolume(5); // 현재 라디오 볼륨 : 5 출력
        rc.setVolume(-3); // 현재 라디오 볼륨 : 0 출력

    }
}
