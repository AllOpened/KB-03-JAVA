package ch09.sec07.exam01;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        // 익명 자식 객체가 대입된 필드 사용
        car.run1();

        // 익명 자식 객체가 대입된 로컬변수 사용
        car.run2();

        car.run3(new Tire(){
           @Override
           public void roll() {
               System.out.println("매개변수로 이용된 익명 자식이 구릅니다.");
           }
        });
    }
}
