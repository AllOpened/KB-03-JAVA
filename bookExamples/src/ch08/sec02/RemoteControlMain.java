package ch08.sec02;

public class RemoteControlMain {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn(); // Tv를 켭니다. 출력

        rc = new Radio();
        rc.turnOn(); // 라디오를 켭니다. 출력
    }
}
