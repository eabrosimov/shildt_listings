package main.java.com.egor_abrosimov.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to cone to the aid of their country\n" +
                " and pay their due taxes.";

        char buf[] = new char[source.length()];
        source.getChars(0, source.length(), buf, 0);

        try(FileWriter f0 = new FileWriter("file1.txt");
            FileWriter f1 = new FileWriter("file2.txt");
            FileWriter f2 = new FileWriter("file3.txt"))
        {
            for (int i = 0; i < buf.length; i += 2)
                f0.write(buf[i]);

            f1.write(buf);

            f2.write(buf, buf.length - buf.length/4, buf.length/4);

        } catch (IOException e){
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
