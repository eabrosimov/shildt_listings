package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>(){{
            add(7.0);
            add(18.0);
            add(10.0);
            add(24.0);
            add(17.0);
            add(5.0);
        }};

        Stream<Double> sqrtRootStrm = myList.stream().map(a -> Math.sqrt(a));

        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println("Произведение квадратных корней равно " + productOfSqrRoots);
    }
}
