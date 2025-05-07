package ch06.sec08;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1, 2, 3)); // 6
        System.out.println(calc.sum(1, 2, 3, 4, 5)); // 15

        System.out.println(calc.sum(new int[] {1, 2, 3, 4, 5})); // 15
    }
}
