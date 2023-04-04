package main.java.com.egor_abrosimov.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path filename) throws IOException {
                if(Files.isWritable(filename))
                    return true;
                return false;
            }
        };

        try (DirectoryStream<Path> dirstrm = Files.newDirectoryStream(Paths.get(dirname), how)){
            System.out.println("Каталог " + dirname);
            for(Path entry: dirstrm){
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if(attributes.isDirectory())
                    System.out.print("<DIR>");
                else
                    System.out.println("      ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e){
            System.out.println(e);
        } catch (NotDirectoryException e){
            System.out.println(e);
        } catch (IOException e){
            System.out.println(e);
        }
    }
}
