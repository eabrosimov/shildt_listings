package main.java.com.egor_abrosimov.javacore.chapter10;

public class MethNestTry {
    public static void main(String[] args) {
        try{
            int a = args.length;
            //a = 2;
            int b = 42 / a;
            System.out.println("a = " + a);
            nesttry(a);
        }
        catch (ArithmeticException e){
            System.out.println("Деление на ноль " + e);
        }
    }

    static void nesttry(int a){
        try{
            if(a == 1)
                a = a / (a-a);
            if(a == 2){
                int c[] = {1};
                c[42] = 99;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за границы массива " + e);
        }
    }
}
