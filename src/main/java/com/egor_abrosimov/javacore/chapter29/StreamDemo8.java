package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
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

        Iterator<String> itr = myStream.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
