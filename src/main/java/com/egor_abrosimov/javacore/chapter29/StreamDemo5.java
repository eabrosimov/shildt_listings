package main.java.com.egor_abrosimov.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>(){{
           add(new NamePhoneEmail("Egor", "555-5555", "egor@mail.com"));
           add(new NamePhoneEmail("Marina", "555-4444", "marina@mail.com"));
           add(new NamePhoneEmail("Galina", "555-3333", "galina@mail.com"));
        }};

        System.out.println("Исходные элементы из списка myList: " );
        myList.stream().forEach(a -> System.out.println(a.name + " " + a.phonenum + " " + a.email));
        System.out.println();

        Stream<NamePhone> stream = myList.stream().map(a -> new NamePhone(a.name, a.phonenum));
        System.out.println("Список имен и номеров телефонов: ");
        stream.forEach(a -> System.out.println(a.name + " " + a.phonenum));
    }
}

class NamePhoneEmail{
    String name;
    String phonenum;
    String email;

    public NamePhoneEmail(String name, String phonenum, String email) {
        this.name = name;
        this.phonenum = phonenum;
        this.email = email;
    }
}

class NamePhone{
    String name;
    String phonenum;

    public NamePhone(String name, String phonenum) {
        this.name = name;
        this.phonenum = phonenum;
    }
}
