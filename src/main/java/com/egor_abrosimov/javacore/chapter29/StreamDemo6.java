package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>(){{
            add(1.1);
            add(3.6);
            add(9.2);
            add(4.7);
            add(12.1);
            add(5.0);
        }};

        System.out.print("Исходные значения из списка myList: ");
        myList.stream().forEach(a -> System.out.print(a + " "));
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.print("Максимально допустимые пределы значений из списка myList:");
        cStrm.forEach(a -> System.out.print(a + " "));
    }
}
