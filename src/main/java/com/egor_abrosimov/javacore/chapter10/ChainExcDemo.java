package main.java.com.egor_abrosimov.javacore.chapter10;

public class ChainExcDemo {
    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch (NullPointerException e){
            System.out.println("Перехвачено исключение " + e);
            System.out.println("Первопричина " + e.getCause());
        }
    }

    static void demoproc(){
        NullPointerException e = new NullPointerException("Верхний уровень");
        e.initCause(new ArithmeticException("Причина"));
        throw  e;
    }
}
