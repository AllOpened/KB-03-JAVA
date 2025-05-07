package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자  수: " + result); }

    public static void main(String[] args) {
        System.out.println("[프로그램  시작]\n");
        printLength("ThisIsJava");
        // data 가 null 이므로 data.length()을 구할 때 NullPointerException 발생
        printLength(null);
        System.out.println("[프로그램  종료]"); }
}