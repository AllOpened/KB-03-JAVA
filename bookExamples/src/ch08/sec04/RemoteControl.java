package ch08.sec04;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // public 추상 메서드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
