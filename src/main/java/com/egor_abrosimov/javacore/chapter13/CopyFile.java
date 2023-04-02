package main.java.com.egor_abrosimov.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;

        if(args.length != 2){
            System.out.println("Использование: CopyFile из FIRST.txt в SECOND.txt");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fot = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if(i != -1)
                    fot.write(i);

            } while (i != -1);
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
