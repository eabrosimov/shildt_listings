package main.java.com.egor_abrosimov.javacore.chapter10;

public class NestTry {
    public static void main(String[] args) {
        try{
            //args[0] = "Hello"; почему-то не работает
            int a = args.length;
            //a = 1;
            int b = 42 / a;

            System.out.println("a = " + a);

            try{
                if(a == 1)
                    a = a / (a - a);
                if(a == 2){
                    int c[] = {1};
                    c[42] = 99;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Выход за границы массива " + e);
            }
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль " + e);
        }
    }
}
