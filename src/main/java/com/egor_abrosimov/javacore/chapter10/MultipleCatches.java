package main.java.com.egor_abrosimov.javacore.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try{
            //args[0] = "Hello"; почему-то работает
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за границы массива " + e);
        }
        System.out.println("После блока catch");
    }
}
