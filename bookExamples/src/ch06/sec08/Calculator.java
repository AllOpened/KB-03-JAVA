package ch06.sec08;

public class Calculator {
    int sum (int ... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}
