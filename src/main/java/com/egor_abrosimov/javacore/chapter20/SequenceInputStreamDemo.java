package main.java.com.egor_abrosimov.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>(){{
            addElement("file1.txt");
            addElement("file2.txt");
            addElement("file3.txt");
        }};

        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);

        try {
            while((c = input.read()) != -1)
                System.out.println((char) c);
        } catch (NullPointerException e){
            System.out.println("Ошибка открытия файла");
        } catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            try{
                input.close();
            } catch (IOException e){
                System.out.println("Ошибка закрытия потока ввода SequenceInputStream");
            }
        }
    }
}

class InputStreamEnumerator implements Enumeration<FileInputStream>{
    private Enumeration<String> files;

    public InputStreamEnumerator(Vector<String> files){
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try{
            return new FileInputStream(files.nextElement().toString());
        } catch(IOException e) {
            return null;
        }
    }
}
