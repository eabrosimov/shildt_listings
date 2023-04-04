package main.java.com.egor_abrosimov.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream fot = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){
            for (int i = 0; i < 26; i++) {
                fot.write((byte) ('a' + i));
            }
        } catch (InvalidPathException e){
            System.out.println("Ошибка указания пути" + e);
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
