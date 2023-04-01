package main.java.com.egor_abrosimov.javacore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d;
        int a;

        try{
            d = 0;
            a = 42 / d;
            System.out.println("А почему он, а не я????");
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль. Мы все умрём");
        }
        System.out.println("А нет, мы будем жить");
    }
}
