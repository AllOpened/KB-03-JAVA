package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = "홍길동";
        String str3 = new String("홍길동");

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
    }
}
