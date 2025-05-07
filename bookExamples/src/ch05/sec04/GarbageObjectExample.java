package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String car1 = "자동차";
        String car2 = car1;
        car1 = null; // 힙 영역과의 연결을 끊는다.
        System.out.println(car2); // 결과는 자동차
    }
}
