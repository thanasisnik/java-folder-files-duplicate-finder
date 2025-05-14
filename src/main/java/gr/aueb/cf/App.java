package gr.aueb.cf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Path folder = Path.of("C:/Users/Thana/Desktop/testDup");

        DuplicateFinder finder = new DuplicateFinder();
        finder.findDuplicates(folder).forEach((hash, paths) -> {
            System.out.println("Duplicate files with hash: " + hash);
            paths.forEach(System.out::println);
        });


        System.out.println("Hello World!");
    }
}
