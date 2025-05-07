package ch06.sec10;

public class Calculator {
    static double pi = 3.14;

    static double circumference (int radius) {
        return 2 * pi * radius;
    }

    static double area (int radius) {
        return pi * radius * radius;
    }
}
