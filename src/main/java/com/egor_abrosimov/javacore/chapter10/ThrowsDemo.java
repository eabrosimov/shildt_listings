package main.java.com.egor_abrosimov.javacore.chapter10;

public class ThrowsDemo {
    public static void main(String[] args){
        try {
            throwOne();
        }
        catch (IllegalAccessException e) {
            System.out.println("Перехвачено ислючение " + e);
        }
    }

    static void throwOne() throws IllegalAccessException{
        System.out.println("В теле метода throwOne");
        throw new IllegalAccessException("демонстрация");
    }
}
