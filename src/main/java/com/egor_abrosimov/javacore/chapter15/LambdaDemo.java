package main.java.com.egor_abrosimov.javacore.chapter15;

public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;

        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Ещё одно лучайное значение: " + myNum.getValue());

        //myNum = () -> "123.03";
    }
}

interface MyNumber{
    double getValue();
}
