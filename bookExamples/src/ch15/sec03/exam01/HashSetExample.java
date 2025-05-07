package ch15.sec03.exam01;

import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        //객체저장
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        //저장된객체수출력
        int size = set.size();
        System.out.println("총객체수: " + size);
    }
}

// 출력 결과: 총객체수: 4