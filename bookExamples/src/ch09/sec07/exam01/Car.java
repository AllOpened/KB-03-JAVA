package ch09.sec07.exam01;

public class Car {
    private Tire tire1 = new Tire();

    // 필드에 익명 자식 객체
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("필드의 익명 자식 객체에서 구릅니다.");
        }
    };

    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    // 익명 자식이 로컬 변수로
    public void run2() {
        // 메소드 내 익명 자식 객체
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("메소드의 익명 자식 객체에서 구릅니다.");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
