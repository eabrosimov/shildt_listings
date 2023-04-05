package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>(){{
            add(new NamePhoneEmail("Egor", "555-5555", "egor@mail.com"));
            add(new NamePhoneEmail("Marina", "555-4444", "marina@mail.com"));
            add(new NamePhoneEmail("Galina", "555-3333", "galina@mail.com"));
        }};

        Stream<NamePhone1> stream = myList.stream().map(a -> new NamePhone1(a.name, a.phonenum));
        List<NamePhone1> npList = stream.collect(Collectors.toList());
        System.out.println("Именя и номера телефонов в списке типа List:");
        for(NamePhone1 e: npList)
            System.out.println(e.name + ": " + e.phonenum);
        System.out.println();

        stream = myList.stream().map(a -> new NamePhone1(a.name, a.phonenum));
        Set<NamePhone1> npSet = stream.collect(Collectors.toSet());
        System.out.println("Именя и номера телефонов в списке типа List:");
        for(NamePhone1 e: npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}

class NamePhoneEmail1{
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail1(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone1 {
    String name;
    String phonenum;

    public NamePhone1(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}