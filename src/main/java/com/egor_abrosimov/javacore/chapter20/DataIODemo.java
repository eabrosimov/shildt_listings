package main.java.com.egor_abrosimov.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try(DataOutputStream dot = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dot.writeDouble(98.6);
            dot.writeInt(1000);
            dot.writeBoolean(true);
        } catch (FileNotFoundException e){
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e){
            System.out.printf("Ошибка ввода-вывода: " + e);
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();
            System.out.println("Получаемые значения: " + d + " " + i + " " + b);
        } catch (FileNotFoundException e){
            System.out.println("Нельзя открыть файл ввода");
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
