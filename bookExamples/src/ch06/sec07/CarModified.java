package ch06.sec07;

public class CarModified {
    // 필드 선언
    String company;
    String model;
    String color;
    int maxSpeed;

    // 생성자 선언 (오버로딩)
    CarModified() {}

    CarModified(String model){
        this(model, "black", 200);
    }

    CarModified(String model, String color){
        this(model, color, 200);
    }

    CarModified(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
