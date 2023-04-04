package main.java.com.egor_abrosimov.javacore.chapter22;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("https://vk.com/audios754400291");

        System.out.println("Протокол: " + hp.getProtocol());
        System.out.println("Порт: " + hp.getPort());

        System.out.println("Хост: " + hp.getHost());
        System.out.println("Файл: " + hp.getFile());
        System.out.println("Полная форма: " + hp.toExternalForm());

        URLConnection c = hp.openConnection();
        System.out.println(c.getContentLength());
        System.out.println(c.getContentType());
        System.out.println(c.getDate());
        System.out.println(c.getExpiration());
    }
}
