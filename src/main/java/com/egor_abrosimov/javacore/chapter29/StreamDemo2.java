package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(){{
          add(7);
          add(18);
          add(10);
          add(24);
          add(17);
          add(5);
        }};

        Optional<Integer> productObj = myList.stream().reduce((a, b) -> a * b);
        if(productObj.isPresent())
            System.out.println("Произведение в виде объекта типа Optional: " + productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Произведение в виде значения типа int: " + product);
    }
}
