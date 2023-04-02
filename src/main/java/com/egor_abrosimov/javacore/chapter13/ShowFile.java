package main.java.com.egor_abrosimov.javacore.chapter13;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        if(args.length != 1){
            System.out.println("Использование: ShowFile TEXT.txt");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]);){

            do {
                i = fin.read();
                if(i != -1)
                    System.out.println((char) i);

            } while (i != -1);
        }
        catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }

    }
}
