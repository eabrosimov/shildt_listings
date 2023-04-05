package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(){{
            add("Alfa");
            add("Beta");
            add("Gamma");
            add("Delta");
            add("Xi");
            add("Omega");
        }};

        Stream<String> myStream = myList.stream();

        Spliterator<String> itr = myStream.spliterator();

        Spliterator<String> itr2 = itr.trySplit();

        if(itr2 != null){
            System.out.println("Результат выводимый итератором itr2:" );
            itr2.forEachRemaining(System.out::println);
        }

        System.out.println("\nРезультат выводимый итератором itr:" );
        itr.forEachRemaining(System.out::println);
    }
}
