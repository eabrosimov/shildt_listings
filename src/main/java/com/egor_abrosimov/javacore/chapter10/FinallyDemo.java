package main.java.com.egor_abrosimov.javacore.chapter10;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            procA();
        }
        catch (Exception e){
            System.out.println("Исключение перехвачено");
        }

        procB();
        procC();
    }

    static void procA(){
        try {
            System.out.println("В теле метода procA");
            throw new RuntimeException("демонстрация");
        }
        finally {
            System.out.println("Блок оператора finally в метода procA");
        }
    }

    static void procB(){
        try {
            System.out.println("В теле метода procB");
            return;
        }
        finally {
            System.out.println("Блок оператора finally в метода procB");
        }
    }

    static void procC(){
        try {
            System.out.println("В теле метода procB");
        }
        finally {
            System.out.println("Блок оператора finally в метода procC");
        }
    }


}
