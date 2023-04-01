package main.java.com.egor_abrosimov.javacore.chapter10;

public class MyException extends Exception{
    private int detail;

    MyException(int a){
        detail = a;
    }

    public String toString(){
        return "MyException [" + detail + "]";
    }
}

class ExceptionDemo{
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }
        catch (MyException e){
            System.out.println("Перехваченое исключение " + e);
        }
    }

    static void compute(int a) throws MyException{
        System.out.println("Вызван метод compute");
        if(a > 10)
            throw new MyException(a);
        System.out.println("Нормальное завершение");
    }
}
