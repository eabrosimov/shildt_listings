package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>(){{
           add(7.0);
           add(18.0);
           add(10.0);
           add(24.0);
           add(17.0);
           add(5.0);
        }};

        double productSqrRoots = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b), (a, b) -> a * b);
        System.out.println("Произведение квадратных корей: " + productSqrRoots);
    }
}
