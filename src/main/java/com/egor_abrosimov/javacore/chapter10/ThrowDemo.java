package main.java.com.egor_abrosimov.javacore.chapter10;

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            demoproc();
        }
        catch (NullPointerException e){
            System.out.println("Исключение перехвачено в методе main " + e);
        }
    }

    static void demoproc(){
        try{
            throw new NullPointerException("демонстрация");
        }
        catch (NullPointerException e){
            System.out.println("Исключение перехвачено в методе demoproc " + e);
            System.out.println("Пробрасываем выше");
            throw e;
        }
    }
}
